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
-- Table structure for table `lottoresult`
--

DROP TABLE IF EXISTS `lottoresult`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lottoresult` (
  `id` int NOT NULL AUTO_INCREMENT,
  `memberno` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `gunno` varchar(45) DEFAULT NULL,
  `amount` varchar(45) DEFAULT NULL,
  `datetime` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=83 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lottoresult`
--

LOCK TABLES `lottoresult` WRITE;
/*!40000 ALTER TABLE `lottoresult` DISABLE KEYS */;
INSERT INTO `lottoresult` VALUES (1,'A0001','尤里','X001','1','2024年6月21日 上午7:17:46'),(2,'A0001','尤里','X005','1','2024年6月21日 上午7:18:50'),(3,'A0001','尤里','X010','1','2024年6月21日 上午7:19:36'),(4,'A0005','杏奈','X002','1','2024年6月21日 上午9:26:13'),(5,'A0005','杏奈','X006','1','2024年6月21日 上午9:27:24'),(6,'A0005','杏奈','X013','1','2024年6月21日 上午9:28:35'),(7,'A0003','小智','X007','1','2024年6月21日 上午11:43:13'),(8,'A0002','千千','X015','1','2024年6月21日 下午4:04:48'),(9,'A0002','千千','X003','1','2024年6月21日 下午4:05:39'),(10,'A0001','尤里','X005','1','2024年6月23日 下午6:44:26'),(11,'A0006','優奈','X008','1','2024年6月23日 下午7:31:45'),(12,'A0004','優里','X006','1','2024年6月23日 下午8:10:51'),(13,'A0007','Eric','X003','1','2024年6月23日 下午8:26:34'),(14,'A0007','Eric','X001','1','2024年6月23日 下午10:15:52'),(15,'A0007','Eric','X001','1','2024年6月23日 下午10:15:57'),(16,'A0007','Eric','X006','1','2024年6月23日 下午10:16:03'),(17,'A0007','Eric','X012','1','2024年6月23日 下午10:16:08'),(18,'A0007','Eric','X014','1','2024年6月23日 下午10:16:13'),(19,'A0007','Eric','X011','1','2024年6月23日 下午10:16:17'),(20,'A0007','Eric','X014','1','2024年6月23日 下午10:16:21'),(21,'A0007','Eric','X011','1','2024年6月23日 下午10:16:27'),(22,'A0007','Eric','X002','1','2024年6月23日 下午10:16:31'),(23,'A0007','Eric','X005','1','2024年6月23日 下午10:16:34'),(24,'A0007','Eric','X001','1','2024年6月23日 下午10:38:04'),(25,'A0007','Eric','X008','1','2024年6月24日 上午12:27:19'),(26,'A0001','尤里','X005','1','2024年6月24日 上午12:29:30'),(27,'A0007','Eric','X011','1','2024年6月24日 上午12:33:28'),(28,'A0007','Eric','X013','1','2024年6月24日 上午12:41:17'),(29,'A0002','千千','X005','1','2024年6月24日 上午1:13:11'),(30,'A0002','千千','X007','1','2024年6月24日 上午9:08:15'),(31,'A0007','Eric','X014','1','2024年6月24日 上午10:41:16'),(32,'A0010','Eric','X004','1','2024年6月24日 下午1:32:59'),(33,'A0010','Eric','X015','1','2024年6月24日 下午1:40:12'),(34,'A0010','Eric','X004','1','2024年6月24日 下午2:35:01'),(35,'A0010','Eric','X004','1','2024年6月24日 下午2:36:34'),(36,'A0011','薯泥','X006','1','2024年6月24日 下午2:41:02'),(37,'A0012','qoo','X011','1','2024年6月24日 下午3:23:41'),(38,'A0012','qoo','X003','1','2024年6月24日 下午3:23:53'),(39,'A0012','qoo','X013','1','2024年6月24日 下午3:23:58'),(40,'A0012','qoo','X008','1','2024年6月24日 下午3:24:06'),(41,'A0013','miffy','X006','1','2024年6月24日 下午4:49:02'),(42,'A0013','miffy','X003','1','2024年6月24日 下午4:57:11'),(43,'A0013','miffy','X015','1','2024年6月25日 上午1:05:41'),(44,'A0010','Eric','X010','1','2024年6月25日 上午1:14:41'),(45,'A0010','Eric','X011','1','2024年6月25日 上午1:20:53'),(46,'A0010','Eric','X011','1','2024年6月25日 上午1:28:52'),(47,'A0010','Eric','X007','1','2024年6月25日 上午1:31:18'),(48,'A0010','Eric','X015','1','2024年6月25日 上午1:31:22'),(49,'A0010','Eric','X009','1','2024年6月25日 上午1:31:26'),(50,'A0010','Eric','X004','1','2024年6月25日 上午1:34:28'),(51,'A0010','Eric','X015','1','2024年6月25日 上午1:35:07'),(52,'A0010','Eric','X008','1','2024年6月25日 上午9:17:00'),(53,'A0013','miffy','X012','1','2024年6月25日 下午1:30:12'),(54,'A0013','miffy','X003','1','2024年6月25日 下午3:14:05'),(55,'A0013','miffy','X005','1','2024年6月25日 下午3:14:19'),(56,'A0014','bad','X005','1','2024年6月25日 下午6:08:58'),(57,'A0014','bad','X011','1','2024年6月25日 下午6:11:11'),(58,'A0014','bad','X013','1','2024年6月25日 下午8:05:00'),(59,'A0015','f1','X015','1','2024年6月26日 上午9:15:05'),(60,'A0015','f1','X011','1','2024年6月26日 上午9:46:56'),(61,'A0015','f1','X007','1','2024年6月26日 上午9:52:10'),(62,'A0015','f1','X004','1','2024年6月26日 上午9:52:24'),(63,'A0015','f1','X008','1','2024年6月26日 上午9:55:37'),(64,'A0015','f1','X006','1','2024年6月26日 上午10:02:35'),(65,'A0015','f1','X001','1','2024年6月26日 上午10:20:07'),(66,'A0015','f1','X002','1','2024年6月26日 上午11:09:23'),(67,'A0013','miffy','X004','1','2024年6月26日 下午12:08:02'),(68,'A0013','miffy','X008','1','2024年6月26日 下午1:31:07'),(69,'A0016','CC','X012','1','2024年6月26日 下午9:36:43'),(70,'A0016','CC','X006','1','2024年6月27日 下午2:58:31'),(71,'A0017','kk','X007','1','2024年6月28日 下午9:29:36'),(72,'A0017','kk','X004','1','2024年6月28日 下午11:47:34'),(73,'A0017','kk','X013','1','2024年6月28日 下午11:50:35'),(74,'A0017','kk','X008','1','2024年6月29日 上午12:05:06'),(75,'A0017','kk','X005','1','2024年6月29日 下午2:10:36'),(76,'A0017','kk','X014','1','2024年6月29日 下午2:19:01'),(77,'A0010','Eric','X007','1','2024年6月29日 下午7:57:11'),(78,'A0018','cutie','X012','1','2024年6月29日 下午8:01:31'),(79,'A0017','kk','X015','1','2024年6月29日 下午10:04:26'),(80,'A0017','kk','X013','1','2024年6月29日 下午11:39:15'),(81,'A0010','Eric','X005','1','2024年6月30日 下午8:27:50'),(82,'A0020','mouse','X012','1','2024年6月30日 下午8:50:42');
/*!40000 ALTER TABLE `lottoresult` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-01 11:54:45
*/;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-01 11:54:45
