-- Valentina Studio --
-- MySQL dump --
-- ---------------------------------------------------------


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
-- ---------------------------------------------------------


-- Dump data of "users" ------------------------------------
BEGIN;

INSERT INTO `users`(`id`,`firstName`,`lastName`,`email`) VALUES 
( '1', 'Anezka', 'Testerska', 'testerskaa@posam.sk' ),
( '2', 'Johny', 'Workshop', 'workshopj@posam.sk' ),
( '3', 'Johny', 'Test', 'testj@posam.sk' ),
( '4', 'Hikari', 'Databazovy', 'hikarid@posam.sk' ),
( '5', 'Jozko', 'Mrkva', 'mrkvaj@posam.sk' ),
( '6', 'Alena', 'Mrkvova', 'mrkvovaa@posam.sk' ),
( '7', 'Patrik', 'Vyhladavac', 'vyhladavacp@posam.sk' ),
( '8', 'Stefan', 'Pracovovnik', 'pracovniks@posam.sk' );
COMMIT;
-- ---------------------------------------------------------


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
-- ---------------------------------------------------------


