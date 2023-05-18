-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: hosteldata
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `admin_table`
--

DROP TABLE IF EXISTS `admin_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin_table` (
  `username` varchar(30) DEFAULT NULL,
  `room_num` int DEFAULT NULL,
  `type` varchar(30) DEFAULT NULL,
  `complaint` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_table`
--

LOCK TABLES `admin_table` WRITE;
/*!40000 ALTER TABLE `admin_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cleaning_comp`
--

DROP TABLE IF EXISTS `cleaning_comp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cleaning_comp` (
  `cNo` int NOT NULL AUTO_INCREMENT,
  `username` varchar(30) DEFAULT NULL,
  `room_num` int DEFAULT NULL,
  `type` varchar(30) DEFAULT NULL,
  `complaint` varchar(500) DEFAULT NULL,
  `solution` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`cNo`),
  UNIQUE KEY `cNo_UNIQUE` (`cNo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cleaning_comp`
--

LOCK TABLES `cleaning_comp` WRITE;
/*!40000 ALTER TABLE `cleaning_comp` DISABLE KEYS */;
INSERT INTO `cleaning_comp` VALUES (2,'aa',123,'Corridor','corridor issue',NULL);
/*!40000 ALTER TABLE `cleaning_comp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `password` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `usertype` varchar(20) NOT NULL DEFAULT 'student',
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('abc@1234','admin','admin'),('abc@1234','user1','student');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `management_comp`
--

DROP TABLE IF EXISTS `management_comp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `management_comp` (
  `cNo` int NOT NULL AUTO_INCREMENT,
  `username` varchar(30) DEFAULT NULL,
  `room_num` int DEFAULT NULL,
  `type` varchar(30) DEFAULT NULL,
  `complaint` varchar(500) DEFAULT NULL,
  `solution` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`cNo`),
  UNIQUE KEY `cNo_UNIQUE` (`cNo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `management_comp`
--

LOCK TABLES `management_comp` WRITE;
/*!40000 ALTER TABLE `management_comp` DISABLE KEYS */;
/*!40000 ALTER TABLE `management_comp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `register`
--

DROP TABLE IF EXISTS `register`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `register` (
  `fullname` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `phone` varchar(30) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `picture` blob,
  UNIQUE KEY `username` (`username`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `register`
--

LOCK TABLES `register` WRITE;
/*!40000 ALTER TABLE `register` DISABLE KEYS */;
INSERT INTO `register` VALUES ('admin','admin','youremai2l@gmail.com','abc@1234','9999999999','male',NULL),('temp user','user1','youremai1l@gmail.com','abc@1234','9999999999','Male',_binary '�\��\�\0JFIF\0\0\0\0\0\0�\�\0C\0	\n\n			\n\n		\r\r\n�\�\0C	��\025\"\0�\�\0\0\0\0\0\0\0\0\0\0\0\0\0	�\�\0M\0\0\0!1AQa\"2q�#BR�\�U���	34\�$bt�%CDSr�&d��\�T��\���\�\0\0\0\0\0\0\0\0\0\0\0\0\0�\�\0,\0\0\0\0\0\0!1A\"Q2aq#��3B���\�\0\0\0?\0�DJ_���&��a\�\�\�0Fī\'rO\�}\�G\�y�F�E?\�O�\0���K(p��\�gѯ\�Gp��\�gѯ\�K(�}\�G\�y�F�E\�G\�y�F�E,���	�\�}\Z�w	�\�}\Z���\0G\�$~���k�Q\�$~���k�R\�(p��\�gѯ\�Gp��\�gѯ\�K(�}\�G\�y�F�E\�G\�y�F�E,���	�\�}\Z�w	�\�}\Z���\0G\�$~���k�Q\�$~���k�R\�(p��\�gѯ\�Gp��\�gѯ\�K(�}\�G\�y�F�E\�G\�y�F�E,���	�\�}\Z�w	�\�}\Z���\0G\�$~���k�Q\�$~���k�R\�(p��\�gѯ\�Gp��\�gѯ\�K(�}\�G\�y�F�E\�G\�y�F�E,���	�\�}\Z�w	�\�}\Z���\0G\�$~���k�Q\�$~���k�R\�(���ı�0\�\�\nmH)\n��7|9S#w\�ݣS\�Si�M�.\��\�\�y\�\��n䁴}j��1`�r�:�\0��i�\�\��%W\�d�|\�A��I��u,�\\�f-\�%�]f�\"X*JR��\��>\�Jd\�Z�V��\� �\�1\�\�ix -d�!�w��\�Uv\�es�k�Z�S\\\�͔E\�\��-n����#˙���\�|�A�\�\�׆#A�[RDO�)՞~�\�-\�5c�\�a�j\�[\�:�\�}JR�p#*\�O��\�M\r\�}�^�\�l_�)E\�o��u�YH�\0QVE\�)�}�H\�\'�\0̏�H������\0�#��)eH\�QE\0QE\0QE\0QE\0QE\0QE\0QE\0QE\0QE\0QE\0QE\0QE\0QE\0QE\0QE\0QE�C ��x���J.ɽ\�eϸȓ\�i�2�\nH\�\�\�}j\�=*��\�T\�M�K�\\@�\�Z���\�G\�#����eFR\�\��Fg.<X�K���\"AD&��\'ȯ\�\�QI�5���1�\�\��� \0\����*��7�\�n���`\\\�yOϒ��\�r@>C©\rK�u�\�rL\�]b\�1��\�\�!�H�\�U\�vw�T�6-�8Qmr;ݫjq\��\0\�_�Oʊ=�m\�\�xUo���N��\�{\���\�\�\�@���\�,��\0\�G�$R\�b�{��PN��L\�)2$�-�%!C�I�S\�U��f�\�\�TW̏:�R\0��(\0��(\0��(\0��(\0��(\0��(\0��Q�\�@h��dt\�\0}��d��\�EPEPEPEPEPEP^T��@� \�#�z�mE�4ƔdH\�W\�pFRt%J�����&+\�N�\�ج�\nyu>����\����Ǜ�$]��f\��%N�g-���$\'\�Z�a\�\�Z|\�\�5r�\�\�]\�����XO=�Q�|�8M�\�\�\�m\�ċ�|�\�<S�\�ʇ G��ܞ$���ktN�b\�lD�\�e\�;1)8w\�\�&�a�]�ͻp�\�p�H/\�zT��\�\�\�\0�\0���DX�\�tj\�\�\"�;$ܣ��\�B\�}��\�?��XP\�6�v�mEIq �z�\�^\�w���E2\�p\�Pۅy)V\�\�\�ϖ9�\0�F��.\'\�C\�g�Z]	iK�R\�c�\�-9N�6�ьl\�M��\�_i�F�P~\�\�9!\�.�����=?\�QyY)kEW@(��\0(��\0(��\0(���\0}�����\��\�nLC��N\�VW�I�\�\�m�4����&^f �x�^\�\�_��u�uV��j[�\�z�\��ԢBU�@�!=\0%�Q�{4����\�Rt��r[�g�\n�	��P;���\0%e���A�\0�v��\0uR���\n�\�Z\�\�\0\�\nB��\� c��O\�]��H�W\�\�U�\0z��ޏ��+��b#��`L\�>5���חJ�ܼ�v�\�_[��\�8�~�/iH\�t�\0�_lM���z-q\��\r\\�K^\�\�e\rlӒ�����7�\�+�ɫ����z�j[�x�v\�v�֙*I��Ϻ\�|B��\�\�\�ru$\�\�<\�\�W�z�\�\�-<\�\�\��J�!��Ә\��H9$�!\���(��QEyV\�@���\0(��\0(��\0�y��j\r�.���u\�=9@T�e�������}jUM:�\�5-�u�RV\�g4YS�\�H\�\�d~tQ\�&N��e\�\�vd\�4\�T#�HB\�v\�a<�j�\�/�a\�R\�\��2S\�W\�I$\�\�\�T�b�h�\�$\�\n�iSJe�0��\'#�5\�pi\Z5\�Q��N�\�ȷB\r$�\�\�帑\� UN/��h�Te1�3ji\' ?(�_Y��S�������eNܟa\�0d\�mŲ�\�\'�Q\�~Dg\�4U�\�\�=��_���c)�\n�g����Z:�nE�$wiu�NP\�>�I�I\'E\�\�\�\�t�ښ��\�L%~\�$(NkW?Z]�tn�\�-.>���+\0/�\��哩\�\�\�0�3?�H	\�~4��*İp(��\0(��\0(��\0(��\0*#\�\� [�w��_%��-Cd�u\�=\���aPOS�\�|\�#�\�ZɌ˧�]�J�9䵏�<\��s<��\�\�ڢ\�|�I�^\�L\�޵���H��E\�\�V\�R�ej<ϕs�<eN/�\�L.\�.(�O�[�K\�\�JN7v�=O�|CS%��*�h�*[�\�p<qS�6֚i	 9�tNͥ\�ѿ�C�a>�yAg5\�\�_k\�_*�fBq��\�\�\�\�H<�ER��}�\0Kv@}�D�=k\�y�C�@��˴���*=**#�RR9U�{��\��\�K+��P�p��\�\�\�\�yID\�\���GM\�0+xZ\�Q.�\��(.�#\�i.��r\nHȯ\�\�!JNG�l_d\�\\\�\�HL\�Ҥv��<aG�m]\�Tg<�\�\�袊�\0��(\0��(\0��(\0��(\0��(\0��N\��6)\�Z��\�ֆ�V��s�ӦG�\�`O���\r��\��\�!�qN��\�Jp�����*U\�\����\0\�E%��\�?��v}dt�\��&\\K�+gٜ�n�>\�\�R䚦�u�\�}\�km\�\�>+�������u_�����I\�%#=j�\�ܤ�9$�:QEi\0��(\0��(\0��(\0���@8#>_�\�[�	\�ۍɇfIGt�\�\�/�G\�f�M\�b�{E�(�D�>�hol\r^dj^�eò\n��\0>EJ\��c�\�Y�\\\n��(�\�\\�-�Ē��tխg\�J\�+��c�	\'�)�\��\�e�sQ�O�ݵ�s-���Ot%��>Ul��B9ycՎҦHKD�yS\�upsRH#�\�bM�\�\�\\oQKaG�	�	?,Sr�\Z�\�\���\�m]R\�v�R\�M��\�{x&�FS��\�(>b����g$�Ƙm����-Hd�\�/~�#[\�_�3P-o\'G\�s\�P\�D�4�\���5�J$\�\�Y���\�5�Si�\�a�y�\��\0����k[7$\�\��ր�G\�h�\�sl\\���ER?�\�V^[ʏ)M\�\�V	�D�;�,\�x\������pv���\r[9ee�?��\�5\�0\�^BA\�\\HP��]j(_\n\���񔄾�P\\;Rz�\�\\ݎ\�\�B\�i+RRH\�\r\0t��(\0��(\0��(\�8�j�\�T�$)C 2k\�\�pj�\�]\�\�e���\�n�mJq\�\�+[\0�_�U\\��|�W\r\����	孶�2��2��aE?0*��q�vۛ��c\�I�T\�t�Ғ�pT���j+�x�����l\�\��[��id�\r�.A�Q�\�֤ڏV�>\����\�dC)2#w-\�	\�B� $z\��jb\��GaT�$\\\'�]/�T]\�2\Z~d�\�S�i;Q\�\�\0<�\0z\�Y\�\�\�\�\�ft{R���\�S@\�	H��8\��\"�r��r팲�\�\�y�yi(~<v\'Cxip`���Nb�ⷶ\�d7~/Z�J\��qw�!�dAe伕m�Ӫ%9�\��Ԯȧ\�5%j[\�{�R��5D$��,�K\���iZ\�\�Jp�\�^uҚ*\n+\�}��(��(��Iy�\�\�!儶\�K�Q��$\�z�=����n\�Y\�\" �����\0� ֡7���̑�8��\�\�\���d8\�d��<�I8H��ꬹ\�\�\���\�!]�j�G�y��b��\�)\�MJ�I�86\��J��\�Fg�[{�\�ʧSf�+.M\r�\�i\�Ci\�!\�)����[V\�h\�P*j�K\0\�6�\�ʨ��&7\nw\"���nͤ�-\�\0N\�9�\�RX����\�y�!���z�\0J�n�9/,�\��Q9\�\�Rifa��\"R�?�\n=Ղ\�K,5����9��z��\�\��\'(I\�i\�O@qD�\�B\�<~t۪\�:�	\r\n�̚\�\�r�KYz�\�\���G\�\n\'�\�i\�\�u�O;\�gA\��i?NU�\�\�⬬\�\�dgiG�|\�D��\��u����\'\'\�L\'\�bR������)\�d�)Ah\�<ǁ�Vk�\�%��	BC�ǘ\�?�H�T�-[��\�DI�ZB���X ���͒�/%���5���?�*K\�\"�\'\��\�«\����zz�.L�\�~�?\�T�#γ_�\���\�mכ�i\�\�[`����p���=$��\��P\�9�o�M�N�\'\�&ytgҠ\�x͠c%$]�\�˱eJ�oq\�L%DF�q{\�\�\�\�R���G۟\�b\�\�џCU\�\�v�\�;u\�>]�to�ZmY\�\��\0��\��\�/�¢�\�ƽ)��5\�d\���5*Ӻ�ݩ\�	�\�K�:����ڬ��*��i�ܜQ��F\�\�\�\��q� �pvJ�J\�9�4\��شr�DyR_p�BY\�z�W-Mq�IW&�\�\�����7\���P���\�\�\���:�55\�\Zzέ%#Q\�-\�\�V^�=����Aױʮ(\�\�\�Ⱦ:��\�X\�RT����:YnkE\\̋�צ��;�Jq\�\�\��\�\�=\�|�\�\�\\5�\�\�\�Kh\�\��K�\�o�:겆\�i\�v3�\���e�\�cMk\�kE��̅���98$r\�z\�\��;q*\�.���V�zC\�OvV�#(����(>\'�j�\���\�c�\�\�ܴ��T\�E*[D����I#�q\���R\�k�\����\�9�zpH��J�-\�X2ہ\�\�\�\�S�\�\��.���j<�\�ng-�\�\�|�1�\��S\�q�#.\�\�m\\<\�T\�l��v\�--\�nB\�\���ߧ4��\�v�\�w/�Y޹\\\��]Gj܄����PA�I��n�Oq��α�N.\�\�v��\��{�.d���i�7\Z�lD[M��\�\�CJ.Mq��-G$%(��\'�cjܡkڛ4)���F�]\�=�ډW�L\�(@.�J�A�\�TWN3]#^��ǸFm\�\�\�\�jJB|Ԯ��TL�cW\�[0�\"j\'\�\r���9\�	�:�\�/@9.5i�\Z>\�2����1̃\��+�\�o�$�#\n�S̼�vWm\�!\�r\��p�{\�Xm�:����\Z_�-k-TէN\�/\�[d�T��ب/�)A\�k2j\�?m��O�\'�\�{R�\�g�,\n��3����-\\�v[�%N)�\�X耑ϗ�]~\�\�\"3�\�\� �<9W�)(K��0\�}�\�3���\Zg\�\�&�\�\�@����\�\�0���:׺\�UR�p��7IE�.\Z\�\�/�qR�[[\��E\�3㬵\�\�j������\"\�\�}U\'�m.��*>\�i\�=	�V�J�ǒe�\�\�\�\n\nR�yz��\�e\�+������s,�\\Sx��V��o�	\�\�$~u�����z\�3�خWUKnǠOh��)z:�!r궶\n�U�\n��m\�˕\��\�Q*Z\�\���\�\�\�\�9e���\�\�\�����7�ǭ;\�l*���sυEnmeD\n��U�����9m�\�����mO�>��d�C�&΅�C&�\�\\\�J6��u\�\�Y\�\�\�yi�5\�\�2C+%#<�.RŌڮ;����\�l�8Ԃ�>\�\�)���.\���\�b d8\�ڕ+\�R�wt%\0!�z�q�h�v tqB���y$\�\�D�\�q�3�5�� +�\�r\�Mځ�\�j	yiԐy��ˏq�J4�,����V9W8\�MH�\�j��p�B\�Uk���&v��I,�\��v��yӲ��\�a��R�\��Ue\�d\�u{����:{f䄀Pq\�ʡ\Zx*�yY\"�Yl�`+\�!\�*��!�\�W�\�ά~.\\л-�\�{\��\Z�\�<�\�\�H�\�nHβ)3Pp?S�ޜ�n}j%�%�\���V�\����J\�R�<+7�Q\�.3-�R\�[\0�y���H�\�[\�c���\�x�|�e\�t�=ɌW�[TZ&�^� �]Ԅ\'�����\���\�̓��P4\�xa�\�zJ	a��\�m)\'�H���\�\��Je+Vӌ\�U�J�=��9]Q�\�,v���܆\�)X�HI�\0.��#U|-;�\�\�,E����B\��\nxb\�rn\�n-j%\�%Xl��,�\�֟�wV�\'�7*g\�	\�7V\�Oi\r`x�\�.j�)L�\�6\�\�i\�J�y[\�:\�k\rXT\�\�=\�S���\\\�&c�ڣq�#��d[=���uqf5\��E��\�_�\�*�%�]J��:���\�_��;\�2蹺��Sa\����4߁I\�<�E�Y\�\�n���\"-\�\nR��1Ҝ8F�b\"σ~��p��fB�\�hsϙ銇��[�)tl[X\�\�\r&�M\�)n�\�b�\�Kt)Ւy��9s���Xɑ\�`�o�G�\�Lt�\r��R�AT�8�a��\�*�M�g�L�օ%[ymG\�\�P\�\�V}M��\�\�h`�H�qp\0�\��9>u6���\�\�5�\�V\�G�dΕ,�)Z�s \�.7�5�\����.6�2�\�l�jZ���9\�z�Օ�oz;\\\�`ƙi����:�F�\r���H\�rzT��\"ݤ�\�\����V�kJZ\��V9\�<��\�b\�\�%\�m~��\�9ۗ�S\�Nտ*j��\0�.Q^=�JO,\�Fv�3H�w�9~](�\��\0��\�\�\�\��\0u\�g\�*S�\�\�\�^\�Te��نn��\�;�=\�Ǡ������\���|x�\"ó�\�\�)x[����:\�zr<�ž\�\�\"���T���J`�\�\0�\�v:RW�\�\�C5Ì\�\�\�&��]t��Q1�\"2\�l�!j�H���X�V\�g�q�&se�y�&@ ���lǍ1h�i\�\��ζ\�Z�PFGpy\���W�H\�G#LZ��r5n\�\�9�\�)jeܻ9J\�]#�\�9\�x\�;���9��e\�d?jjd?\�ȕ:\�\�\�Fno\�Z�|\�\�ZCC話�\�M�}�F�>�M:w2�\0Q�x\�KӺZ�y�\�\�Y\�Bz�9�vŌ\��\�S�\��j�\rhC)�\�\�\�\�ʃ)C%�[8Z\nz(z\�\\7MAvE�\r賴-\�\�͕.<\�\�.:\�\n�\�]�lSȨ\'�T�X��m-�\�C*A\�\�I��+\�\�-(\��j�l�\�ɘ�\�e3��\�3�a�n�:�\�n*\�3B��\�\�g]\�[,�̝�J�����H\�j�\�\�%%\���7P\ZϺN��֜u[�\" y#9A5\�\�\�k\��\�ͺ��)^)&�\�\�B\�N\�AZ\�M�\��k5O��\�\�Um�\�QH�*\�iK�FQ\�:�Rp	���*��I	p�q�dg\�׻����\�\�5�o�\�|\�ͫn9\n\�l\�ڢ\�	\�6���a\�TPFF})�s79\�璇ZoS\�%$�\�h�����\\�\�\���]\�\�2$\��IL\�+QW]�\�\�S)=��\�3\���N�V�Ա\�\�DyYe\���\�M\�2K�s!^���\�yF֒\�\�4_\"j�\�w��%�\�I�\\G�>i����5�5K\�\�$��\�b��H��\�3\�&�J�\�bS&RZ9\�V��*�.,�b\�<\"qP�c�*Ay\��k܂ߘ4\�?Hk\�/\�]-��&;ˡ\�\0!#\�ǝw��4�.#����rbJ���9:\�\�NƷ�5M\�ʝK���u?�1�\rvP\�8�4ڵ��VF\�q_Au\�\�>T��\�ū\n\�|6=d�[������T2�\��\��Ӝ),c+XCh$�֗\��NRQ�$?��-�L5\�aR\��#\0\�a	\�q<��_u\�S|~<Wvۘ_d\�oSL�\�<�kN�\�L{\�p_~\�Wvb�>g\\RD\�d`\�*���[\"	{�i\�+\�Z��kp\��ݟZYn.���e�T��S�\ro\�VY\�wA�ǐ�\�Ԥ+\����\�j;�NO\'d\�owT$:�l\��\�\�ab\�ql��8\�\�O�~͒T\�{�uIL�H\�,���\nn@p�s\�aX�Vu\�?#\�dsY{ө\�k\�ԑ���g6K�Ep^u.���rMKq)>\�mD|�H$)m\�%$���}�����\nf���\�9�\�l}�����RT\r5\�3�_�\�i~\�\nNH\�\�[ðY)Ǻi��\�.\�ĂO4搷IO	�W��㖈^�ұ\�\�\��\�gksKJ)\��8�~\���!\�!D�P\�#\�B��\��\�8�>uZiX񎤲8�\'�\�\�\0�f���Le\�\�m\�\�ZOE*cCJ��_\�O[|�ţ �6\�\Zf��ȷH��SO����H�RD�9\Z�.ѯ�\�,ޘ\�wwb�\r=\Z\�������~��a�9�l�Q�GAla��\n\�<m\��t\�{XqSE�\�\�y���)\�601�m�Zx,�P�w<��\�\Z\�o��@Kޖ\�\�\�H+^\�x%_���]�.��Ԏ$ۤ]\\nYi��\�0�Y\n~u�\�\r!\Z\�fB�J�\�Rc\�L�\�Kg�R<ǅ@���\�\�J\�P���\�*�&�\"\�yH�5�vV�_`�H\�r5���\0`Ӈ*I\�����\��\��2qn�\�\�\�TT�ӓ\���\�(���\0�\n7�L\�\�\��b\�UȘ\�Jv\�!+^\�Y�q֭2\��;&��\�p�R9+\�\�V���>\����\�K�\�QT\��bO:��❒\��9#��R\�\��\�qRS��|ץQ(fm�)\�`l�\�\���)�\r��i��	=|I&�[��ɬ�t�%��Z��yQC�BJ�y���;�ᇘ��\�<����\�\�VHs\�\�]PD7�\�N�]�Dh�Z=\�\�\�\�SE�H;�\�SZ���u��4]�]\�P�R&\�A)����\�G>�I�Mj�\�]ik\�P\�T\�\�6\�tR_�!�اki\�9\'=)-M	�\�\�kMf~26��\�f��\�\�ƍ�R�\�FV\�yG�;���#e\�\�[�ڥ�\n��#�a>j�1;S3X�\�\�0Ԥ��5�`\�\�1\rȐ�^\�\�\�RW%{��\�\r+��i�BO�\�Ʈ�6�ɟ�\�Wc��h\��ob�����svB@�\��M~\�\�)S�V\�1\�JBBS���ҫ�\�\��\�\�\'j��}\�Π��z\�\�j\�uI(X����\�T1��y-�5;Y=F\�\n3\��\0�\�h�j\�侥6\�\�,�9	@\�\���u�\�\�\�\�U�<i\�$F��\�vT�\�\�\�I�9�\�*\��\�\�*g!x�5������#oɶzuͭ�I\�Γ��S�����\nU\�\�$>KdJg�\n�\�Ȏ��]U�m�.;M�9�\�@W\�\�%qt�-+8 \��J\�\\\�hiJ\�H\�O�/|8\�Κo8-�%\�_f�W�\�>�r���Gҩ\�\�%[\�+)Ry\��\� �\�\�\�yn�\�<�n�\�\"X\�d┟\�W\'-\�I	N\0\�i�k\��\0s\�L\Z�]�\r�U��*�ԿGe%�M\�\��{�C�	����<@q`����>\����O�-�/V\��\�Ϋk��M}x\�)\�={�L\�U�NHVĄ�\0b��=\�<���z��,�\���V�83[\��\�łPflwJw�+e\�w\�H��xm�6\�=\�\0<0�b;c�+B��nMJѲy;\�b:\�JU����VO�\�\�CzI5�-M\�Aj\�\Z�3!/���m)�=)\�I@D8\�e��\�TIZ�h���E�L\��\�w�!�:�O��21ʧz{�R\�)\���3������1�c&�9V\��nQO\�\�7\�v��P�V��\�KN:\���)\0�n(_<U�!ٙ\�\�M�\�ݺ2��R\�\�ڬ�\�c&�65.LK+��\�\�\���\�u\�A3���\\��w\�l��wsq$\�$#�\Z�\�\�Dgm�:����W��*-Jm�0q{H$�D�s�\�ݲ�2�\�⩝��ᓄ#,\��N\�KHP\�Ԩ\'\�5�G3YBkK	�\0�\�^5�\�2\��gz�Q�$|=9b�*pj묒\�\�\�ra���\�;�r\�l����J�\�!�Ui\�\�1\�t4�\�\�\�����\�Ĳ�ݱ9\�U�c�5��j�\�\��\nNX�f\�曶i{č-ݮl\�OI����\�\�\n�dEIt��(J\�\�\��h�+q\Z\�&\�t��l\�JntCo5�\�-G+#<\�Nk8^��\�\�F\�C� �\�~�Rk�Q���\�\�\�\��q@\rv\�qӔ����{I2����\�[*�?)Jp%�9ʊ܇\�Ls���g<��A%�58wxw��e�eś�b\�x�%O�\�֫�\�8�I<�7�,�NE\n\n{�H��\�d\�\�\\�]\\�:&T�\�\n�=+�\�>\�6�1S\�n+S�\����d��\�-.\�\�U\����Ze�4上���\�a\�)\�y�:Y��%���9�G\�\n�X�\�\n��\�\� \�F\�Ϻʥŕ��BK\�/-``�\��T3 ��LL�\�gZR�[NHI\�p:\�7�1�\�t\�Һ�\�`��\\f\�\�T�Hʒ��k��\�,2�\��$\�\�Hچ\�.\�H��>8\��u�8m6\�\"2�\�\�\�cK��N\r\�\�\�g�HυU�\�\�\�\rÿΙ)�F�aNq\�@\�P>\0����d�-�u�\�v�7ݝ�4d.@^���+\�W���\��F��e|r\�*��\�yvtEFqr\\R�\';I=)���\�t\��en!��P?¤����c�%7ڙ�\�g\�\�L\�\���\�[mŶ�\�Xǹ��:\�\�\�ۻ{\����2V\���)�%2fi�\�JR$ʏ�\�_֢7�g\�u\�ks3\�I\�̓֬� h��oS�e�t�\�k�\�I\�F|\�\�\�d^\�H�,���\�\\y�\�\�?\��׽\�\�X��L�WCch�N�(#�T3H[t�<idՅ\�ٞ�\�\�\�<�|+G\�I�.+\n	\'\���\�AZ�(`\�\�2\�B@$�\�]\�\�()88�Ǒ\��5�u\�l�[�SR�J�\0H����-<�\�\rr\�/	�Ӹ�j�\rH;�G]��fbͪ?��FC-X\��q\�.:FG^� nJ!D�8E���\��}\�K��9!ڂ7r����\�To(8�IQ��[��� \��S�)R\0\'���{�fN�mx�w\��\�/b�|E}ln�yy�I�/,�f�K%P^\�m�<�M{9\�5����\��\",��\�$\��\�H)a�9s\�V�\n\�\�Z�m�RT\�Rr�DdR�\�o�}2\��h-��]\�3\�\�\�h�����h�\�p9ՉiVվ������C\��z\�rS\r��yeÔ�Ǟ+\�׷�і$\�Rm\�H,��8�\rD7\�5\�v(E���\�w+}\�\�V�{c	+)e�\�3\�\�Ԏ\"�Dy*RNГ���W\ra���\ZCjP=�s��ص4	�%!r\rFy�\�o�\�#2\�\�Pk#�ˊ$\�ť\�	\�\0\��$\�6&\�Hw�\0�z���O&\�T�T�5��\�R���R!Ű��iWk���R�͢�\�M,7\�k|\��|k\"h%c\\\�\0�\0�\"�\�y�i�\0HX�\�\������\�C\�\�f��}Ÿ2\�\�\�2���*��\�\�C7���\�R\�;�2���_\�\�Q94O$�\�W����⦂�uC�%X	H\���������\�Z�:%vXm�j$�\�\���}Jmؓ\\/�W����\0Fn\�5��֍��&\������\�;�xm�6��\�\�f�\�\�$\�l���s\��)q��\�T���\�+UX�\�2\�g�j-_oS��\r��NR�rI��Z�>���\�\�\Z<8͆\"��voltR�\�\�P\�\�o��n�B)�\�пb\�q\�{=\���$)��vfRv\�&K���\�8���{8\�\�zy\�~%?8�\��-\�Q[�~��.ُ�\0�~s)���\�ַ\ZT�=��	\�G�\�Y�Q��ȍ�rT�ځ\\��\�c��E���\�O�[���M��\���{��g�Y�\�{�\�[\� \�1ȹ�g&��%�mW2v;�\�\�V��50�\"5�da%�n�=\�\�p#ʹ*%�\�\�n\r\r\�G\�\��\�t�\ZU�\��奅0\�W�zxW=̴��\�Lfx\�?m�q�#�x\�I5j\�oc�o�̱»�\r��\�خc�\�\�T��\�t�وR\�˞�d�Ԋ�(\�\�\�\�}�vnm\�R��I\�vr3q|��ͺ�C\�n\Z;r�\�6\��·?�O$����\�FZ\�7]kz\�m]�B�\��\�C\��<�ϐ�s�\�M\�\�\�\�j\"�$v�\�\�9\0��X/�)W��3ޑoa�;%�6��\n&���\�\�.\r\n��rג\�ѱ-��\��R\\^2ZS\�v\�!N��Ӝ��3N_\�y0U.\�\�m�\r �\���i�\�\�j�w�r���e�N\�j$\�b$f�W� yՋ���$��z\�K��\�~~U\�?��\�s\�q��z����Bu���1��Ȫ��KEDv�)*�&�\�#X\�Z˽�p���\�m8\0QN3�<�\�܏f�hȋ�\�LE[�����\�Md?h&\��9*}\�\�!D�OP@�\�a\�\�\�A8�_\�;�EJ��:NF\�r�\��\�=�s\�\�u�)\r\�(Y�}\rqqԜ �cΦ�9\�\���C�!@\�\�S�Ob���]�\0O��\\\"�%��\�Q�U\�hR�S\�S-5wZnan�\�RW��B�\rw�8\�}ҝ�	m\"SJm�r�\�\�\�V;1���!@s4Ӡ�Ь\�j\�\".(ieM\�q9�^��n�ѷ;kr\\�ʂ\�Q\��G䮴���+���_\Zc�eV�m�\� \�\�F(l���\�I�c��Zy2#��\�\�I���Ѥ\r\�.>����Ϻ�d�_�\�\�c\�\�\�\��i�]j*\�#��M�:�M�\�gI;�\�w-d�\0�\�]�pn�r=\�^�:��\�\�M�)1�l�\\>*\�9V�\�ѴF�����\�>\�\'�H\��A\�D���iq)���n�\��ݜ\�)<�z-?��j\�\�&�\�zς\�\�\�\�$\�\��J\�\�4\�\\�#��k�\� j\�i�;g\�O�皭��乴2ךsRK�7&\"\�Q)c񚈗w>�x\��e�\n�)J\�NH\�EFQSXgT���͍-\�D|\0P�p�\�J�f�wf��\��ܽ��*w��ŧR\�\�ZnjSkBR\�OՅ�\�}\�@j+�8}��\�O*\�IP\�\��\��J�C\�iK�.p[\�N\Z�I\��\�\�\�NBp�\naq��**�y�S��u\�c��!HJʋ�\'\��5oP8����\n\�\nm^\�A�Ȥ�_2\�\�!!xH\�Y�\�a�n\���t\��x7\�f��\n!)q�t��]gY\"\\\"�:�qM��\�gγN��2-\�ʖ\�䍪\')I�5s�=�P{��[i!j\n���2\�2��ji5kŠ]h\�{	K��\0yI\�|l1\�±6��\Z\���y��\�[a\'#�+�$�\0E����|Z���#֫���C��\�#XS+-IJ]Sx\�H\�O�Yk�\�\�ˎ\�Gѹ��P���֛\�i#��|��)�\�ד󓉼��l�ΈęJ\�N*B\�v\�F40A\�?�\��\�)�l�#ޗ\Z͟\�\�i/!(w�-�?\�Y\�\�Q[X�G��x�l�ĴM�!n�\r�_f\�)�9�\�l׼,{��Ur\�r�)yi��\�B��\�*\�\�{�n3X��|�⤞F\��.�δ�>X \�a���1}��%Š\�\�*I�\Z*\�\�N6���\ZBP�6�	OA�\r���Y\��#2_����\0��r\��ņ�G\�\�Ӱ\�8P=\�@}+8?|f\�(Z\�QR���)݀{�\�#\�kY{X�f\�\�ok\�;���e\riH\nB\0��ޥd�\�UO������,�Wi\� 2�\�Aj3؎\�ǹs\'0Z�u�I�\�3�\�Fm\��{�#\�}o?,v��\�<��˘��\�\�[}�\�V�\�B)��-�\�\���\�K[�8Jq�!\�qU\06�\�aW^Ur�)o/(�,<>\���5[z��oO6J! !?�<�7Y\�\�z\�R\�\�\��\�=�^�ynW�D\��IkGe-�J0���iT$2�\n\�Ґ�MlPY�\�\�ļ&Bё��[|>��r�\�ĉI�\�[i��AG\�\�¦\'Қ��zy:KL[�mnh~\�䃄\��\0�h}\�zR�{6Z��t\�\�.;O4�\�\�U�\�\�R<�\�|kXŁo�ۣ\�\�v�`[��kQ\�Nԏ�>����\�$��Z\�\��\�k\�z#M��\�!\�\�\�r>\�{\��\�\�s�G���]\�\�Y$�$\�б�|��ܧhWZ؄#��dܻc&�Z$%/2��\�\�\� �di\�!��B�:�@�\�l���e#<Ԝ}+{C���w\�\�U�K�݌UZ�Ò\�3Ĳ�z{�h\nl���$8�eG¾<\�\�<�z\�\�jp ��\�4i��+;�/Z~�]�KIJׄn\n<\�>Yޒ��|\�\�\���\���4y\�\�:��[\�9=��{%�GG�\'9*3N\�\�ܴ\�IX�Oֱ\�=9ky\�z�AYi�o$ddzV��p/���\�b�_\�I�\�\\B��� ��\�OR�.�\�\�L�n���\�|(\�k��\�\�K���\�N��a\r[㲞\�;I�\'\�j3�\�|\�\�XT�2\�\�\�v-\�(� ��1V�#��Ƣ=�22��f\Zd��S=D���\r\�L(�%m\�\�%)N9U\�;�ɝ=*\�5�2��\�pz�։�r� \�^y\�\�ҩ^6[\�Lt!��\�E t\�8�F�l\ZM�i�&\\���\�9\�\r$q\�4Ch\�I\�]g\�I��c�㜏ZF��\�\�T+1�����9u +�K��t˹�e\�\�.Ci>��u���Ka9[�\�EJt\���7���\�\�\�\'\�\�\�t�q*�9�5:����I\Z\�ե\�:N�\�,\�}!!\�v�˶o�\�`}jɰ^`kK*_-�\�u��mc\�>9�\0�SV��\�\�\�\�8ZHB�?�1]�5vq\�\�(�\�N���\n�\�\�5�����6ow}��\\\�7V��yM<k[_�\�^���>��)�\�1�r��yZϭl=GlU\�\��fV֐\�*�.�i#�\�Y��\�&%�\�W\�p1\�m�\�!#\���OQѥ�֞\�%\�h�D��/I\\GV` �Q\�\�VF����\�<V��$+Ě�\��R �HWg\�\�W!��i��lϰ\�N��W���\�V\�ZF��\�d\�\ZI��\'\�\�\�\�O���}\���\�n�j��t\��)%��J\n�\�r9\��j�i[�\�\�\��H\�G\�T隢ͳx\�5}f�\�r��9\n3�\�^q.�)$\�H���6+s�9\�%�c��D�d\�kI\�(\�0��\�9\Z\�>\��	\�\\Q\�W��Zf�So\�O@�$��X�Mc�\��\r�=\�\��\\fB\�%9�>F�?i�����6��A�\�H\�g�T\�YLq>K[�9N5\�.8C*#ĥ�$�\0*)^�b\�O��\�.TS��\��Dg�3�{\�\Zk\�\������Ӭ*>��jz@ݻ\�b����7\�7\�ؖ�<FTx�\�[�H�(�\�X(Fz�\�\��\��^\�V��+LE����Ω��u^��\�\�qzԖP�ϥ����:�\���\�X+�O�&hk\�\�1w�\\��\�z3�hX9y\�[\�\�O�2\�����rFy�Z�\\\���LN}\�T���\�����3�\n$x+ʲ��\�,V�I\�+oR�\"Zg�q���I\r�>����\��ʵ&[pP�\�Yy\\Ԅx�5%\�6\�\\F�ڴ�x�����Ґ>��\�|�TZ\�I\�\�a\r�\"C�=�R�C�\'#ο@�9��\r��u#�\�ƥ�\"JJ�&>\�go�#��.�ݞ\�R�\�pX0-\����sa��\���[�G\��&�D��\�\�\�H�;��q�^>��\� �\�9ǥo$�)\�\�:v\�#�5\�s�i\�m}����?:j��\n� \�\'�J�N\�=}\�V\�ˉW�D���/�o\�3�\�v�! �t�\��V\�/N\�7i\�s\�g���\0\�G����p���咚tn�\�@~��#\�\�9ҩh-�Nw8+��\�>,\�\�Yx>�ʝ\�X3;%o:l[\n\�\\A\�\�\�JYqLK`$���`�f��\�\�q\�XI�&\�K\�\�S<���\0J\�<.*V�b\�넹nqld�jH<�fN\�B���*�\r�-O,z�8\�ֵf���O\\\�a8H�IH�\n\�ZtG8hJ\�x&6����v��s\�_X.�\�T	QJO2�]\����;�\�?�z��GV\�\�\�y!\'\�\�!\�\�mKZ�,��&�>9߭�\�8�\�&�r��T\�)NW��UL�ڤFo\�{\�ˊ8JG��\�e>=]�!�ͱ���^RR�=|)[�\\\������YH\�I\�ν�2y\�Sj��j.��8	\nW�ʗ\�-/3T^�Z�A*y`�I\�\�Z\�\�\���\�\�3Oɼ;ٲ��(5\0s*?{\�*��pJ%\�\�\�o$5u�\�y��\��d��1\�oaYޤ\�m/�3#�F9Sy-�\�PCI\���=1���ME-�������z\��b\\R[�[Vm�[=R�|�?4�V����[Z�\�\�[�\�T�8m\�N2*<c�.��\�Yl|\�\��\�qWU\�k�\���HFN)������g2T\�D!\�Y\�U�/\n�\�\�#Ui�͍M%R#�ɊH\�V@��T\�\�b�{����f�oW63�_O�J�6EN.,\�nPy��\�I�B\�[�\�\�\�#�H\�E(�I��ia\�\�m\�\�r�M>q\�N#�Pj�m��[5$n��\�*\'\�<�j\nΫa\����R�9�\�5:�q5*��LкQ&\�-7�����j\�9纴\�x�s\�Z�\��Ʒ�\Zm�\��\0ǟ\Z\�\�K\�W�\�\�δ�\�\nJ�\���ኒ\��ơ3ݫ\�1����Ď�\�=�9\�5�\�ZyZ\�\�\�G�\�jP�w+\�՗�zL^��^�m�@!�{|/>G<��\\q5��\�x�Y�ݭV\r\�-n��,\�>�\�ʿ;\�M���D�\��uE��[�\�\�RǸ�Oإۗl7a-�̮\\��YQ唄�8���\�aO<�к�Xܣ�n\��ُ\Z6��[aG{Pmuh[��\�Fp<\�ʛ}�.\��\r!�gI`�\�\�QJ�mY�ߗJ\�/�];`�\�FŦ\�#m�\�F�R�2V���i�s���s�a\�\�\r\�\�	Jt4�r\n��\�k���M\�7\�,�t�*\��+\�륺�g~\�i��$KqM���\��A��\�M�\�\�ͺ��A�<\�r1\�/�4\�eq�\�Bym�S�J��\�h;K\�a+S\Zz*�\�\�I2$\0��k=�t�E;\\��AQI##�o��\�p=�m�eE_{��\��䁸4�*H\����\\Sg���MM\�Jl�䵴���Uv\�\�(Q�I�V�Վ^Z�,F�@y�\��GN~f���\�\�!���.\\�\�\�R\�NT���\�Ҭ;:d\�\�P.+��c\�;T�H�\"|�ˈ��ut�ܮS)�\�\�,+q\�\�9Tb\�hb/r\��.Y�\�;\�+%�\�\0G\�i��i���*?>u�$��\�\�P�i;v�\�\�ό\�\�\�R\�%<��-$a劙��9�׫\�U\�Ҿ؅\�NxG}\�V<�)j�\�\�3\�\"�,\�E$w\�\�i��V��9\�Ğ^\"�\�)[eI\�k�\�\�:\�)\�R9\nGoxI*F\�G�w(��99ۤ鹼��5�\�\rcMsiq\Z�Q\�Y%QV�\�p\n�\0�7k�I�_\�mN|�k���]\�R\�p�\�v��2�S��$Rz���9E\�c`s�#;�\�\�9{h��\Z�������%I�V\�\�\�\�T��9�\�\�@Q�y\�W���?�R\�n�\r�I\�Zlf\"\�> ��\�K���č6��\�\�a6��\0^3Z�K9#����%*�6�\�`\�S\�\����4t�»6�$+?w\�\�Z\�O\�\n�d�\'l�]Ϙ\'\"���x�\�R�Ĕ6���<\�\�\�-\�Υ̃�Ӗ+��-�Hii\��U.{`iI\�N\'�G\�Y\�4�=Cs�\�\�[�oyڷ:yU/\�ݒ=��iH-?s|��\�[H�Y�\��c�]�uv ���֟�\n\�i\�Zvڅ*��\�$��cr\�\�d\�\�A��+�]�\��?fY,\�&$VB��\�mc\�֎\�W,�\�,\"d׊T�\�1\�=*�\��4\�\�-\�0��\�YZ>��T���5�`�Dt�\�B�,\�\�\�bLT��\�\Z%*\�?,W��I_{(KOf=R)�\�I\�)\�F�IeL��\�\�!^\�ǅ^�*ﲑ\�\�)04ݫ\\BJ�})rfR�\�\�(���\�]��\�SـZy���tڡ�L�\�N1���\�\��r��X�-�O�\��;���l�\�er�!\�t�|\�)\��\n�-�%&�G���%�\����\�I{Ƹ\�ے\"�zf�\�tJt�;�]\�~U\�\�\�%]GfR$\�\�,�\�#|Y\�-q���_�Y\�3\�rZ��\�>��+=`q\�l����\�\�_��e\�\�&F\��t\�\"Pk+�g�I\�\\Py���6�\�\�t+\�@�\�Md��)X���Mf>,�\�1�ݯ&\�\�V��-!��\�EC$�J�1\�*,�\�kQ8\���A��5\'\�zwMش�\�eIc���i\�V1���\�T\\���\��ڞ%\r8I�\�j2\���\���1�D\�Z���VJ{?uX�\�y\�I�\�u�Qf8R׾H\�\�\�}=k��E:CK\���Wˊ\�\�\�o�}�nۛ̋m����\�\�8���Ey!��%�gP�bn\�Ƣn|\�T4$ʶ����*�hiP\�S���\�9V�T\�\�\r\�y\�\��<}UO�A�H�ӎ唥n�s9\�u�2��b�[��\�ks/��ӝ��\\�M>[�b����-\�|Ĩ\�\r��5AN�m\�$�\�\����{)�C�v��������Nm\�˦(�Z\�`�\�������P\�\�akJ]\�1�R�䝲e(�\�\�\�Ԓ\\q\�.�\�#c�_5,�@�ʵW��Hi�?\�~\�\�\�V���ϢB;Č���\0�Vl�\�ve�\�\�-ƃ�e\'o�wR���l\�k\�m3ci�8\'Ɯ���h$#\'�<\�Ҿ��\�y����B `���IG�D�V��k�a6\�c�H͒\�\�u,�\�@畟\Z�p�\�5\Z�G\rބ.R.Y�{\�m�Ҭ8Q\�9g5\�k\�5�Tɥɲu�\�	�\'�iZC#�Fһ8�\�\��ӚJT҆\��B1\�xfR�\�\�x\�]oQbs\�YG�}\�֒���Z\�\�8C�w�$q���\�֎gw��SX\�EG��\�\0���\�jH=܂*=vm�d-E`���T\�\�K!�,v�\�[�;�\�d^-.-�]�ڥmf<�_{����\�\'P�w�3�\�ECI\�^\���:U-\��\�mu\�\\d�\\\r�$a\� c�Q\�ʨ�[�}Kk3-���SjuD$# \�[\�HYZ�wr\�:A�$�whRv\�\\��d�\�_g��\�J<y��P\�Գ�� z\�K\n(J�\�n\�I��D�8\0R�z\\T����\�uԤ\'ϝr?�:�F�\�\�\�\�\�X*�.+l�s@b���?v�F���0\�[8�!5�-�^�\�.�	-\�|��+O[��(�̜VƝ53S$\��\�jOgs \�\�GҞ;$,�\����\�\�\�ŏ�<�a#wZg\�L���!#�ʎP��`yb�%\\\�\0�A�4\�\�&RRR��\'Ғ4nv�lK]\�?�7{\��\�RV\�l�8\�:�\"ڮ̀��\�5κ���D���[�U�.u\�\\GR����\"�\�e\\2�w\�U�b 4P\�\�\�<ִ��	jP\�IZa�\�l�șm`vi~_\�G\"G0�w~8d�\��9\�B*�Ы\Z3Vj\�*�\�#<\�@\�,������Y�>\�wi\�bdp�s�5�\�e\��*�\0Z��\�\�v�\�\�	�b�%�R��Շ<��\�q�\�s��#��Ƿ���RT�\�Q\�^\�vh��AJ튊��\n!2\�ֹ�!C�\�QW$�RG�\"Z� �a��@%8��-\�uj�=9�d&\�\�,iH���\�>ZXJ\�!ҲJsL�,�l)�\n�d)\'�_Tn���E\�Q�tĸvn\�&.c�:\�\�S�\�\�0@\0\�/�\"\�-\"\�\�H8R�������ɚwB\�m5٤1o�\�viAey#\�z\�l��\�\�X\�M-�\��^Nv�3^+Q��f��\�48\�l7\�٠�Dp��Y�W���*^��.Kɋ٠�\� �W�+�ڮ�[���9-�c>\�y�ɶў��X\����ř\�\�uI�Bq\�\����g�\��5;�%�X�\��ȑ�\n�p�<ˆ�[K(eXqR�0� �j�\�ځs\�Ԑ06s��#u�5\�b_yPn=��jN\�⩾��\��\�\�hb+�V5Ay\�Y/\�!K\�\�{˙\�\�Er�+\\E�>\�\��3\rʸ4���1\�\�3��tS��\0\�\�\�8+\�i?f\\b\�ֿ\�q\�LZ�e�\�V㝧>@�\��5V\���5kq��V�0g�\�\�9�U\�\�k\�\�\�\�\Z\�iQ\ZYoq\�T3�W�ݸ\�i˜w[�Io��\r2�T�grR\�\�\�U{kX�]m\�u~�qҀ\�\�\�mN�\�|j\'\�]+��iċ\\�!\�Yb:�z$w�\�B\�\�krJ�ȇo\�δ�!�\�M�Tw�u���\�f�\r� �\�B\�<�s�\��>\��Pﲥ^Q#1\�R70\�h�\��\�7\�)\�:x\�%���\�Oy\�ϖ\�9R�C\�\�H\�z�lW�Kɑ4\�x]\r.F\�7����\�\�\�ˠU)t)�s\�Z%��>ucM.E��\����֩�:\�V\�\�\�ǅw<\�\� /\��W��&�\�YPآ��R�\�\�\��\�WK�:\�6�\�PJ�O,���4\�\�F#\�ዒd��n\�m\�I&��4�.��\�\�\�\�E�>Dg#�\�\�Ir\�l�G\'B�O��Uj�te�1�K+ZДc\�\"�dD\�_#hg\�S�L�3\��-�|�\�I\nKΘ\�\'o���\�^��\\��#\�	\�#\�G/Ξ4\�q��\�Q\�L\��4�4<��\��\�gi\�\�\�{\�{8ς��U��#7\�F�\��V��a!1�@F&�$ CiJ\�\��K\�\�8�\�8�Sq\�\�D\r\�\�W�	\0\�@�\�mU\�2�\���v��A�4���H�m `\�K\� �\\\�\�\�\�J���Ґ\�JA�\n\��W�\n��\�ڃ\�#�}vR)R\�\�>U\���<��\0tmj\�@\�*R7�\�%\nA#ni^B��f�\�7�\�q�\��q��u�T\�R���Q	�֤�\�Lg\�Z� \�q§\ZY\�ڏ�3\�|�F��gM\�m?�f��Z\�Wf��rm�H\�\��+��jQq�h��fL�q22!%\�\0\�W�Y��E,\r7Db�8��)/%*��e�\�\0���/�m�o*���\�4\�\�a�T2���?#Ҧi��\�\�\�w�Df�\�͸}�įSM�\�-Ȍ\�ґ�\�ܕx\�h|G�\�8���j]���7+c��-�\�#��J\�>Y޸<�(yIl�\�\�O�.���\�)�X\�0��y\rû���>Y\�>U5�\�L\�A�k\�\�邚_�8\�H�@yM\�ovJ��\�#s\�֙�	J\�kh\�Ξ\�RZ�J�)�\�Ef�|\�5�\�s\�\�eY\�9S�m\\��9\�}+!]�w����boN\�e\��줶�>kUo^&\�7~jXl(\"KU)�g�T\�\��+Ye5o���)U\�{d%λ�\�μת\��\�$���\�\�7|�0t^��V�\�;\�ͽ	<�Mw^.�u\�\�}v%\�3kqHpe/dmW�J�A�\�rd�=-��MB�\�1��ԏU7\�-x�_Q�\���?}>b�����\�5+�J9E/���d{S�mI�\n\�6��PV	%C�Τ�x_w\�_Ӗwn`��\�/vĭ[y�>�=��\�l�v�j�H\�a�����@�@�\�־+G~\�\���(R\�\�\�)@Q8l�Nߦ*\\\���M\\�o\�67�\�\�/\�\�\�e6u7�JA\�1p�\0Ϗ (�\�Į4\���L�S�N\�9�����4V�kK�f\�5&����\�q$\'#����\0�uNO�}�#w5Hh�\�����8�\�B\�q�e0�Ǌ�S�#��]>UQY��\��\�k�i[�Qژ�\�H��\����ס\�A:�bߟu�\0&�\�\�V�`�NҖ\�wy�\�\r�\��%i4ͬ�\�\�\'\�\r\\�0nL\�F]@\nu��x|\�\�Z��n��l�^�k�\� ۙ.��$c�|\�}��kΞj\�4��9>K\�Sv\����p�O��\��6�\�\�|\�Ֆ�µ�9\�\�d�\�n$<\�m���\�\�儎Y�\"\��\�<�\\��\nBm�t�!\���X�J��*F<A\�l\�\��%-�\�tvSK;�B�||��\�Z@qrJld.1-�{F�\�@�u��p�}�Uv�\��sү��iN\�O\�!8RNA��\�{\��9½�ze		RW\�9W\�A\�I����c�+�V\�;�rI\�rq\��*��U���;y\���h\�\�aNK����\��u�����\�{R�ۮc�\�NW�$k�+���#t[�����C�j��\�\�\�\\��R?�%:�ʒ<�\�M�?�+\�h`՟\�\�]4s�;H�q\�r\�TBy;�dt#ҫ���\�LH�\�\�\�`r\�Γ|v7���R�Œ9��`��q�[:�B6�\��z{ٮz}n�E�\�U\�\�һK�\�.�m\"BIǙ<�U5���75�\��mdw��P9�\0\n��.\�i<\�Z�4\�\�}\�J�\�RJJIO\�ڇ�\�\�\�\�\�\�\�At\���5�S\�L�3�G\r�>\�yS����;y��L\�zs���z�/�6\�.e�z�\�y�8\�X\�p;�\��)H�\�H\�Cd`\�wI�\nHN1\�I�+\�$`�\�A��jq���ݵ\�`�Sk�$vIq\�H\�q]Q���\�:\�\�\\g�[mKiqe���tam���Cȏ\ZicM\�\�{\�D$FI@\��\n^���%��%\'\�l��F\��d\��OaJI\0��\�$\�\rܧ\�N\�JZ�\�\�-8\�դ�>u\�\�\�0��\�sh�\�FGR䮣5�ĸw(\�\nX[o%c!@����#\�\�\�w�]L���#\�i+q��\0伞��+��[\�;m!��Յr9���-��-���\�)o�`q�#���\ZdF܉�h9%{H�JW9\�&�[h}�|�\�^�J\�h2\�HqI�9\�u\�#a�Km+�=M^��B\�27�Ĉ�\�ź#�\�76��v�N\�\�ڵ|�I5�x���1\�MF\�\�i�%\�\�\rܐ\�\�c�~U�\�\�\�t��6���V�cЎu\�e\�[YS\�\�	p�\�h�>t�\���\�.�ݦ2\�~��\���\�\�ۏ\�kL`$��:�<�O\�Ik���-�-4�1�Z;��Jn��\���c�*�iJ6\�\�DJ)mA/�_��\�v�\�\Z,s{չ�~\�\�\�7|�x\rn�S�i\�֧R�6\�8K�4��\��\��I�\��\�9��|���e�Xp�tW��\�u!?Q\����7r\�Z�v+r$ۤ)\�\�{0	!X\�O�1\�|F�\�\�$��	-\�K�w<�I\�X���]��g\�O�\�\�-�K(h�\�mGL�׹�}:)\'�;3�\����T��yV\�a�\�(�\0\�SEjU\��/?ɝ��:K\Z��\�#wh\�d��I\�\��Tr<)�Y\�\�\�D6Ռ�BT!M>ҷ.#[8�\�zkO\�%\�$@o/۠��\�\�K%$\0\0I\�\�U�Ѯ*\�\�[�Kn��N�\�!�(\�u�j(H8��)�F��3g\��\�\r�dk=,˲\�[\\�\0���g\��˨�>�bF�\�R�!N\�(c\�\�P�$�,\�F�\�\�\�7/M]\�\�!*w0���_�\�V��O\�\�V���\��-\0�\�+\���*\�平�\�\\\rjl/;\��4�\�S\�\�y�\�ܝ6\�;E\�\�?ZXʸ/H\�\�-�>]��Ҝ\�\�����Aܤ�\�ᖛI@t)\'��g4�\�yH�\��\���\���{-[e����*.P]2J-�/9�\"y\Z�\��R쉙:L\�\�\Z>��y\0�$��\�i=E%]\�\�\� �\�\�\�}qY\�F�\��8�g�\�xc�\�\�Z\�u2rE�B[�\Z9S�8\'Fik&�\�cX\\�\�0`%�w8\�T��\�#?֟�q%�����\�+9�\�\�מZ͊zA\'o���xxP�/}-c�\�)\�;���\0\n�\�8\�\rˢ������\�\�XN		��KU�0B�Kr\�n\�Ӏ�p\�ʐ��?	�&\�\�(II\�7e�Bt�\0�ׄh\�N\�.*\�t\r��f2�#\�TI\�\\d�n�G\��К�@\\\��\�6�4HK\�\r\�\�q�GJn�=t(�(�\�!%(}�r�>\"�E�\�}�I�Iѓ\�܀J�\�\�\��\�\�����\�]ѓnPVT?ɸg\�\��Zy,S\�\�|%��u���\r\�1w�(**ʹ\�uB�\rh�5���Am\�\�*�$&C.a~$y�̣\�\��*�\'Qp\�J^�V\��\�/q\�\0\�έ�&�\�\"�Wnq,\�$\�\�mϡ\��r�D�k\�r\��\�B�	?Ɲm�od�\��\0*��\�|O�\�\�38yu�F��0\�\'̧nEN\�BՑа�\r\�\��79�\0\no���أ�k��JKjɦ� *��Z�`�\�\'�ú,JnU�Y�\"xO�t_O���ܾ��)Jr�f�!�e����>�G�\�@�.\�p�Ҹ\�mz�W\�5\�}\�\�E䟥\�>\�{r}!Z�Ĭ��\��P\�B���7%�b�\�!uǚb8�,M�P<�\�N\�|sc�W\�~Q\'T��[0J�?:G%|�\�\0�\'�4�u�T4�&�st�dG>x�\ZgR��\�r\�$��\�����Y\�V�\"0-\� ��]R�\�GAR;m�s<\��\�FS�R�~�\�\��^��$�8n\�OQ���N3e���e�\0�N�|�v[�\�8E�5�$��\�+�\'�6\�M#\'=w#&�\"\�zi;M�z��\0\���\�\�¹.\�<�u�\0�Z��q��Jf\�H梄�@2\"�-�%H9�ǈ5Ժ\�O\�\�\"�>��\�j܀��\�е�>	H\�V��\r\�蒛��5{\�:��\�d�\�t\�_�S8\�.BľqC}\�\�!+�NRv��\�.Ϧ1U۫�1n/�ʪs�\�\Z��`�jiq/\�\�x[\�h�\�\�����\�?�Ft��\�ڱ�&\�h�\Z\�Gi!\�J\�0���7\�ҭ3\'��Խ{P\�\���\�ǀ\�\�]��Sň�R=�\�kV^C��/X�#�>��5�oV��nՖ\�5`��\�	\�\n[�;kjm<\�Ke@CKSr�5��w\�\�u$�}�io�6\�\�JS�9\�M��ir参�&�\�\��7\�ݠ?\nl\�r-�\�5M��/M#�g\��Ǟ\�=�\�2{wU\"a[�v\�=\�\�\n+�����`�|\��\�Ij�n��f�\��S/ N�\�B�# �2:h�s�MQ.��T�.򔞩��GҊ*��}(؏\�>�Q@\�~��b?�QE\0�Gҍ��#\�E\0lG\�J6#���P��}(؏\�>�Q@\�~��b?�QE\0�Gҍ��#\�E\0lG\�J6#���P��}(؏\�>�Q@\�~��b?�QE\0�Gҍ��#\�E\0lG\�J6#���P��}(؏\�>�Q@\�~��b?�QE\0�Gҍ��#\�E\0lG\�J6#���P��}(؏\�>�Q@\�~��b?�QE\0}\0@QE�\�');
/*!40000 ALTER TABLE `register` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room_comp`
--

DROP TABLE IF EXISTS `room_comp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room_comp` (
  `cNo` int NOT NULL AUTO_INCREMENT,
  `username` varchar(30) DEFAULT NULL,
  `room_num` int DEFAULT NULL,
  `type` varchar(30) DEFAULT NULL,
  `complaint` varchar(500) DEFAULT NULL,
  `solution` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`cNo`),
  UNIQUE KEY `cNo_UNIQUE` (`cNo`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room_comp`
--

LOCK TABLES `room_comp` WRITE;
/*!40000 ALTER TABLE `room_comp` DISABLE KEYS */;
INSERT INTO `room_comp` VALUES (10,'aa',99,'Plumbing','plumbing issue','isoke');
/*!40000 ALTER TABLE `room_comp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `security_comp`
--

DROP TABLE IF EXISTS `security_comp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `security_comp` (
  `cNo` int NOT NULL AUTO_INCREMENT,
  `username` varchar(30) DEFAULT NULL,
  `room_num` int DEFAULT NULL,
  `type` varchar(30) DEFAULT NULL,
  `complaint` varchar(500) DEFAULT NULL,
  `solution` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`cNo`),
  UNIQUE KEY `cNo_UNIQUE` (`cNo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `security_comp`
--

LOCK TABLES `security_comp` WRITE;
/*!40000 ALTER TABLE `security_comp` DISABLE KEYS */;
/*!40000 ALTER TABLE `security_comp` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-18 19:13:17
