DROP TABLE IF EXISTS `cheesr`.`cheese`;

CREATE TABLE `cheesr`.`cheese` (
  `id` INT NOT NULL  AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `description` TEXT NULL,
  `price` DECIMAL(8,2) NOT NULL,
  PRIMARY KEY (`id`));


