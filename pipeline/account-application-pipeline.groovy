pipeline {
    agent any
    tools {
        maven 'maven-3.9.1'
        jdk 'jdk17'
    }
    environment {
        CONTAINER_REGISTRY='fsa23SMITHREGISTRYHOPT22'
        RESOURCE_GROUP='fsa23-infra'
        REPOSITORY='fsa'
        IMAGE_NAME='account-application'
        CLIENT_ID='0dac6449-3d77-469d-bb4d-28ddd9b5bea6'
        CLIENT_SECRET='Dg48Q~BCz0qpF.ip-uztQYckIpfxHnarUoyrKc44'
        TENANT_ID='3590242b-a92d-4bb9-9ff9-eb7a1183f511'
    }

    stages {
        stage('Clean_workspace') {
            steps {
                deleteDir()
            }
        }
        stage('Checkout Scm') {
            steps {
                git branch: 'main', url: 'https://github.com/SimonKovacsp22/fsa-demo-accounts-application.git'
                }
        }
        stage('Setup Env')
        {
            steps {
                script {
                    pom = readMavenPom(file: 'pom.xml')
                    projectVersion = pom.getVersion()
                    env.version = projectVersion
                }
                echo "Building ${version}"
            }
        }
        stage('Build') {
           steps{
            sh 'mvn clean install -U'
           }
        }
        stage('Container build'){
            environment {
               POM_VERSION = sh(script: 'echo ${version} | cut -d\'-\' -f1', , returnStdout: true)
            }
            steps {
                echo "Building ${version} / $POM_VERSION"
                sh 'az login --service-principal -u $CLIENT_ID -p $CLIENT_SECRET -t $TENANT_ID'
                sh 'az acr login --name $CONTAINER_REGISTRY --expose-token'   
                sh 'az acr build --build-arg JAR_FILE=target/*.jar --image $REPOSITORY/$IMAGE_NAME:$POM_VERSION --registry $CONTAINER_REGISTRY --file Dockerfile . '           
                sh 'az acr build --build-arg JAR_FILE=target/*.jar --image $REPOSITORY/$IMAGE_NAME:latest --registry $CONTAINER_REGISTRY --file Dockerfile . '
            }
        }
    }
}