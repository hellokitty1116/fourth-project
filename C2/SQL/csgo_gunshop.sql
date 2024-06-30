CREATE DATABASE  IF NOT EXISTS `csgo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `csgo`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: csgo
-- ------------------------------------------------------
-- Server version	8.0.37

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
-- Table structure for table `gunshop`
--

DROP TABLE IF EXISTS `gunshop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gunshop` (
  `id` int NOT NULL AUTO_INCREMENT,
  `memberno` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `equipmentname` varchar(45) DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `price` int DEFAULT NULL,
  `datetime` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=98 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gunshop`
--

LOCK TABLES `gunshop` WRITE;
/*!40000 ALTER TABLE `gunshop` DISABLE KEYS */;
INSERT INTO `gunshop` VALUES (1,'A0001','尤里','P250',1,500,'2024年6月25日 上午10:59:59'),(2,'A0010','Eric','M4A1-S',1,2250,'2024年6月25日 上午11:01:40'),(3,'A0010','Eric','FAMAS',1,1850,'2024年6月25日 上午11:01:40'),(4,'A0010','Eric','AUG',1,2600,'2024年6月25日 上午11:01:40'),(5,'A0010','Eric','Desert Eagle',1,900,'2024年6月25日 上午11:05:35'),(6,'A0010','Eric','AUG',1,2600,'2024年6月25日 下午1:02:00'),(7,'A0013','miffy','AUG',1,2600,'2024年6月25日 下午1:30:45'),(8,'A0013','miffy','XM1014',1,1600,'2024年6月25日 下午3:14:35'),(9,'A0013','miffy','SCAR-20',1,2400,'2024年6月25日 下午3:14:35'),(10,'A0013','miffy','M4A1-S',1,2250,'2024年6月25日 下午3:14:35'),(11,'A0013','miffy','FAMAS',1,1850,'2024年6月25日 下午3:14:35'),(12,'A0013','miffy','MP5-SD',1,1500,'2024年6月25日 下午3:23:51'),(13,'A0013','miffy','AUG',1,2600,'2024年6月25日 下午4:44:29'),(14,'A0013','miffy','AWP',1,3200,'2024年6月25日 下午4:44:29'),(15,'A0014','bad','XM1014',1,1600,'2024年6月25日 下午6:09:38'),(16,'A0014','bad','AWP',1,3200,'2024年6月25日 下午7:01:13'),(17,'A0014','bad','AUG',1,2600,'2024年6月25日 下午7:02:37'),(18,'A0014','bad','XM1014',1,1600,'2024年6月25日 下午7:11:53'),(19,'A0014','bad','XM1014',1,1600,'2024年6月25日 下午7:15:13'),(20,'A0014','bad','XM1014',1,1600,'2024年6月25日 下午7:15:45'),(21,'A0014','bad','Zeus-x27',1,800,'2024年6月25日 下午7:17:41'),(22,'A0014','bad','R8-Revolver',1,800,'2024年6月25日 下午7:17:41'),(23,'A0014','bad','P250',1,500,'2024年6月25日 下午7:17:41'),(24,'A0014','bad','Desert Eagle',1,900,'2024年6月25日 下午7:17:41'),(25,'A0014','bad','NOVA',1,1200,'2024年6月25日 下午7:17:41'),(26,'A0014','bad','XM1014',1,1600,'2024年6月25日 下午7:17:41'),(27,'A0014','bad','MP5-SD',1,1500,'2024年6月25日 下午7:17:41'),(28,'A0014','bad','P90',1,1350,'2024年6月25日 下午7:17:41'),(29,'A0014','bad','M249',1,1950,'2024年6月25日 下午7:17:41'),(30,'A0014','bad','SCAR-20',1,2400,'2024年6月25日 下午7:17:41'),(31,'A0014','bad','M4A1-S',1,2250,'2024年6月25日 下午7:17:41'),(32,'A0014','bad','FAMAS',1,1850,'2024年6月25日 下午7:17:41'),(33,'A0014','bad','AUG',1,2600,'2024年6月25日 下午7:17:41'),(34,'A0014','bad','AWP',1,3200,'2024年6月25日 下午7:17:41'),(35,'A0014','bad','Zeus-x27',1,800,'2024年6月25日 下午7:21:16'),(36,'A0014','bad','R8-Revolver',1,800,'2024年6月25日 下午7:21:16'),(37,'A0014','bad','P250',1,500,'2024年6月25日 下午7:21:16'),(38,'A0014','bad','Desert Eagle',1,900,'2024年6月25日 下午7:21:16'),(39,'A0014','bad','NOVA',1,1200,'2024年6月25日 下午7:21:16'),(40,'A0014','bad','XM1014',1,1600,'2024年6月25日 下午7:21:16'),(41,'A0014','bad','MP5-SD',1,1500,'2024年6月25日 下午7:21:16'),(42,'A0014','bad','P90',1,1350,'2024年6月25日 下午7:21:16'),(43,'A0014','bad','M249',1,1950,'2024年6月25日 下午7:21:16'),(44,'A0014','bad','SCAR-20',1,2400,'2024年6月25日 下午7:21:16'),(45,'A0014','bad','M4A1-S',1,2250,'2024年6月25日 下午7:21:16'),(46,'A0014','bad','FAMAS',1,1850,'2024年6月25日 下午7:21:16'),(47,'A0014','bad','AUG',1,2600,'2024年6月25日 下午7:21:16'),(48,'A0014','bad','AWP',1,3200,'2024年6月25日 下午7:21:16'),(49,'A0014','bad','Zeus-x27',1,800,'2024年6月25日 下午7:22:22'),(50,'A0014','bad','R8-Revolver',1,800,'2024年6月25日 下午7:22:22'),(51,'A0014','bad','P250',1,500,'2024年6月25日 下午7:22:22'),(52,'A0014','bad','Desert Eagle',1,900,'2024年6月25日 下午7:22:22'),(53,'A0014','bad','NOVA',1,1200,'2024年6月25日 下午7:22:22'),(54,'A0014','bad','XM1014',1,1600,'2024年6月25日 下午7:22:22'),(55,'A0014','bad','MP5-SD',1,1500,'2024年6月25日 下午7:22:22'),(56,'A0014','bad','P90',1,1350,'2024年6月25日 下午7:22:22'),(57,'A0014','bad','M249',1,1950,'2024年6月25日 下午7:22:22'),(58,'A0014','bad','SCAR-20',1,2400,'2024年6月25日 下午7:22:22'),(59,'A0014','bad','M4A1-S',1,2250,'2024年6月25日 下午7:22:23'),(60,'A0014','bad','FAMAS',1,1850,'2024年6月25日 下午7:22:23'),(61,'A0014','bad','AUG',1,2600,'2024年6月25日 下午7:22:23'),(62,'A0014','bad','AWP',1,3200,'2024年6月25日 下午7:22:23'),(63,'A0014','bad','AUG',1,2600,'2024年6月25日 下午7:23:33'),(64,'A0014','bad','Zeus-x27',1,800,'2024年6月25日 下午7:26:40'),(65,'A0014','bad','R8-Revolver',1,800,'2024年6月25日 下午7:26:40'),(66,'A0014','bad','P250',1,500,'2024年6月25日 下午7:26:40'),(67,'A0014','bad','Five-SeveN',1,700,'2024年6月25日 下午7:26:40'),(68,'A0014','bad','Desert Eagle',1,900,'2024年6月25日 下午7:26:40'),(69,'A0014','bad','NOVA',1,1200,'2024年6月25日 下午7:26:40'),(70,'A0014','bad','XM1014',1,1600,'2024年6月25日 下午7:26:40'),(71,'A0014','bad','MP5-SD',1,1500,'2024年6月25日 下午7:26:40'),(72,'A0014','bad','P90',1,1350,'2024年6月25日 下午7:26:40'),(73,'A0014','bad','M249',1,1950,'2024年6月25日 下午7:26:40'),(74,'A0014','bad','SCAR-20',1,2400,'2024年6月25日 下午7:26:41'),(75,'A0014','bad','M4A1-S',1,2250,'2024年6月25日 下午7:26:41'),(76,'A0014','bad','FAMAS',1,1850,'2024年6月25日 下午7:26:41'),(77,'A0014','bad','AUG',1,2600,'2024年6月25日 下午7:26:41'),(78,'A0014','bad','AWP',1,3200,'2024年6月25日 下午7:26:41'),(79,'A0015','f1','AWP',1,3200,'2024年6月26日 上午9:15:26'),(80,'A0015','f1','XM1014',1,1600,'2024年6月26日 上午11:51:18'),(81,'A0015','f1','SCAR-20',1,2400,'2024年6月26日 上午11:51:18'),(82,'A0013','miffy','XM1014',1,1600,'2024年6月26日 下午12:08:14'),(83,'A0013','miffy','FAMAS',1,1850,'2024年6月26日 下午1:31:15'),(84,'A0013','miffy','FAMAS',1,1850,'2024年6月26日 下午2:07:34'),(85,'A0016','CC','AWP',1,3200,'2024年6月26日 下午9:36:59'),(86,'A0017','kk','M4A1-S',1,2250,'2024年6月28日 下午9:29:46'),(87,'A0017','kk','M4A1-S',1,2250,'2024年6月28日 下午11:47:39'),(88,'A0017','kk','AUG',1,2600,'2024年6月28日 下午11:50:52'),(89,'A0017','kk','NOVA',1,1200,'2024年6月29日 上午12:05:28'),(90,'A0017','kk','XM1014',1,1600,'2024年6月29日 上午12:05:28'),(91,'A0017','kk','MP5-SD',1,1500,'2024年6月29日 上午12:05:28'),(92,'A0017','kk','P90',1,1350,'2024年6月29日 上午12:05:28'),(93,'A0017','kk','M4A1-S',1,2250,'2024年6月29日 下午2:10:42'),(94,'A0010','Eric','NOVA',1,1200,'2024年6月29日 下午7:57:16'),(95,'A0018','cutie','SCAR-20',1,2400,'2024年6月29日 下午8:01:41'),(96,'A0017','kk','AUG',1,2600,'2024年6月29日 下午9:38:44'),(97,'A0017','kk','FAMAS',1,1850,'2024年6月29日 下午11:39:26');
/*!40000 ALTER TABLE `gunshop` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-30 20:26:18