-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: dadosbibliotecarios
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Table structure for table `alunos`
--

DROP TABLE IF EXISTS `alunos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alunos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL,
  `contacto` varchar(45) DEFAULT NULL,
  `residencia` varchar(45) DEFAULT NULL,
  `turno` varchar(45) DEFAULT NULL,
  `Manual_1` varchar(45) DEFAULT NULL,
  `classe_1` varchar(45) DEFAULT NULL,
  `Manual_2` varchar(45) DEFAULT NULL,
  `classe_2` varchar(45) DEFAULT NULL,
  `dataLevanta` varchar(45) DEFAULT NULL,
  `datadevolucao` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alunos`
--

LOCK TABLES `alunos` WRITE;
/*!40000 ALTER TABLE `alunos` DISABLE KEYS */;
INSERT INTO `alunos` VALUES (7,'Antonio joao','M','+258 84 562 5067','Maputo','Laboral','Portugues','8 Classe','null','null','2021-04-12','2021-04-019');
/*!40000 ALTER TABLE `alunos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `manuais`
--

DROP TABLE IF EXISTS `manuais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `manuais` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `classe` varchar(45) DEFAULT NULL,
  `editora` varchar(45) DEFAULT NULL,
  `localizacao` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manuais`
--

LOCK TABLES `manuais` WRITE;
/*!40000 ALTER TABLE `manuais` DISABLE KEYS */;
INSERT INTO `manuais` VALUES (2,'Matematica','9 Classe','LongMan','B'),(3,'Portugues','8 Classe','LongMan','C'),(4,'Fisica','12 Classe','Texto Editores','C'),(5,'Quimica','8 Classe','LongMan','C'),(15,'Geografia','11 Classe','LongMan','B'),(14,'Biologia','12 Classe','LongMan','C'),(16,'Histora','8 Classe','LongMan','B'),(17,'Pecuaria','9 Classe','LongMan','C');
/*!40000 ALTER TABLE `manuais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `manuaisvenda`
--

DROP TABLE IF EXISTS `manuaisvenda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `manuaisvenda` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `classe` varchar(45) DEFAULT NULL,
  `editora` varchar(45) DEFAULT NULL,
  `preco` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manuaisvenda`
--

LOCK TABLES `manuaisvenda` WRITE;
/*!40000 ALTER TABLE `manuaisvenda` DISABLE KEYS */;
INSERT INTO `manuaisvenda` VALUES (9,'Quimica','12 Classe','LongMan','570'),(8,'Portugues','10 Classe','Pural','800'),(6,'Fisica','8 Classe','Pural','500'),(7,'Matematica','9 Classe','Texto Editores','600'),(10,'Biologia','11 Classe','Pural','580');
/*!40000 ALTER TABLE `manuaisvenda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'dadosbibliotecarios'
--

--
-- Dumping routines for database 'dadosbibliotecarios'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-14 16:37:44
