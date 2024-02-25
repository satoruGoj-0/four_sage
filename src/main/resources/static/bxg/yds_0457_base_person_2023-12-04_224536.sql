-- MySQL dump 10.13  Distrib 8.0.35, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: yds_0457
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `base_person`
--

DROP TABLE IF EXISTS `base_person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `base_person` (
  `id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'Primary Key',
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '名字',
  `nation` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '民族',
  `birthday` datetime NOT NULL COMMENT '生日 ',
  `belief` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '政治面貌',
  `marry` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '婚姻状况',
  `create_time` datetime DEFAULT NULL COMMENT 'Create Time',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `base_person`
--

/*!40000 ALTER TABLE `base_person` DISABLE KEYS */;
INSERT INTO `base_person` VALUES ('1','itpva','mqpow','1983-03-31 15:18:32','btiga','sfwlt','2023-12-04 21:35:02'),('10','zvgcj','mvkbo','1986-09-17 14:40:44','bfjnf','lopny','2023-12-04 21:35:02'),('2','mzxtl','kpres','1986-10-20 11:41:09','sbwkv','vixln','2023-12-04 21:35:02'),('3','hxptc','cjfnr','1982-03-15 01:29:07','kuqim','rlves','2023-12-04 21:35:02'),('4','lcgpk','zqiwo','1994-03-16 20:53:03','glvgl','tyvyj','2023-12-04 21:35:02'),('5','hgwbx','wwmvg','1990-02-10 15:56:09','quebb','bynay','2023-12-04 21:35:02'),('6','oklop','khmgd','1972-09-13 16:42:10','untsg','uxppi','2023-12-04 21:35:02'),('7','ergpp','opnkr','2022-12-14 22:34:08','blrie','pxwse','2023-12-04 21:35:02'),('8','nogxp','glbln','2023-02-05 00:57:33','gktpu','rrhes','2023-12-04 21:35:02'),('9','pvqtd','nlkyr','1972-07-08 13:07:06','etksf','enytu','2023-12-04 21:35:02'),('DY001','远东01','汉族','2000-01-01 00:00:00','群众','已婚','2023-12-04 00:00:00');
/*!40000 ALTER TABLE `base_person` ENABLE KEYS */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-04 22:45:38
