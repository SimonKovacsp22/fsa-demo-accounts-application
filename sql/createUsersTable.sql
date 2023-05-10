-- CREATE TABLE "users" ----------------------------------------
CREATE TABLE `users`( 
	`id` Int( 255 ) NOT NULL,
	`firstName` VarChar( 255 ) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
	`lastName` VarChar( 255 ) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
	`email` VarChar( 255 ) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
	CONSTRAINT `id` UNIQUE( `id` ),
	CONSTRAINT `email` UNIQUE( `email` ) )
CHARACTER SET = utf8
COLLATE = utf8_unicode_ci
ENGINE = InnoDB
AUTO_INCREMENT = 3;
-- -------------------------------------------------------------

-- CREATE INDEX "Index_1" --------------------------------------
CREATE INDEX `Index_1` USING BTREE ON `users`( `id` );
-- -------------------------------------------------------------

-- CHANGE "AUTOINCREMENT" OF "FIELD "id" -----------------------
ALTER TABLE `users` MODIFY `id` Int( 255 ) AUTO_INCREMENT NOT NULL;
-- -------------------------------------------------------------
