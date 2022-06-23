CREATE DATABASE  IF NOT EXISTS `supermark_ga05` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `supermark_ga05`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: supermark_ga05
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido` varchar(30) DEFAULT NULL,
  `dni` double unsigned DEFAULT NULL,
  `ID_domicilio` int NOT NULL,
  `edad` int unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comprobante`
--

DROP TABLE IF EXISTS `comprobante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comprobante` (
  `id` int NOT NULL,
  `total` double NOT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `cliente` FOREIGN KEY (`id`) REFERENCES `cliente` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comprobante`
--

LOCK TABLES `comprobante` WRITE;
/*!40000 ALTER TABLE `comprobante` DISABLE KEYS */;
/*!40000 ALTER TABLE `comprobante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle`
--

DROP TABLE IF EXISTS `detalle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalle` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cantidad` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `cliente_de` FOREIGN KEY (`id`) REFERENCES `cliente` (`id`),
  CONSTRAINT `producto_fk` FOREIGN KEY (`id`) REFERENCES `producto` (`id`),
  CONSTRAINT `tipoproducto_fk` FOREIGN KEY (`id`) REFERENCES `tipoproducto` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle`
--

LOCK TABLES `detalle` WRITE;
/*!40000 ALTER TABLE `detalle` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `domicilio`
--

DROP TABLE IF EXISTS `domicilio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `domicilio` (
  `id` int NOT NULL AUTO_INCREMENT,
  `barrio` varchar(30) NOT NULL,
  `calle` varchar(30) NOT NULL,
  `numero` int NOT NULL,
  `piso` int DEFAULT NULL,
  `depNum` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `cliente_dom` FOREIGN KEY (`id`) REFERENCES `cliente` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `domicilio`
--

LOCK TABLES `domicilio` WRITE;
/*!40000 ALTER TABLE `domicilio` DISABLE KEYS */;
/*!40000 ALTER TABLE `domicilio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `factura` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre_Supermar` varchar(7) DEFAULT NULL,
  `cuit` varchar(20) DEFAULT NULL,
  `direccion` int NOT NULL,
  `provincia` varchar(20) DEFAULT NULL,
  `codigoPostal` int NOT NULL,
  `telefono` int NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `comprobante_fc` FOREIGN KEY (`id`) REFERENCES `comprobante` (`id`),
  CONSTRAINT `comprobante_mp` FOREIGN KEY (`id`) REFERENCES `metododepago` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `metododepago`
--

DROP TABLE IF EXISTS `metododepago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `metododepago` (
  `id` int NOT NULL,
  `PagoEfectivo` varchar(50) DEFAULT NULL,
  `PagoTarjeta` varchar(50) DEFAULT NULL,
  `Transferencia` varchar(50) DEFAULT NULL,
  `monto_a_pagar` double NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `cliente_fk` FOREIGN KEY (`id`) REFERENCES `cliente` (`id`),
  CONSTRAINT `metododepago_ibfk_1` FOREIGN KEY (`id`) REFERENCES `cliente` (`id`),
  CONSTRAINT `metododepago_ibfk_2` FOREIGN KEY (`id`) REFERENCES `cliente` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `metododepago`
--

LOCK TABLES `metododepago` WRITE;
/*!40000 ALTER TABLE `metododepago` DISABLE KEYS */;
/*!40000 ALTER TABLE `metododepago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagoefectivo`
--

DROP TABLE IF EXISTS `pagoefectivo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagoefectivo` (
  `id` int NOT NULL,
  `pagoefectivo` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `cliente_id` FOREIGN KEY (`id`) REFERENCES `cliente` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagoefectivo`
--

LOCK TABLES `pagoefectivo` WRITE;
/*!40000 ALTER TABLE `pagoefectivo` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagoefectivo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagotarjeta`
--

DROP TABLE IF EXISTS `pagotarjeta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagotarjeta` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pagotarjeta_debito` varchar(16) DEFAULT NULL,
  `pagotarjeta_credito` varchar(16) DEFAULT NULL,
  `banco_emisor` varchar(50) DEFAULT NULL,
  `numero_tarjeta` int NOT NULL,
  `nombre_tarjeta` varchar(30) DEFAULT NULL,
  `fecha_vencimiento` date NOT NULL,
  `cod_seg` int NOT NULL,
  `cuotas` int NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `cliente_pt` FOREIGN KEY (`id`) REFERENCES `cliente` (`id`),
  CONSTRAINT `monto_a_pagar` FOREIGN KEY (`id`) REFERENCES `metododepago` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagotarjeta`
--

LOCK TABLES `pagotarjeta` WRITE;
/*!40000 ALTER TABLE `pagotarjeta` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagotarjeta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `marca` varchar(50) DEFAULT NULL,
  `f_venc` date NOT NULL,
  `precio` double NOT NULL,
  `stock` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registro`
--

DROP TABLE IF EXISTS `registro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registro` (
  `id` int NOT NULL AUTO_INCREMENT,
  `mail` varchar(30) NOT NULL,
  `contraseña` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `cliente_reg` FOREIGN KEY (`id`) REFERENCES `cliente` (`id`),
  CONSTRAINT `domicilio_reg` FOREIGN KEY (`id`) REFERENCES `domicilio` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registro`
--

LOCK TABLES `registro` WRITE;
/*!40000 ALTER TABLE `registro` DISABLE KEYS */;
/*!40000 ALTER TABLE `registro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tarjetadescuento`
--

DROP TABLE IF EXISTS `tarjetadescuento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tarjetadescuento` (
  `id` int NOT NULL,
  `puntos` int unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `cliente_td` FOREIGN KEY (`id`) REFERENCES `cliente` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tarjetadescuento`
--

LOCK TABLES `tarjetadescuento` WRITE;
/*!40000 ALTER TABLE `tarjetadescuento` DISABLE KEYS */;
/*!40000 ALTER TABLE `tarjetadescuento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoproducto`
--

DROP TABLE IF EXISTS `tipoproducto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipoproducto` (
  `p_limpieza` varchar(50) DEFAULT NULL,
  `p_hig_personal` varchar(50) DEFAULT NULL,
  `perecederos` varchar(50) DEFAULT NULL,
  `no_perecederos` varchar(50) DEFAULT NULL,
  `bebidas` varchar(50) DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoproducto`
--

LOCK TABLES `tipoproducto` WRITE;
/*!40000 ALTER TABLE `tipoproducto` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipoproducto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trasferencia`
--

DROP TABLE IF EXISTS `trasferencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trasferencia` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cvu` int NOT NULL,
  `cbu` int NOT NULL,
  `alias` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `cliente_tr` FOREIGN KEY (`id`) REFERENCES `cliente` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trasferencia`
--

LOCK TABLES `trasferencia` WRITE;
/*!40000 ALTER TABLE `trasferencia` DISABLE KEYS */;
/*!40000 ALTER TABLE `trasferencia` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-23 18:13:48
