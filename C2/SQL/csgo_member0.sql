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
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member` (
  `id` int NOT NULL AUTO_INCREMENT,
  `memberno` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `account` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `nationalid` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `datetime` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (1,'A0001','尤里','curry','rice','rice@gmail.com','m','U123456789','tokyo','212312','2024年6月18日 上午7:17:46'),(2,'A0002','千千','food','good','food@gmail.com','f','A123456789','taipei','970123456','2024年6月18日 上午9:34:28'),(3,'A0003','小智','pokemon','picka','pika@gmail.com','m','B123456789','Hsinchu','0962422451','2024年6月18日 下午1:56:23'),(4,'A0004','優里','ramen','noodle','ramen@gamil.com','m','C123456789','tokyo','9730111','2024年6月18日 下午2:13:41'),(5,'A0005','杏奈','peach','fruit','peach@gamil.com','f','D123456789','tokyo','981231','2024年6月18日 下午2:12:55'),(6,'A0006','優奈','apple','fruit','apple@gamil.com','f','E123456789','fruitshop','927192','2024年6月20日 上午11:34:02'),(9,'A0009','Ricky','cutie','dog','doge@gamil.com','m','K278932893','doghouse','092877833','2024年6月23日 下午6:56:26'),(10,'A0010','Eric','love','curry','kitty@gmail.com','m','N147282823','taipei','0928293238','2024年6月24日 下午1:30:39'),(11,'A0011','薯泥','potato','sweet','sweet@gmail.com','m','K223534642','foodcourt','0968235345','2024年6月24日 下午2:26:06'),(12,'A0012','qoo','qooo','qoo','qoo@gmail.com','m','A111111111','台北','0911111111','2024年6月24日 下午3:21:21'),(13,'A0013','miffy','123','321','123@gmail.com','m','F222222222','taipei','0922222222','2024年6月24日 下午4:47:31'),(14,'A0014','bad','bad','bad','bad@gmail.com','m','E423423423','kaohsiung','0923123123','2024年6月25日 下午6:07:42'),(15,'A0015','f1','f1','f1','f1@gmail.com','m','F231232323','gjun','0934234234','2024年6月26日 上午9:13:46'),(16,'A0016','CC','iramen','ramen','ramen@gamil.com','m','R232312312','taipei','0923123123','2024年6月26日 下午9:35:24'),(17,'A0017','kk','zoo','zoo','zoo@gmail.com','f','Z342423423','taipei','0942343242','2024年6月28日 下午9:28:40'),(18,'A0018','cutie','cute','cute','cutie@gamil.com','f','C231233232','catcoffee','0934234234','2024年6月29日 下午8:00:44'),(19,'A0019','rabbit','hase','hase','rabbit@gmail.com','f','R232423423','rabbithouse','0946457568','2024年6月30日 下午8:47:32'),(20,'A0020','mouse','maus','maus','rat@gmail.com','m','M223423423','tomandjerry','0942342342','2024年6月30日 下午8:49:09');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-01 11:55:09
