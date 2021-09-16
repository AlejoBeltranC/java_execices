SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Contenidos
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Contenidos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Contenidos` DEFAULT CHARACTER SET utf8 ;
USE `Contenidos` ;

-- -----------------------------------------------------
-- Table `Contenidos`.`director`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Contenidos`.`director` (
  `id_director` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `nacionalidad` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_director`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Contenidos`.`pelicula`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Contenidos`.`pelicula` (
  `id_Pelicula` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NOT NULL,
  `resumen` VARCHAR(1300) NOT NULL,
  `ano` VARCHAR(30) NOT NULL,
  `director` VARCHAR(30) NOT NULL,
  `id_peli_director` INT NULL,
  PRIMARY KEY (`id_Pelicula`),
  UNIQUE INDEX `idPelicula_UNIQUE` (`id_Pelicula` ASC) VISIBLE,
  INDEX `id_peli_direct_idx` (`id_peli_director` ASC) VISIBLE,
  CONSTRAINT `id_peli_direct`
    FOREIGN KEY (`id_peli_director`)
    REFERENCES `Contenidos`.`director` (`id_director`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Contenidos`.`serie`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Contenidos`.`serie` (
  `id_serie` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NOT NULL,
  `episodios` VARCHAR(45) NOT NULL,
  `temporadas` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_serie`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Contenidos`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Contenidos`.`usuarios` (
  `user_name` VARCHAR(30) NOT NULL,
  `nombres` VARCHAR(45) NOT NULL,
  `apellidos` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `celular` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`user_name`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Contenidos`.`transmisiones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Contenidos`.`transmisiones` (
  `id_transmisiones` INT NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(30) NOT NULL,
  `pelicula_o_serie` VARCHAR(45) NOT NULL,
  `fecha_y_hora` DATETIME NULL,
  PRIMARY KEY (`id_transmisiones`),
  INDEX `user_name_idx` (`user_name` ASC) VISIBLE,
  CONSTRAINT `user_name`
    FOREIGN KEY (`user_name`)
    REFERENCES `Contenidos`.`usuarios` (`user_name`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
