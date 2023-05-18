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
INSERT INTO `register` VALUES ('admin','admin','youremai2l@gmail.com','abc@1234','9999999999','male',NULL),('temp user','user1','youremai1l@gmail.com','abc@1234','9999999999','Male',_binary 'ÿ\Øÿ\à\0JFIF\0\0\0\0\0\0ÿ\Û\0C\0	\n\n			\n\n		\r\r\nÿ\Û\0C	ÿÀ\025\"\0ÿ\Ä\0\0\0\0\0\0\0\0\0\0\0\0\0	ÿ\Ä\0M\0\0\0!1AQa\"2q‘#BR\ÒU¡±Á	34\Ñ$bt³%CDSr¢&d‚’\ÂTƒ„\áðÿ\Ä\0\0\0\0\0\0\0\0\0\0\0\0\0ÿ\Ä\0,\0\0\0\0\0\0!1A\"Q2aq#‘¡3B±ÿ\Ú\0\0\0?\0ýDJ_˜ü€&¼Àa\Þ\Ì\Â0FÄ«\'rO\â¯}\ÂG\ïyŸF¿E?\ÌOÿ\0™ô‘K(p‘û\ÞgÑ¯\ÑGp‘û\ÞgÑ¯\ÑK( }\ÂG\ïyŸF¿E\ÂG\ïyŸF¿E,¢€÷	½\æ}\Zýw	½\æ}\Zý²Š\0G\Ü$~÷™ôkôQ\Ü$~÷™ôkôR\Ê(p‘û\ÞgÑ¯\ÑGp‘û\ÞgÑ¯\ÑK( }\ÂG\ïyŸF¿E\ÂG\ïyŸF¿E,¢€÷	½\æ}\Zýw	½\æ}\Zý²Š\0G\Ü$~÷™ôkôQ\Ü$~÷™ôkôR\Ê(p‘û\ÞgÑ¯\ÑGp‘û\ÞgÑ¯\ÑK( }\ÂG\ïyŸF¿E\ÂG\ïyŸF¿E,¢€÷	½\æ}\Zýw	½\æ}\Zý²Š\0G\Ü$~÷™ôkôQ\Ü$~÷™ôkôR\Ê(p‘û\ÞgÑ¯\ÑGp‘û\ÞgÑ¯\ÑK( }\ÂG\ïyŸF¿E\ÂG\ïyŸF¿E,¢€÷	½\æ}\Zýw	½\æ}\Zý²Š\0G\Ü$~÷™ôkôQ\Ü$~÷™ôkôR\Ê(‚ø›Ä±0\×\è®\nmH)\n¾¼7|9S#w\ËÝ£S\ÜSi°M¸.\Þô\à\Ëy\î\Ìünä´}jŠ½1`r…:ÿ\0§§i®\î\æô%W\Îdž|\ÒAÀ¨I¸òu,—\\¹f-\Ê%¤]f¹\"X*JR–½\Äª>\çJd\ÕZ–Vº\Û ‹\Þ1\î\Éix -dü!¿w™ó\ÍUv\íes²k™Z£S\\\ÍÍ”E\ì\íñ-n¥À—#Ë™¨–¬\â|A¨\Ø\××†#A·[RDO•)Õž~ð\Ç-\Ù5cÁ\Üaòj\Ë[\ï:—\Ú}JR˜p#*\ÆO¸“\ÏM\r\à}þ^¨\Ðl_§)E\éo¼¥uÀYHþ\0QVE\æ)œ}“H\æ\'ÿ\0ÌúH¥”Žù‰ÿ\0ó#þ’)eH\àQE\0QE\0QE\0QE\0QE\0QE\0QE\0QE\0QE\0QE\0QE\0QE\0QE\0QE\0QE\0QEñC Š¦x¹¤ôJ.É½\êeÏ¸È“\ï±iŠ2¹\nH\é\è‘\â}j\æ=*¯·\ÇT\ëM¨K¾\\@·\ÅZ“”´\ÕG\É#©ü«eFR\Ô\é­Fg.<XŽK†¦•\"AD&ù„\'È¯\Ï\çQIò5§‹µ1¸\Ö\æŽ¬ \0\Û‹—*¿õ7³\Òn™‡¢`\\\ÛyOÏ’¶±\Ûr@>CÂ©\rK¦uŽ\érL\Ç]b\Û1‘¾\í\î!ò“€Hò\ëšU\åvw³Tû6-—8Qmr;Ý«jq\âÿ\0\î_—OÊŠ=›m\Î\ÚxUo·¼óN©§\ä{\Í¤‚\êˆ\Ç\ä@¢™‡\âŽ,óÿ\0\æGý$R\Êb‹{¶£PN±ˆL\å)2$ó-”%!CóIúS\ÚUž¤f\Ü\àTWÌ:ûR\0¢Š(\0¢Š(\0¢Š(\0¢Š(\0¢Š(\0¢Š(\0¢¾Q‘\ç@h¢¾dt\Í\0}¢¾d†¾\ÐEPEPEPEPEPEP^T„©@© \ã¡#¥z¦mE¬4Æ”dH\ÔW\ØpFRt%Jù§ò£ ¦¨&+\ÅN¶\ØØ¬­\nyu>•Š¸¢\í’õª¤Ç›¯$]û·f\Òœ%N©g-´„ò$\'\ÅZœa\â™\×Z|\é\Þ5rš\Ã\Ù]\Åö¢¸XO=©Qò|«8M»\Ý\â\Çm\ÄÄ‹û|\í<S±\æÊ‡ Gˆó¥¦Üž$·ÁktN‡b\ßlD¤\Åe\×;1)8w\ç\Þ&Šaö]¸Í»p†\Ýp¸H/\ÈzT²·\Þ\Ã\ë\0ý\0¢¯DX¶\ïtj\Ñ\Å\"±;$Ü£¡„\ÌB\Ò}€¨\ç?ú…XP\ä6ôvžmEIq ‚zš\Í^\Ðw‡¬¼E2\Êp\äPÛ…y)V\å\ç\ÝÏ–9ÿ\0¥FôŸ.\'\ÆC\ÓgªZ]	iK”R\Ócð¥\Å-9N¹6—ÑŒl\ÆM‡‘\å_iƒF£P~\È\ê9!\Ù.¬¸ˆ=?\ÓQyY)kEW@(¢Š\0(¢Š\0(¢Š\0(¢¾\0}¦»ö£²\é˜¸\ßnLCŽ€N\çVW Iô\â\çm¼4ˆˆ¬¶&^f ÷xÁ^\ê\ã_þu’uV¹¾j[‚\îz‚\ä¹òÔ¢BUþ@ø!=\0%’QŽ{4£ö¤€\ÑRt¥r[‰g²\nõ	ø±P;´ÿ\0%e¸Š¶Aÿ\0‰v‡ÿ\0uR²®\n’\áZ\Õ\Ï\0\ä\nB«¦\É c§O\Ú]³¸H¸W\í\ÅUÿ\0zš‚Þõ§+´÷b#³’`L\Ú>5±´«×—J Ü¼¨v‡\ë_[»“\È8®~µ/iH\á«tÿ\0µ_lMöÀ’z-q\×ý\r\\úK^\é\Íe\rlÓ’¥‘•²¢7£\æ+óÉ«²’ §zŠj[¢xv\Òv®Ö™*I÷›Ïº\â|Bª¹\Ö\ë\åru$\Ï\Ð<\æ¾\ÔW‡zö\Ñ\Ä-<\Õ\î\ÖúJð!¯¼Ó˜\æ©H9$ú!\ÑöŠ(®€QEyV\ï@¨¢Š\0(¢Š\0(¢Š\0øyŠ‹j\r£.·«u\ä=9@T…e¦œ’­§–}jUM:¦\Æ5-‚u…RV\Âg4YSˆ\êH\Ï\Ôd~tQ\ê®&N“¥e\Í\Ñvd\Û4\âT#±HB\Ôv\îa<ùj‡\â/õa\ÏR\Ô\é—2S\ÒW\ïºI$\ç\î\â¶Tb—hµ\Ù$\Ä\n‡iSJe0‚¤\'#¡5\ãpi\Z5\ØQ¬®N¸\ÜÈ·B\r$’\Ò\Üå¸‘\Ñ UN/³¨höTe1ø3ji\' ?(ý_Yþ´S³¶¤øeNÜŸa\é0d\ÉmÅ²½\È\'µQ\ä~Dg\×4U‘\é\è£=¨û_ö£öc)¶\n¹gû”ƒ„Z:ó¬nE²$wiu÷NP\ß>˜I­I\'E\é«\Ý\ê\ét»Úš–û\ÈL%~\È$(NkW?Z]¦tn˜\Ò-.>³±+\0/³\Þµå“©\ã¡\Ö\ß0¡3?÷H	\ëž~4¢Š*Ä°p(¢Š\0(¢Š\0(¢Š\0(¢Š\0*#\Ä\Þ [øw¥¤_%©-Cdõu\â=\Ñòó©aPOSŠ\Å|\â#ú\ÃZÉŒË§ö]™J‹9äµ<\ä•s<’Š\É\ÔÚ¢\é|ºI½^\åªL\éŠÞµ« òHò¥E\å\ÜV\ÞR…ej<Ï•sŸ<eN/™\è‘L.\É.(O­[ŽK\Î\ÏJN7v‹=O•|CS%À*óh·*[©\æp<qS˜6Öši	 9ŽtNÍ¥\ÕÑ¿–C¿a>¯yAg5\ä\Ù_k\Þ_*°fBqš\æ\ì\í\ÉH<¼ER¯š}ÿ\0Kv@}ŽD’=k\ìyŠC¤@š”Ë´¥À¢*=**#¼RR9Uñ³{À¬\êö\ÞK+„üPºpúú\Õ\Ú\ä\ÂyID\è\Äû‹GM\ß0+xZ\îQ.¶\è÷(.‡#\Éi.¶°r\nHÈ¯\Ì\è!JNG•l_d\í\\\í\ëHL\ÓÒ¤v‹´<aG˜m]\ÈTg<”\Ï\ì½è¢Š\0¢Š(\0¢Š(\0¢Š(\0¢Š(\0¢Š(\0¦­N\Äù6)\ìZ‡û\ã±Ö†ŠV¡€sùÓ¦G\é®`Oô”½\r£›\Òó\ä!ùqN¸œ\áJpö‡¯þº*U\ê\áüôÿ\0\ÒE%…€\ìŽ?®¬v}dt”\âò&\\KŒ+gÙœ nð>\é\åRäš¦õu¦\Ó}\ãkm\Æ\ë>+Á–Œ†÷´•u_ô«‰®I\É%#=jº\äÜ¤™9$’:QEi\0¢Š(\0¢Š(\0¢Š(\0¢Šò¢@8#>_ñ\Ï[	\ÃÛÉ‡fIGt‰\ç\Ú/–G\Èf°M\Îbð{E•(­Dõ>hol\r^dj^eÃ²\n–ÿ\0>EJ\ä‘ùcø\ÖY»\\\n“´(ó\ë\\‡-²Ä’ˆštÕ­g\ÇJ\å+šúc´	\'®)µ\×û\ÉeµsQ­O´Ýµ«s-€‚¹Ot%ˆõ>Ul¥µB9ycÕŽÒ¦HKDœyS\ïupsRH#À\ÔbM¶\æ\Þ\\oQKaG™	Á	?,Sr¯\Zª\Ô\è»þ\Òm]R\âv¬R\ÒM¼\Â{x&¯FS­”\î(>b½”€g$§Æ˜mú£¿¥-Hd²\ç/~ó#[\Þ_º3P-o\'G\Æs\åP\ÝDµ4®\Óõ§5ñJ$\á\çžY¶¶Œ\Ó5÷Si‹\Ãay§\Ë£\0š¶‹šk[7$\ï\ÆüÖ€öG\Ôh‰\Äsl\\©¹ER?“\ÌV^[Ê)M\Ë\åV	µD;­,\×x\î©™­¤’pv“ƒü\r[9ee‰?£ô\å5\ê¹0\â^BA\Ê\\HPù‘]j(_\n\âô¸ñ”„¾òP\\;Rzš\í\\ÝŽ\Ã\ÊB\Ýi+RRH\Î\r\0t¢Š(\0¢Š(\0¢Š(\á8®j\ÒT¥$)C 2k\Ú\Îpjˆ\â]\Ò\ée¾ª€\ÜnòmJq\È\è+[\0õ_úU\\ªŽ|–W\r\ï»›Ÿ	å­¶¥2µ¶2´¡aE?0*¹ºqžvÛ›ö›c\ïIŒT\Üt¸Ò’…pTµ€j+¢x¥¥ô¥¡l\Ì\Óò[¼©id¡\r•.AóQð\çÖ¤ÚV½>\Þô¨ñ\â½dC)2#w-\Ç	\ÉBˆ $z\Òöjb\à°ùGaT›$\\\'¼]/úT]\ï2\Z~d—\ÜS‹i;Q\È\à\0<€\0z\âŠY\Ã\Ù\Ì\Ü\ìft{R­­º\æS@\Ï	Hðð8\Èô\"Šr¿ÁríŒ²‘\é\Äy–yi(~<v\'Cxip`øò•Nb¸â·¶\ëd7~/Z…J\ï÷qw³!„dAeä¼•m’Óª%9ð\áøÔ®È§\Ä5%j[\Í{‹Rº«5D$•®,²K\âš¨®iZ\Ê\ÊJp‘\Ñ^uÒš*\n+\å} Š( Š( ¸Iy¸\Ñ\×!å„¶\ÒK‹Qû©$\×zª=¤µ¢ôn\ÅY\ï\" ³ƒ‚ÿ\0¿ Ö¡7ˆŠÌ‘8§­\Õ\Ú\Îù¨d8\Þd©¶<ƒI8H˜üê¬¹\Ì\Ü\éò§„\Ô!]›j÷GºyøŠb®\î)\äMJŠIŒ86\É†JŸ”\â„Fg‚[{”\çÊ§Sf®+.M\rŽ\Ýi\ÚCi\Ç!\è)«‡¶ü[V\áh\ãŸP*j»K\0\æ6«\ÇÊ¨•¿&7\nw\"«©nÍ¤¼-\î\0N\ß9ù\àRX÷©¯–\Üy¥! zÿ\0J°nš9/,º\Ô÷Q9\å\ÌRifa¤½\"RŸ?ñ\n=Õ‚\ÕK,5º¤©À9ô®z•¡\Î\Åð¥\'(I\Æi\ëO@qD¼\êˆB\Ø<~tÛª\â:¹	\r\n•Ìš\â\ï’r‹KYz¢\Õ\âÁ…G\Ü\n\'ó\Æi\Æ\×u¶O;\ÔgA\ëöi?NU¸\é\Æâ¬¬\Û\ädgiGž|\ë”D¶”\Ãðšu’ˆ©\'\'\çL\'\ÊbR„³ƒŽ¨‡)\ìd¤)Ah\â’<Ç¤Vk¶\Å%ö–	BC‰Ç˜\æ?•HµT§-[½·\ÚDIÀZB‚”®X õ¨¥Í’©/%¤¸÷5†“µ?*K\ç\"™\'\Éú\ÙÂ«\ß÷‹‡zzò¥….LŠ\Î~ð?\ÄT¯#Î³_²\ïô¼\Ûm×›‘i\È\ë[`“ž•p§‹ü=$§û\ÄÀP\ê9¼o‡M•N©\'\Â&ytgÒ \ÒxÍ c%$]þ\ãË±eJ¤oq\ÃL%DFƒq{\ä\Î\ß\çR÷¡öGÛŸ\Ñb\ç\ÐÑŸCU\Ð\ãvœ\Ç;u\Ç>]•toZmY\Ý\äœÿ\0ƒš\ï»°\Ù/¢Â¢«\ÑÆ½)Œª5\Ðd\ãü¡5*ÓºšÝ©\í	¼\ÛK¢:Š“ö¨Ú¬§¯*‰œi¡ÜœQšF\Ö\Ö\Ù\ã¼Áq· §pvJJ\ê9õ4\ÑþØ´r’DyR_p‰BY\æ¥z­W-MqòIW&ñƒ\ß\í»½¡­7\Éð²P¶¡²\ë\Ù\èû¿:§55\Ù\ZzÎ­%#Q\Þ-\Ó\ÚV^=³Ž¨ŽA×±Ê®(\Ú\Ý\æ È¾:•ˆ\ËX\ÃRT†ûœŸ:YnkE\\Ì‹”×¦ðó¨;”Jq\Ì\á\ËÂ–³\Û\Ô=\Ð|—\Ö\Ý\\5”\Ì\áª\íƒKh\Ø\éµ¤K\Øo•:ê²†\Ãi\æv3š\ï ø‘e½\ÆcMk\ë„kE±¦Ì…¥•”98$r\Þz\ã\Ç­;q*\Ô.Ÿ´µV±zC\áOvV†#(­²œ€(>\'®j©\Ôúš\Õcº\Û\âÜ´­®T\èE*[D…«²ñI#–q\Ë”¦R\Ëk¢\Û¢•\Ã9©zpH±®J -\ÒX2Û\×\Ó\Ë\ÓS³\Ý\Öó†±.¶öœj<‰\Ûng-€\ê†\Þ|ð1\è±S\Íq¤#.\Ù\â—m\\<\âT\ël‹ƒv\é’--\ÉnB\Ø\í €ß§4“ù\Óv“\âw/¯YÞ¹\\\í¢]GjÜ„§’øPAøI¨÷nšOqÁ«Î±ŸN.\Ì\Ôv¢ºÂœ\ì½÷{—.d‘øiº7\Z¸lD[M©˜\Ó\ÚCJ.Mq ”-G$%(û¸\'­cjÜ¡kÚ›4)‚œ“F­]\Ú=ºÚ‰W¹L\Æ(@.­J÷Aó\ÍTWN3]#^¤÷Ç¸Fm\Ã\Ý\Ð\ËjJB|Ô®‡•TLñcW\ê[0\"j\'\Ü\r·‹‰9\Ú	ñ:Ž\Û/@9.5i“\Z>\ä2˜¾’1Ìƒ\×½+–\êo±$¸#\n¡SÌ¼švWm\Ñ!\År\ìûpž{\ßXmµ:Ÿ˜ñ¥\Z_‹-k-TÕ§N\Æ/\Û[dªT·“Ø¨/Á)A\æk2j\é³?mÀºOŠ\'¶\Ý{R½\Äg—,\n´ø3¤õû¼-\\ôv[¶%N)À\ÛXè€‘Ï—­]~\ä\å\"3„\à\Ò ‚<9W•)(KÀ¼0\è} \ê3…ŒŒ\Zg\Ö\Ó&À\Ó\æ@‚©´\Ö\ä0“‚¿:×º\ÇURœpº„7IEŸ.\Z\Æ\Ï/³qRž[[\çó¨E\çŒ3ã¬µ\Æ\Ój÷¤½ü€ª\"\í\Ä}U\'´m.ˆ©*>\ãi\æ=	¦V¥J¼Ç’e¾\ê\Ö\Ð\n\nRyz¶¶\ée\â+ýžª¦„s,¶\\Sx¿­Vý±oŒ	\ä\Ø$~uŸ½ ¸z\Ô3¡Ø®WUKnÇ Oh¯•)z:¡!rê¶¶\nŽUŸ\n¢õm\åË•\Ù÷\ÜQ*Z\É\Éñ±\é\ê\Û\æ¥9eúº«\Ó\Ç\à†©²ò7ôÇ­;\Çl*”’…sÏ…EnmeD\n²´U¿öž™‰9m¶\â…—mO£>¤Ÿd£C¬&Î…ŽC&¤\î\\\ÛJ6¤Žu\Ò\ÉY\Ö\Î\Âyiþ5\Ê\á2C+%#<«.RÅŒÚ®; ‡»…\Ñl…8Ô‚€>\é\æ)»š.\×‹¥\áb d8\áÚ•+\ÈR™wt%\0!Ÿzšq—h¶v tqB­Œ›y$\â£\ËD’\×q´3¢5Á¹ +’\Òr\çMÚ©\Öj	yiÔyŠ„Ëq„J4û,©•ó÷V9W8\ÖMHó\âj®òpõB\ËUk“Áù&v‹¬I,†\ä¶vœõyÓ²ž‚\ëa¦R±\àžUe\Ûd\ìu{·¨ùŸ:{fä„€Pq\ËÊ¡\Zx*yY\"¼Yl·`+\Ý!\à*¨‡!¶\ÊW¼\îÎ¬~.\\Ð»-•\ç{\ãù\Z§\â<­\Ù\äH§\ënHÎ²)3Pp?S²Þœ‘n}j%™%Á\ËÀV—\í»¤„®J\ÛR‡<+7ðQ\Ù.3-ñR\â”[\0žyð«¦‹»H”\Ñ[\éc¢—¹\ßxù|…e\êt¿=ÉŒW¨[TZ&Œ^  ¥]Ô„\'—¼¯õ¥\â÷–\îÌ“ŒóP4\Ëxa™\ÚzJ	aÀ‡\Ãm)\'˜H¨õª\Ì\Ã©Je+VÓŒ\ÖU¶J›=¼ò9]Qº\ã,v®Ž•Ü†\è)XºHIÿ\0.“Ÿ#U|-;¬\å\Õ,E„‹¼B\Èù\nxb\Ýrn\Ôn-j%\Ä%Xlœ…,ƒ\ÓÖŸ…wV·\'‘7*g\Æ	\ë7V\ÔOi\r`xœ\æ­.jý)L¦\Ë6\ì\Ìi\ÇJšy[\Õ:\Ëk\rXT\Ü\Ñ=\äS»ºº\\\É&c¹Ú£qðª#®”d[=õ…Áuqf5\çöE¶Ž\Ó_´\Ã*•%¶]J²ž:ƒœù\Õ_ µ;\Ú2è¹ºˆSa\ÜÂü’¥4ßI\è<±E³Y\Ù\Ën¥™²\"-\æŠ\nR³‚1Òœ8F«b\"Ïƒ~°±pŠó˜fBœ\ÇhsÏ™éŠ‡½¾[š)tl[X\ë\Ä\r&üM\ê)n¦\×b–\ÚKt)Õ’y‚°9s§úûXÉ‘\Ù`•o·G\ÞLt©\r£¡R¼ATñ¬8¶aÀ\í*»M¹g±L·Ö…%[ymG\å\çP\Ç\ïV}M§¤\é\æ­h`¬H—qp\0ò\áð9>u6ö¿\È\Å5‹\çV\ê®G½dÎ•,µ)Z„s \ç.7ó5Ÿ\ï’ôÀ˜.6¸2\äl­jZ²•¯9\ÎzœÕ•«oz;\\\Ù`Æ™i«¥¼¦:„F÷\r£’H\ærzTŠš\"Ý¤¢\Û\ï¶û¬¹V¹kJZ\ØøV9\ç<€ù\×b\â\ß%\Æm~ƒ\ì“9Û—­S\ÞNÕ¿*jˆÿ\0ù.Q^=JO,\êFv™3HÀw—9~](­\êÿ\0ü¾\Ì\Ã\í\äÿ\0u\ãg\Û*S‚\Ë\Ü\î‡^\çTeŽòÙ†n¶°\Ð;²=\ÝÇ ¨ý¯­‘š\â÷š|xó\"Ã³²\Ú\â)x[¾û—:\Ïzr<«Å¾\á£\í°\"²‰©TóøJ`Œ\ä\0£\Ëv:RW´\ä\ÓC5ÃŒ\äž\è«\ä­&§¦]t”—Q1”\"2\Þl¥!jøHóô§X£V\ßg¿qƒ&se¨y&@ ¡”œlÇ1hýi\Â\ë—Î¶\ÕZƒPFGpy\Õý´W›H\èG#LZûŒr5n\Ò\Ô9§\á¤)jeÜ»9J\è]#–\Ð9\àx\Ò;ü¨Œ9­»e\Éd?jjd?\ÚÈ•:\ë\Õ\ÙFno\ìZŸ|\Ï\çZCCè©±ô\ãMÁ}”F›>‰M:w2ÿ\0Q½x\ÖKÓºZ÷y»\Û\åY\äBzõ9¦vÅŒ\â‹—\ÞSŠ\è…j¾\rhC)Ÿ\ï\Û\ë\ÒÊƒ)C%‡[8Z\nz(z\×\\7MAvEñ\rè³´-\é\ÛÍ•.<\ã\ï.:\Ë\n\ë]ŸlSÈ¨\'ÀT…X™®m-•\îC*A\ì\ÎI®+\Û\Ã-(\Â•jÁl¯\ÎÉ˜ú\ëe3®©\â3ªa©n¤:‘\în*\ä3B´¥\Ò\Ég]\Ê[,¶Ì¨J’¬«Ÿ¥H\Ëjþ\ç\Ý%%\åû—7P\ZÏºNþ§Öœu[º\" y#9A5\à\Ô\Ûk\ìö\ÕÍºñú)^)&\Ó\ÉB\ä­N\ËAZ\ÇM¨\åýk5O˜”\ãŠ\éžUmñ\ïQH™*\ßiKFQ\Ê:†Rp	ùœý*’¼I	p´q„dg\Ì×»ôúýº\Ñ\æ5–o‘\Æ|\ÍÍ«n9\n\ål\ÖÚ¢\Ã	\È6«ª™a\ÂTPFF})©s79\Ùç’‡ZoS\Ù%$ò\Íh¸§Àª“\\¢\í\àö¥]\Æ\Ç2$\×ûIL\É+QW]§\Ç\åS)=’Á\Ü3\ËôN£VžÔ±\Þ\ÞDyYe\Ñüª\ïM\É2K¨s!^‘¨©\ÆyFÖ’\Ô\ã†4_\"jõ\Çwû«%–\ÜIø\\G¥>i­¥®¢5«5K\í\Ý$¬©\çb„óHð®ñ\Ö3\Ë&¹Jž\ÔbS&RZ9\ÊVŒŠ*±.,ƒb\É<\"qP“c½*Ay\â”ökÜ‚ß˜4\Ã?Hk\í/\Ú]-²‘&;Ë¡\Ò\0!#\ÞÇw©4û.#»‰örbJ’‘ò9:\Ú\ëNÆ·½5M\ÉÊK¯•…u?1º\rvP\á8ö4Úµµ«VF\ïq_Au\ëˆ\á>T©¾\ÝÅ«\n\Â|6=d²[¤‡­°›ŒT2°\ØÀ\ÏúÓœ),c+XCh$øÖ—\Úó”NRQ$?‹®-›L5\çaR\Õó#\0\Õa	\Ïq<ü©_u\ìS|~<WvÛ˜_d\ÐoSL°\ß<†kN„\â–L{\å™p_~\ÍWvbñ>g\\RD\æd`\ã*ð¬¥[\"	{i\Ú+\ÜZŠ²kp\ÊôÝŸZYn.¬¶–e¶T±÷S\ro\ïVY\ÓwAºÇ\ÛÔ¤+\à´—¨\Ëj;¥NO\'d\é›owT$:øl\àœ\âš\×ab\Ùql°óŠ8\ç\áO~Í’T\ä{¼uILH\î,¥»ƒ\nn@p¸s\ÉaXúVu\ê·?#\ÛdsY{Ó©\Äk\ÖÔ‘‚—šg6K‹Ep^u.º´„rMKq)>\émD|±H$)m\Ý%$Ž•}«„¢þ‘\nf”±·\ìˆ9¤\ïl}¡ƒ”§™RT\r5\ê3²_Š\ài~\ê\nNH\ê\Ó[Ã°Y)Çºi­ö\Ä.\ÉÄ‚O4æ·IO	W¬œã–ˆ^“Ò±\æ\Þ\íö\ÉgksKJ)\ë´ò8­~\á†!\Û!D’P\Ë#\ÆB¶²\Ñû\Ï8¯>uZiXñŽ¤²8”\'µ\ï\É\0úfµ¨¬Le\È\Òm\Ô\ìZOE*cCJšœ_\èO[|·Å£ ñ6\Ñ\Zf¸È·H¸»SO´¬¯½H–RD’9\Zª.Ñ¯ö\Ý,Þ˜\Öwwb½\r=\Z\ß°ùû‹ü~…½a´9†lŒQ…GAlaµ„\n\É<m\Ðñt\æ½{XqSE†\Ý\ãyŒˆ¬)\Å601ò«m¢Zx,òP¬w<¢°\à\Z\îo‹¶@KÞ–\Ê\Ö\êH+^\Þx%_õ¡]¥.·‹ÔŽ$Û¤]\\nYi†™\ì0žY\n~u¸\ê\r!\Z\ÖfB¹J¹\ìRc\ÍL’\ÚKg¦R<Ç…@¼–\ã´\ËJ\ìP¡€‘\à*•&š\"\ï•yHý5övV›_`«H\Är5¤¼ÿ\0`Ó‡*I\í¿Ÿ–ý\Øô\Åö2qnð\Ä\â\ÔTTüÓ“\ãþò\æ(­ºÿ\0ü\n7žL\å\í\Í‰b\ãUÈ˜\ÛJv\Í!+^\çY¸qÖ­2\à•;&ó·\Òp‚R9+\Ã\åV¯ö>\Èö€ƒ\ÖK¹\ÓQT\áþbO:¨žâ’\ÙÀ9#‰¦R\Ô\ë¤ö\å½qRS”€|×¥Q(fm–)\á`lº\ê\×û£)\r¨‰i­©	=|I&¼[£©É¬¦t…%—ÁZ•ó¨ŒyQC™BJŠy»¨©;óá‡˜›¦\à<˜¡„¥\Ô\ÈVHs\ï\é]PD7²\ÂN´]ªDhšZ=\Â\×\Ý\ÛSEôH;ž\ÏSZ—‡œu›¢4]¾]\ËPÀR&\å”A)÷’¯ü\ÂG>½I¬Mj»\â]ik\ÚP\ÌT\Î\Û6\çtR_—!³Ø§ki\Ø9\'=)-M	½\É\àkMf~26¾€\ãf¥¸\ß\äÆöR\ë®FV\ÏyG;±“ò­#e\è\É[‰Ú¥¶\n‡‘#a>j­1;S3X¥\Ö\Ê0Ô¤«³5±`\ê\Ý1\rÈ¢^\Ì\Å\ÜRW%{²‘\â\r+¥½i÷BO\ØÆ®µ6¥ÉŸ§\êWcÁ½h\ÔÀob§ºú¤•svB@¨\ÔýM~\Ö\ì)SûV\Ô1\ÚJBBSœ•Ò«‹\Å\ëõ\å\Õ\'jŒ—}\ßÎ úòz\ì\Új\åuI(XŽ¶¡\àT1üy-÷5;Y=F\Å\n3\Îÿ\0ª\ïh¿j\ëŒä¾¥6\Ú\Ë,«9	@\å\Ëóþu¼\Ì\Ú\ê\ÂU<i\è$F¶¶\ÜvT§\î\Ú\ÐIñ9ú\Ô*\è·§\Ú\É*g!xð5ôª¢¢°#oÉ¶zuÍ­‡I\ëÎ“¶öSšòü„ª\nU\å„\Ò$>KdJgý\n‘\ÙÈŽ±÷]U»m¾.;M¨9–\Ü@W\È\Õ%qt¥-+8 \ÔóJ\Í\\\ËhiJ\ÉH\äO…/|8\ÈÎšo8-û%\í©_f·W€\Í>®r‘ýGÒ©\È\Ó%[\ß+)Ry\æ¤ö\Þ º\È\ì\ä•yn¬\Ç<£n»\ë\"X\æ—dâ”Ÿ\ÌW\'-\âI	N\0\Æi°k\è®ø\0s\çL\Zƒ]™\röUœò*ðÔ¿Ge%M\Î\êÀ{±Cƒ	øˆóªóˆ<@q`³¾ŽŒ>\èû©ò¯O¿-ô/V\Üû\ÇÎ«kš÷M}x\ê²)\í={žL\ÍU›NHVÄ„ô\0bœ¢=\É<ü©›z,Š\îƒùV„83[\Üò\ÉÅ‚PflwJw¸+e\èw\ãH°µxmœ6\ì=\î\0<0•b;c¥+B¶nMJÑ²y;\Ûb:\ÈJUƒ°ŒœVOª\Ö\æ“CzI5”-M\ßAj\Ò\Zµ3!/·„¨m)Á=)\çI@D8\ëe·\æTIZ‡h“£¦E¸L\Óö\ëœw‘!´:™O…¢21Ê§z{´R\ï)\ìð‡3Žµª¦1œc&…9V\Û´nQO\Ø\ë7\Òv‚ðP¥V«\îKN:\ìþñ)\0ön(_<U§!Ù™\Ó\ÌM³\ÜÝº2¥¸R\â\ÚÚ¬ƒ\Ìc&¦65.LK+•·\î\ä\àŠ\Ðu\ÍA3’”\\š“w\Õl³¾wsq$\í$#¡\Z„\Û\ÚDgmŽ:•Œö©WŸ†*-Jmõ0q{H$©DŠsœ\ëÝ²û2\îâ©³‹á“„#,\ÝóN\êKHP\íÔ¨\'\Ó5«G3YBkK	ÿ\0š\×^5«\é2\Ý¶gzŠQ±$|=9bª*pjë¬’\å\Ö\Ýraû²²\Ú;òr\Ëlû´øŸJ·\Ï!œUi\Ä\Þ1\Út4´\é\î\àüû”¨\åÄ²ÀÝ±9\ÆUŽc•5­•j¿\î\à\nNXf\âæ›¶i{Ä-Ý®l\áOIŠ“µ¥\Í\Ì\n¨dEIt‡Ÿ(J\ï\î\è•h¾+q\Z\Ï&\ët›¦l\é·JntCo5±\Ä-G+#<\ÔNk8^®¼\Æ\âF\×Cƒ Ÿ\Ö~žRk»Q“ô¿\Ø\Í\Ö\à…q@\rv\ÓqÓ”—ô¢’{I2ýœ´ô‚\Ò[*‘?)Jp%º9ÊŠÜ‡\â…Lsý¥‘g<ÁA%­58wxw‰e›eÅ›–b\Ïx…%O»\ÔÖ«þ\Ò8·I<·7³,¯NE\n\n{¼Hñü\Åd\Æ\á\\ ]\\…:&T¤\í\n†=+\É>\É6ˆ1S\Ún+S©\È€§›d¨‘\ã-.\ì\ÚU\îø”Zeµ4ä¸ŠŒ¶’\ßa\È)\ÅyŸ:Y™ð%­ˆ†9©G\Ä\n‹X‘\ê\n­½\á\Ç \ÈF\ÖÏºÊ¥Å•‰­BK\Å/-``œ\çÀT3 ¼óLL’\ÜgZR§[NHI\êp:\â§7ý1§\ì·t\ÇÒº„\Ü`¡¶\\f\à¦\ÊT§HÊ’¢©k——\Ó,2ò\Óú$\ê›\ÄHÚ†\É.\ÐH”§>8\éôu£8m6\Å\"2\Ó\è\ßcK“N\r\î©\Ó\Èg©HÏ…Uü\Ð\Ú\ëˆ\rÃ¿Î™)¤FŽaNq\Ç@\íP>\0„Š½´d­-¡uÀ\Ðv­7Ý¹4d.@^õ¸¯+\ÈWž²­\ÄøFº³e|r\Ê*¥®\çyvtEFqr\\R›\';I=)“ˆö\Ñt\á¥ñ”en!°°P?Â¤š†ñ½c€%7Ú™®\àg\â\çL\Ð\å÷·\ç[mÅ¶¦\ÈXÇ¹´:\É\Ó\ÃÛ»{\ãüžŽ2V\Óü£)µ%2fiˆ\ÛJR$Ê†\î_Ö¢7ûg\ìu\êks3\ÒI\ëÌ“Ö¬ž h‰šoSªe˜t÷\ëk§\áI\ÉF|\êº\Õ\×d^\æH¸,–œ˜\â\\y£\à\à?\Ëø×½\Ò\ÍX“LòWCchŽN¸(#–T3H[t¸<idÕ…\ÇÙž”\Ó\Ã\Ú<’|+G\àI.+\n	\'\Ãù¥\îŽAZ”(`\æ£\Ò2\âB@$õ\å]\í\î()88ðÇ‘\ÉÁ5‚u\Ël²[ˆSR™J÷\0Hô¤’¢-<Á\Î\rr\Ó/	Ó¸òj½\rH;®G]§fbÍª?¸²FC-X\Çð¥q\í.:FG^£ nJ!D¥8EŠŒ©\åòª}\ÎK½¾9!Ú‚7r‚¤ „\ç•To(8§IQ«£[„¢¡ \çªS´)RÂ†\0\'•©£{“fN±mx€w\íò®\Í/bŠ|E}lnyy“Iñ/,øfžK%P^\Ëmõ<«M{9\ê5¥™’\âò\",¶ƒ\Ï$\Ë•\âH)a°9s\ëVŸ\n\ï\ïZ¯m–RT\èRržDdRš\ÈoŽ}2\Úòh-ªµ]\ê3\é\Ô\Øh‡“€˜©h‘\æp9Õ‰iVÕ¾½¡À†–¢C\Èòªz\ÛrS\rö²yeÃ”Çž+\æ×·šÑ–$\ÏRm\ï¥H,¨ô8ó¬\rD7\Í5\àv(E¯²À\Òw+}\Ê\ÑVû{c	+)e•\Ï3\Ï\ÌÔŽ\"™Dy*RNÐ“žµW\ra©½Œ\ZCjP=‘sš™Øµ4	ð%!r\rFyœ\Ôo†\ë#2\Ú\ÚPk#ƒËŠ$\ÅÅ¥\Ç	\Ø\0\ëó©$\Ö6&\ìHw¶\0¸zŽ•·O&\ÇT‡T¥5ðò\éRû– R!Å°”£iWk¸õùRóÍ¢ø\ÆM,7\ëk|\ä§®|k\"h%c\\\Ø\0ÿ\0õ\"µ\Þyiÿ\0HXŒ\×\íþ¦¿¸†\íC\Þ\×f”‹}Å¸2\Þ\Ö\ä¸2–ž*•¶\è\ËC7»•™\ÙR\æ;µ2®÷ù_\â\ÈQ94O$ƒ\éW¥‚»œâ¦‚˜uC¶%X	H\ç“ôª—“ô’ô„\çZ¿:%vXm¸j$’\Ø\È¸ª}JmØ“\\/öW¥ûÿ\0Fn\â5¦­Ö²˜&\Âôû¯¡·\Ô;´xmŒ6­ù\Î\ãŽf²\Õ\â$\Ëlû¦s\È‹)q”¦\ÔT‚ ¬\â+UXø\Å2\çg¸j-_oS‰…\róî¤°NRrIª‰Z¾>¬¾®\ã\Ó\Z<8Í†\"¥¶voltR¼\Õ\ëP\Ó\Îo†‹n­B)®\ÏÐ¿b\Èq\à{=\éø‘$)ö›vfRv\î&K„òò\É8ô¢¸{8\ã¾\Îzy\Ç~%?8õ\Ïþ-\ÜQ[õ~þŸ.Ùÿ\0´~s)ö‚µ\ÚÖ·\ZT=ö©	\âG\åY»QÁºÈ»rT Ú\\„Œ\äc­Eý¢²\ÙO¡[›Š•M‘§\ãö¬{‰ûgùY¦\Õ{—\Ô[\ç \Ú1È¹óªg&›À%ÁmW2v;¹\Ò\â‚Vœò50‰\"5šda%•n=\í\Çp#Ê¹*%¸\Ê\ín\r\r\åG\Þ\æµ˜\ãt‰\ZU½\éöå¥…0\ÙW¼zxW=Ì´Šö\íLfx\Û?m¿q#¥x\äžI5j\èoc¶oºÌ±Â»±\r­‡\ÝØ®c–\Ñ\ãT¥\ët§ÙˆR\âËžó ŒdùÔŠö(\ä\Û\æ´\ì}„vnm\ÈR‡…I\×vr3q|£þÍºC\én\Z;r½\ë6\é÷Â·?þO$„Ž§ž\ãFZ\í7]kz\×m]ªB\Ûð\ÉC\ë<ñÏ¬s¦\ÄM\Þ\Þ\ã\Èj\"ö$v¤\à\ç9\0š’X/·)W¸ó®3Þ‘oaô;%•6½¾\n&²µœ\ì–\ç.\r\nµ›r×’\ÙÑ±-÷›\ÕûR\\^2ZS\Ëv\ß!N”†Óœ¯3N_\íy0U.\Ä\êm\r ’\æý¥ið\ç\âj«wˆrõµþe›N\Ùj$\Çb$fˆW© yÕ‹¢½$—‘z\ÖKÂ‘û\Î~~U\Ý? »\Ûs\åq¹z¿±•ðBu§¹ñ1—­Èª”¨KEDv·)*ò&©\Þ#X\çZË½½p§÷Ž\Ím8\0QN3<¹\ÖÜf°hÈ‹¤\íLE[„•º¾£\æMd?h&\ì©÷9*}\×\Þ!DòOP@þ\éa\é\ß\ÒA8™_\Õ;›EJû„:NF\Årü\é±Á\Ù=¼s\È\Åu“)\r\È(YŽ}\rqqÔœ ¨cÎ¦º9\Ñ\í–C©!@\ã\åS­Ob¶¾‹]ÿ\0O·´\\\"“%´ô\íQñU\ïhR S\ÌS-5wZnanž\ìRW»¢B†\rw¾8\è}Ò´	m\"SJm¹r¡\î«\å\áV;1¤ƒ³!@s4Ó ®Ð¬\éj\Ö\".(ieM\Æq9—^¢¯nŒÑ·;kr\\·Ê‚\â€Q\Þ÷Gä®´­¾Ÿ+¹‹§_\Zc²eVˆm¤\à \Ò\ÔF(l©…\ëI³cœ–Zy2#¼€\ã\ãIõõ¦Ñ¤\r\í.>ô¤Á€Ïº¹d©_…\Ä\Öc\Ñ\Í\Ï\Ûòi½]j*\Ï#ª¢M¹:›M®\ÓgI;Ž\Êw-dÿ\0þ\ë] pn‡r=\ß^ª:§¼\Ó\ëMµ)1Àl\\>*\Î9V„\ÓÑ´F‚–«š\î>\ê»\'§H\æòA\ÊD¦¢œiq)„‹“n…\îŒùÝœ\ä)<z-?§ªj\Ì\ß&ú\ïzÏ‚\à\Å\Ï\Ò$\È\Ø¹J\Ç\Ë4\Ñ\\#©§k±\Ù j\Îi®;g\ÝO€çš­¤žä¹´2×šsRK•7&\"\ÙQ)cñšˆ—w>…x\ãûe¶\n)J\ÒNH\æEFQSXgTö¸¹Í-\ÍD|\0P—p¡\æJ÷f›wf™\îõÜ½»’*w¤´Å§R\é\æ¤ZnjSkBR\ÛOÕ…ò\ç}\ä@j+¬8}©´\ëO*\ÛIP\É\Ø–\ÞôJC\èiK½.p[\àN\Z˜I\áð\È\Ü\èNBp¿\naq‡**šyùS¶u\Þc­„!HJÊ‹Š\'\Þô5oP8¦ƒ£­\n\É\nm^\éAñÈ¤­_2\Ô\Õ!!xH\ßYò¥\Éa¢n\åÁ¡t\×˜x7\åfŠ©\n!)q¿tŠš]gY\"\\\"µ:‡qM­³\ÈgÎ³N–2-\ÍÊ–\îäª\')Ió5s·=®P{©’[i!j\nòü«2\Ý2Œ²ji5kÅ ]h\ë{	K¾ÿ\0yI\Ú|l1\ÏÂ±6‡’\Z\â°y©ô\ã[a\'#ó¦½+…$ÿ\0E©³ð|Z¤”#Ö«›þ‘C¶‹\ë·#XS+-IJ]Sx\æH\äOYkŒ\È\ÌËŽ\äGÑ¹·P´ùƒÖ›\Öi#¨Ž|®„)µ\Õ×“ó“‰¼• lŒÎˆÄ™J\ÔN*B\âv\áF40A\Ç?¿\Ïù\Õ)¬lñ#Þ—\ZÍŸ\Ù\Èi/!(w´-‚?\ÃY\ã\ÏQ[XðG‰óx‹l–Ä´M·!n­\r©_f\Û)ø9ù\Öl×¼,{‡¼Ur\Õr‰)yiœ¶\ÐB¥\ç*\Æ\Ó{‘n3XÁ¡| â¤žF\Ðö.¶Î´û>X \Üa»ô»1}“©Â‚%Å \ã\Õ*Iù\Z*\Î\ÐN6õ…—\ZBP•6Á	OAö\rô¢½Y\Ùý#2_“Áùÿ\0ý¡r\ì­ñÅ†¯G\ì\ÛÓ°\Ý8P=\â@}+8?|f\é(Z\íQRû )Ý€{¨\Ç#\êkY{Xðf\Ñ\Æok\è;¶¯e\riH\nB\0÷ƒÞ¥dò\åUO´÷³½ƒ,£Wi\Þ 2õ\ÆAj3ØŽ\ÞÇ¹s\'0Z¢u¹I´\Â3Š\âFm\Ô¹{¢#\É}o?,v²\Þ<¯ŒË˜°¦\ç\È[}\ÊV“\îŸB)’ñ-û\Å\Ûö¬\ÙK[8Jq‹!\éqU\06®\ãaW^Ur)o/(·,<>\ÒóôŠ5[z™¦oO6J! !?–<•7Y\í\Úz\ìR\å\É\äö\á=›^öynW¥D\íó®IkGe-–J0Ÿ¼iT$2·\n\ÖÒ‰MlPYÀ\ç\×Ä¼&BÑ‘´„[|>³ƒr\âÄ‰I€\æ[i²žAG\Ä\çÂ¦\'Òš§‰zy:KL[‡mnh~\ã¨äƒ„\íÿ\0»h}\åzRŽ{6ZõŒt\ß\ï.;O4ù\Ú\ÚUµ\Ù\ËR<‘\æ|kXÅo±Û£\Ø\ìvö`[¢§kQ\ÙNÔõ>µ¯¦ô\å$¬°Z\Ë\Úø\Äk\Ñz#Mðò\Þ!\é\Ø\År>\Þ{\É÷\Õ\âs÷G §‡]\Æ\çY$õ$\×Ð±Ž|©ÁÜ§hWZØ„#„…dÜ»c&¡Z$%/2…\Ê\Æ\ï di\é!ø¨B÷: @ñ\Ål”´‰e#<Ôœ}+{C¼§õw\ì\ÕU­KôÝŒUZŸÃ’\Ý3Ä²Šz{h\nlŒ­$8”eGÂ¾<\ê’\âš<ðz\×\Ùjp œŠ\Ç4i˜¤+;/Z~¶]›KIJ×„n\n<\ê>YÞ’¤€|\é\Â\Õµ¶\âŸ‡4y\Ï\Ó:Ž»[\æ9=¼¶{%¥Gï­G§\'9*3N\Û\ÒÜ´\íIX÷OÖ±\Ô=9ky\Ëz¥AYiüoÂˆ$ddzV–²p/‡©…\ïb¹_\íI’\Ú\\Bš˜¥ òñ\åOR¥.…\í\ÇL³n–©—\Ë|(\Èk±’\Ó\áK™ø±\çNýˆa\r[ã²ž\í;Iþ\'\æj3¦\Ñ|\Ò\ÓXT™2\î\Ð\Ðv-\Õ(¬ œ1V³#¹µÆ¢=‚22ƒŠf\Zd¹òS=D°¡ž\r\ÕL(Á%m\á\Õ%)N9U\Ä;õÉ=*\Ñ5¢2˜«\êpz¤Ö‰Ÿr£ \ï^y\ç\ÃÒ©^6[\ÙLt!°\ÉE t\È8þF£l\ZMªi³&\\òüž\É9\Â\r$q\Ä4Ch\ÆI\ç]g\ÌI’øc®ãœZF’”\á\æT+1¬¼ŽŠ›9u +¥Kô¬tË¹Áe\Å\à.Ci>€žu¶¶§Ka9[Š\ÂEJt\ÝÁ7«­¯\Ý\Ú\Ì\'\Þ\î\Êtq*ð9ô5:£™‘›I\Z\ÎÕ¥\ï:N·\Í,\Ñ}!!\ÉvñË¶oñ£\É`}jÉ°^`kK*_-…\Çu‹mc\â>9ÿ\0ˆSVŒš\ë\Ö\è\ë8ZHBˆ?‘1]½5vq\è\è(Š\ë¡N´ž‰\nû\Ã\Ó5¶²¢—ƒ6ow}•¸\\\Ë7V¯±yM<k[_ˆ\çµ^¸ñª»ö>™—)˜\ç1„r¢¾yZÏ­l=GlU\Î\ÔôfVÖ\ã*ü.Ži#ò\åY¯Œ\Ú&%²\áW\Åp1\î’m¤\àµ!#\Þõ¬OQÑ¥ó€Öž\×%\ÏhŽDŽó/I\\GV` òQ\ê¡\éVF‚»²ý\Ê<V“„$+Äš§\ÐûR ÷HWg\à\ç³W!Š’i›úlÏ°\ÓN”©WœŠó\×V\ÜZF–š\çd\Ö\ZIÀŽ\'\é¦\É\ê\âOñ¹}\Úüò\án©j÷¯t\Ìõ)%¶J\nÁ\êr9\Öýj÷i[½\Ù\å\ÔüH\íG\åTéš¢Í³x\Ê5}f¶\Ýr”9\n3“\á^q. )$\éH¯—¨6+s÷9\ï%¶c ­Dœd\ækI\Í(\î0…ª\Î9\Z\É>\Ôú	\é\\Q\ÓW¦‚ZføSo\íO@ð$ŒþX­Mc¾\Ûõ\r¶=\Î\Þò\\fB\Æ%9ð>F©?i—ø§†Œ6›úAñ\åH\ëgšT\âYLq>K[‡9N5\Õ.8C*#Ä¥´$ÿ\0*)^b\ÍO€š\è.TS”¼\×úDgù3û{\ê¨\Zk\Ú\Úü¸ý«¨Ó¬*>°¥jz@Ý»\Èb³õ—…7\Î7\êØ–ø<FTxŽ\Ç[ŽH¹(–\ÙX(Fzü\ê\Äþ\Ô‹^\ÑV¯´+LE±ñ˜“Î©½§u^°ˆ\å’\ßqzÔ–PÏ¥À’¾¿:„\ã‡À³\æX+O§&hk\ä\Ý1w›\\ˆ’\Ùz3hX9y\×[\Æ\áO‡2\à…­¤¯rFy‘Zó‡\\\áý›LN}\ËTš¡\ã§¤»½3·\n$x+Ê²¾¢\Ó,V I\Õ+oRµ\"ZgÁq¼ˆûI\r¡>¦¬ƒÁ\×£Êµ&[pP‡\ÈYy\\Ô„x§5%\Ñ6\é\\F½Ú´´xûŸ’¤¶Ò>Á÷\Ô|ˆTZ\áI\ï\èa\r¹\"C¡=šR’CŠ\'#Î¿@ø9Á‹\r­ñu#¶\ÒÆ¥Ÿ\"JJ·&>\îgo‘#‘­.›Ýž\ïRµ\ÅpX0-\Öû¶«sa¨¶\æž[‚G\Åó&œD€ð\ç\å‘\ëH;†ÀqŽ^>µñ­\á \È9Ç¥o$°)\Û\Ë:v\ç#5\Ís–i\Ìm}ÀŒô?:jœœ\n’ \ß\'‹J»N\Ù=}\äŒV\ãË‰WõDŒ’‘/²o\ä3Š\Ýv¹! t¤\äúV\â£/N\Ô7i\Îs\íg¼£ÿ\0\ÜGô¦©üp†ô«å’štn\ê@~•Á#\ß\ä9Ò©h-—Nw8+Š•\Ù>,\ã\çYx>·î¨Ê\ìX3;%o:l[\n\Â\\A\Æ\ã\ãJYqLK`$‚´¬`øf¦‘\Ç\Ñq\éXI»&\ÇK\Õ\ÉS<‡‘ÿ\0J\Ô<.*V•b\Ôë„¹nqldŽjH<fN\ÉBõ½ž*À\r·-O,z­8\ÇÖµf›†˜O\\\Þa8H˜IHð\n\çZtG8hJ\éx&6˜–¤v¤¢s\å_X.µ\ÆT	QJO2Ÿ]\ìûõò;œ\Ï?•zšœGV\Õ\ã\åŠy!\'\Ø\Ã!\Æ\ÛmKZ‡,óò&¨>9ß­ö\Í8ô\ç&¥r¤ºT\Û)NW³ò«“UL“Ú¤Fo\Þ{\ìËŠ8JGð\Íe>=]•!‚Í±òû©^RR=|)[ù\\\Ñœ”²‚œYH\æ²I\ÏÎ½€2y\×Sjœ›j.­8	\nWÊ—\é-/3T^£Z˜A*y`¸I\ä–\ÇZ\Ì\Ø\äðþ\ì\Ú3OÉ¼;Ù²‚©(5\0s*?{\ä*ý»pJ%\ã‡\ë\Ño$5uŒ\Ùy·ñ\Ñüdù•1\áoaYÞ¤\Ãm/²3#šF9Sy-¹\ßPCI\íÀ =1žµ¡ME-·”ˆ³ž¢‘z\Ññb\\R[¸[Vm³[=Ró|?4V½ù€·[ZÀ\Ú\ã[Ÿ\áTô8m\èN2*<c².®‹\ÞYl|\í“\Ìü\ÊqWU\Ókö\Îö HFN)¨ü´ø’g2T\äD!\ÅY\ÊUŸ/\n‡\ê\í#UiûÍM%R#¬ÉŠH\ÎV@üúT\Â\Öbµ{¯·¿ò¦¶f–oW63¶_O¡Jª6EN.,\ínPy‰‹\äI…B\á[¾\Ñ\åƒ\Ú#òH\äE(±IŠóia\è\Êm\Ô\çr²M>q\ïN#†Pjõm·…[5$nýœ\á*\'\í<°j\nÎ«a\ÍÀ«°Rò9•\å5:¬q5*ššLÐºQ&\Ì-7 ¨®…¥j\à9çº´\ßx‹s\×Zª\ãºÆ·¿\Zm \àÿ\0ÇŸ\Z\Ä\ÖK\ÊW¡\Ð\ëÎ´¶\Ø\nJ”\Ðø†áŠ’\é»üÆ¡3Ý«\î1š’•ÄŽ¾\Í=ž9\î5ƒ\êZyZ\â\á\ÃG§\×jP«w+\èÕ—zL^·^õmŽ@!¶{|/>G<©ƒ\\q5‹”\ÑxµY¢Ý­V\r\ï-n¹´,\í>‘\éÊ¿;\âMŒü‡D§\ÖòšuEµ¡[•\é“\ãRÇ¸µOØ¥Û—l7a-ŽÌ®\\…´YQå”„ò8õ¥ö\êaO<˜Ðº™XÜ£„n\í©Ù\Z6£¶[aG{Pmuh[½›\ÒFp<\ÏÊ›}¦.\Öö\r!ªgI`þ\Í\ÔQJžmYß—J\È/ñŸ];`†\ÜFÅ¦\Ñ#m¶\äFûR°2V¯†½i­s¨¸™s‹a\Ô\Ò\r\Æ\ß	Jt4µr\n’•\æk‘Ž¢M\×7\Ã,¾tñ*\Ñú+\Ãë¥º÷g~\ëi’™$KqM¸žŠ\çƒüA¢¢\ÌM¸\×\íÍº¤©Aù<\Òr1\Û/ÂŠô4\Çeq\ÒBym˜SûJ£¥\ßh;K\Éa+S\Zz*œ\å\ÍI2$\0Ÿ®k=½t®E;\\ˆ–AQI##´oö‰\êp=¤m¶eE_{—¦\à–ä¸4“*H\éóŸõ\\Sg¹ˆŽMM\ÅJlöäµ´´¿¨Uv\Å\ç(Q¼I—V€ÕŽ^Z,F©@y—\Õð¶GN~f³¾¼\Ò\×!¯µó›.\\¥\Í\íR\ÙNT ±\ÃÒ¬;:d\Û\ìP.+–¶c\Ì;T–H²\"|«Ëˆ€ut»Ü®S)‚\Ú\Ñ,+q\Î\Ð9Tb\Ûhb/r\ä›û.Y§\ê;\Ì+%ö\Å\0G\Òiï‹–‡i¼œ¡*?>u«$¾©\âº\ãP®i;v’\Ð\ÍÏŒ\Ò\Í\ÃR\Ü%<±…-$aåŠ™9ú×«\ÑU\íÒ¾Ø…\ÒNxG}\ÒV<°)j¦\Ý\Î3\Ë\"•,\äE$w\å\ài¦°V¨9\ÕÄž^\"“\Ì)[eI\êk›\Ò\Ó:\Þ)\ÜR9\nGoxI*F\ÒG…w(‹99Û¤é¹¼®5¿\è\rcMsiq\ZƒQ\ÄY%QV©\Óp\nÿ\0ò­™7kûIŽ_\ïmN|ðkñù¢]\ÇR\ãp’\çvšŸ2‚S‘ù$Rz•‘½9E\Ïc`sµ#;±\ËÂ™\Þ9{h¦¤\Z€¤¸µ¤´%IôV\à¤\ï\ê¡\ÏTŽò9–\Ô\ä@Q÷y\ÒW–€´?“îœœR\Ønš\rüIÂ‰\ÏZlf\"\Ô> ¢š\æKó†ô³Ä6°±\Ù\Üa6÷ÿ\0^3Z·K9#¶»ö%*–6ú\à`\ÖS\á\áý™­4t‡Â»6¢$+?w\Ý\éZ\ëO\Ç\nŒd¡\'l’]Ï˜\'\"µ´ñx½\á’R°Ä”6”ƒ»<\ë\Û\Í-\èÎ¥ÌƒƒÓ–+­-…Hii\ÉÀU.{`iI\çƒN\'G\ÙY\Þ4´=CsŒ\Ã\è[¨oyÚ·:yU/\íÝ’=•®iH-?s|ö²\Ó[HðYð«\Öýc¼]ƒuv ¡’ÖŸŸ\n\çi\ÐZvÚ…*©±\Ú$…­cr\×\ê¥d\Ò\ÖA¾†+’]˜\Îõ?fY,\Õ&$VB’¤\ímc\ÔÖŽ\áW,º\Ù,\"d×ŠTû\ê1\à=*¦\ìð4\Ã\Ò-\í0†¡\ÈYZ> úT½¸­5ð `ŽDt©\×B,\ä\î\ÏbLT°ò\Â\Z%*\Ç?,W‰°I_{(KOf=R)ü\ÆI\È)\ä®F“IeL´†\Õ\Ì!^\áÇ…^’*ï²‘\ã\ì)04Ý«\\BJû})rfR€\ë\Ø(„¯ò\Å]©¸\ÙSÙ€Zy”¼ŒtÚ¡‘Lú\ÏN1¨´½\ê\Æúr‹„Xþ-¹Oñ\ËÀ;¼‹¿l\íer¢!\Ût’|\É)\çù\n­-²%&œGùŽö%ˆ\í’“\éI{Æ¸\ÌÛ’\"•zf¾\ÇtJt¯;‚]\Æ~U\Ñ\å\ï›%]GfR$\Ô\Ë,Š\Â#|Y\Ð-q„™†_¹Y\Û3\á„rZ¾\Ø>£ž+=`q\ål¶„œ¨\ä\ë_£úe\â\Ì&F\à„t\Ç\"Pk+ñg„I\Ó\\Pyˆý«6¾\é\í­t+\ã@ð\äMdúµ)X¿ô·Mf>,Ž\è­1žÝ¯&\è\ÂV»›-!´¨\ÓEC$ùJ‘1\Ñ*,Ž\ÆkQ8\Ä“¶Aòñ5\'\ÓzwMØ´ö\×eIc¾°ó…i\ÜV1ž™ª\çT\\¤¶ˆ\ÊŽÚž%\r8I«\Èj2\ÚÀô\íœð¤ò1¦D\æ™ZŽ˜©VJ{?uXù\Òy\ÍI»\ÂuˆQf8R×¾H\Î\Ñ\æ}=k¼­E:CK\Óý¬WËŠ\Ü\ã\Êoš}ªnÛ›Ì‹m¼º†»\Û\á8÷€ð®Ey!–ú%úgP³bn\ÚÆ¢n|\ëT4$Ê¶ö˜žŸ*žhiP\îœS¨´\ä9V›T\î\Ñ\r\Ây\Í\Ùû<}UOûA¤HÓŽå”¥n©s9\áuñ2¸—b²[¤¶\ìks/¼þÓ¤Ž\\üM>[™bœ’Áú-\ì|Ä¨\Ü\rµ±5AN¦m\Ç$ò\ïŽ\íþ¢•{)‰Cƒvþø®™³‰ºNm\éË¦(­Z\Þ`Ÿ\è„¿´’•ûP\Ú\ÞakJ]\Ò1›R€ä²e(ù\äŠ\Ì\éÔ’\\q\Ç.³\ì•#cŠ_5,Ž@ŸÊµWö‘HiŽ?\Û~\Å\Ç\ÜVˆžÏ¢B;ÄŒœùÿ\0ýVl›\Ãve„\ê\î-Æƒ©e\'o–wRšûŸl\ãk\Öm3ciµ8\'Æœ¥¥h$#\'¦<\êÒ¾ðö\ßy»²¬’B `  ‚IG¥D´V†ºka6\Ýc»HÍ’\Ò\ßu,²\Ò@ç•Ÿ\Z˜pª\í5\Z‚G\rÞ„.R.YŒ{\Þm–Ò¬8Q\æ9g5\Úk\Ý5‚TÉ¥É²uŽ\í	¤\'³iZC#‚FÒ»8\É\Èð¤ÓšJTÒ†\ÆÀB1\äxfR›\Ê\Ìx\æ½]oQbs\æYG‡}\ÓÖ’½ƒšZ\ë‘\Þ8Cƒw•$q¥¤\ÃÖŽgw—SX\ÎEGû\ß\0’¤ƒ\èjH=Ü‚*=vm¶d-E`ûÀ•T\Þ\ÞK!‰,v—\Ù[‹;¾\íd^-.-š]úÚ¥mf<‡_{´òó«þ\É\'P½w¸3†\äECI\Æ^\Ø®:U-\í£\îmu\ê\\d—\\\r¢$a\î c‘Q\ê£Ê¨²[‘}Kk3-Áµ¢SjuD$# \Ó[\åHYZ†wr\á:A“$«whRv\ä\\©²d¨\È_gœ«\çJ<y°òP\ÊÔ³‰ z\×K\n(J‘\în\çIŠûDó8\0R»z\\T˜­´\êuÔ¤\'Ïr?’:øF‹\ç\í\î\Ø\ÚX*‘.+l¤s@bµõ†?v¶FŠ¡•0\Ê[8ñ!5™-‘^¸\ê.™	-\Í|°+O[ƒ(•ÌœVÆ53S$\ÚÀ\åjOgs \ç\íGÒž;$,Œ\ãš’¢\Ô\È\îÅ­<öa#wZg\ÃLˆ¨­!#¤ÊŽP¬ `yb%\\\Î\0®A©4\È\Ï&RRR¶Á\'Ò’4nv”lK]\æ?‚7{\ÉŸ\éRV\Ølº8\Ç:ù\"Ú®Ì€¬§\Ã5Îº°§Dô…ž[÷UŸ.u\Þ\\GR®§ò\"«\Ýe\\2ôw\ËUúb 4P\Ø\Þ\Ø<Ö´ž£	jP\ÌIZaž\ïl¼È™m`vi~_\ÛG\"G0w~8d…\Ä¥9\êB*²Ð«\Z3Vj\í*¶\Ê#<\á¼@\Ç,¥ÁµÁýY«>\ßwi\ÅbdpÁsü5¤\îe\Ïý*ÿ\0Z¬¸\Ö\Ãv»\æœ\Õ	’b¶%ˆR”‘Õ‡<ý¨\Éq’\ØsñÁ#µ¤Ç·¡µ¶RT­\ëQ\ë“^\ávh´¥AJíŠŠºù\n!2\ã©Ö¹§!Cò¯\ë²QW$¶RGñª\"Z™ ³a“Ž@%8¦ž-\éuj=9²d&\Ë\ì,iHø€ô\Å>ZXJ\ã!Ò²JsL”,l)¢\nœd)\'‘_Tn©Á•E\í–Q‘tÄ¸vn\ß&.c:\í\ÑSŠ\È\Ü0@\0\Õ/½\"\é-\"\ä¢\ÑH8R•»—€«÷ÉšwB\êm5Ù¤1oº\ÇviAey#\æz\Ölµº\Û\×X\îM-´\Þð^Nv3^+Q§öf”\É48\îl7\ÛÙ ¦DpªYðW©¥¢*^´¹.KÉ‹Ù ö\Ä óW¥+°Ú®·[“¶­9-‡c>\âyÁÉ¶Ñžµ÷X\Ü€‡´Å™\ä\ÉuIûBq\á\Ôü«‰g‚\èð²5;©î± %¦XŽ\â•È‘\n’p²<Ë† [K(eXqR—0µ Œj¯\×Ús\íÔ06s¥¼#u§5\ìb_yPn=£µjN\Üâ©¾“\Éú\ï\ìhb+€V5Ay\ÇY/\Í!K\Î\â{Ë™\ë\ë‘Erö+\\Eû>\Ø\Ä†3\rÊ¸4†Š·1\Ô\äŸ3ŒþtS”ÿ\0\Ç\á\Æ8+\ßi?f\\b\â±Ö¿\íq\íLZ„e²\ÚVã§>@’\éý5V\Íö¹5kq˜œV0gµ\Ë\é9ùU\ë\Çk\å\Î\Û\Ä\Z\æ˜iQ\ZYoq\ÎT3üWòµ¥Ý¸\éiËœw[ˆIo™¡\r2œT…grR\Ú\Ê\×U{kXš]m\Ûu~ŸqÒ€\î\Í\ÊmN¸\ä|j\'\Â]+©¸iÄ‹\\¾!\ÛYb:›z$w÷\ÛB\È\ä¢krJ„È‡o\ÔÎ´Š!³\ÑMƒTw´u­«\í—f›\rô ´\ÑB\Î<¹s¬\êõ>\ÍûPï²¥^Q#1\ÙR70\çhƒ\Ðù\Ò7\Ø)\Î:x\×%¥…²\ÔOy\×Ï–\Ò9RòC\È\äH\ÍzúlWÁKÉ‘4\ëx]\r.F\Ü7´­®•\á¹î´ \Ì\ÑË U)t)•s\ÂZ%¬ó>ucM.E¦ù\îð÷ò¨Ö©ˆ:\àV\Ö\É\ÉÇ…w<\Ú\Ë /\îœøW™‘&±\ÞYPØ¢‘ŸRò\ç²\È\Ç®\íWK›:\í¨6˜\ÅPJ˜O,˜þ4\Ç\íF#\Äá‹’d·‰n\Èm\ç¨I&¥ü4Š.·‹\Í\Å\Ç\ÃE¶>Dg#ø\Ô\ÛIr\ÇlµG\'BŽO‡…UjÁteò1«K+ZÐ”c\ß\"›dD\í_#hg\ÈS³L©3\ØÁ-—|º\ÒI\nKÎ˜\í\'o»¸¯\Å^”›\\Œ¦#\Þ	\Ë#\ÝG/Îž4\Êqª¬\èQ\ÈL\æó4‚4<…\ãò\égi\á¨\í½\Ü{\â{8Ï‚‚ªU¯’#7\ÃFÀ\Òñ™V¼‡a!1™@F&´$ CiJ\Ó\ÌµK\é\ë8‹\Å8žSq\Ú\ÕD\r\Ç\ëW“	\0\á@õ\ÅmU\Â2­\ìòöv…ºAþ4ø·”H•m `\ÓK\Í ¡\\\Ç\Ã\Ë\çJ’µ²Ò\â‚JA«\n\ÎòW‚\n‘Š\ãÚƒ\Ì#•}vR)R\Î\â>U\å¶ <¥\0tmj\Þ@\Å*R7˜\Í%\nA#ni^B’œf¸\Þ7‹\ïqŠ\ØÁq°‹uŠT\ÆR¿‡µQ	ýÖ¤¤\ÆLg\ãZ‚ \ÈqÂ§\ZY\ÜÚŽ3\à|Fµ¡gM\ëm?¯f¶¥Z\ÂWfºœrm—H\Ø\áù+¯–jQq‰h¶¸fLŸq22!%\Å\0\ÉWó¨Yœ¦E,\r7Db•8–)/%*Œ…e…\ç©\0ôüª/¬mño*…¦®\äª4\Ö\Þa·T2²œ§?#Ò¦iõ\Í\ä\Ëw´Df†\ÈÍ¸}ðŸÄ¯SM÷\è-ÈŒ\ÒÒ‘–\ÜÜ•x\çh|G‘\ì®8©Ÿ›j]øª7+cŠƒ-³\Ë#¢¾J\Å>YÞ¸<©(yIlº\á\ÈO‡.•¿­\Í)«X\Õ0–…y\rÃ»¤†œ>Y\é>U5„\ÑL\éA°k\Ú\âé‚š_”8\ÒH’@yM\ÛovJ‰ò\Ò#s\ëÖ™­	J\Ùkh\ÈÎž\ÞRZŽJ¹)…\ÖEfš|\çµ5–\ãs\á\ÂeY\ß9S˜m\\º¡9\Æ}+!]®w‹þ¢‹boN\Åe\àžì¤¶>kUo^&\Ç7~jXl(\"KU)…gšT\Ø\Ýý+Ye5o´½ª)U\Ú{d%Î»\áÎ¼×ª\×ý\Å$‡ô¸\Æ\Ú7|²0t^ŒŠVò\Ò;\ÌÍ½	<÷Mw^.¶u\Î\á}v%\Ú3kqHpe/dmWJøA¨\Ørd½=-°µMB”\ä‚1¸þÔU7\Ý-x²_Q½\è±¸«?}>b¼õš³\Â5+­J9E/†ºþd{SðmI—\n\è´6‡™PV	%C¨Î¤°x_w\Ð_Ó–wn`—¹\Ä/vÄ­[y§>¡=‘¡\ÙlšvûjºH\îa†“•@À@ð\çÖ¾+G~\Ô\×´®(R\æ\Ù\Ý)@Q8lNß¦*\\\Úù§M\\«o\Ê67°\Ò\ä/\Ù\Ò\Êe6u7²JA\Î1p\0Ï (®\ÞÄ®4\ç³õ©L’SûN\î9ù‹„€ˆ4V…kKôf\É5&™ö›•\Øq$\'#½“ÿ\0¹uNO¸}›#w5Hhþ\ê°ý®¯³8²\ËB\Ýq’e0¼ÇŠ§Sþ#£]>UQY©õ\åò\Ýk´i[«QÚ˜‡\åH‘²\Ú“Ÿˆ×¡\ÓA:¢bßŸuÿ\0&“\Õ\ÜV‘`²NÒ–\ëwyž\ë\r¶\Ñü%i4Í¬¡\Ç\â\'\ì¶\r\\™0nL\ËF]@\nu­Ÿx|\êœ\âZ°ñ²nœ‹l¸^®k‡\æ Û™.¸¥$cº|\ê}¥§kÎžj\é­4¬­9>K\ÊSv\é•¡p’O™¬\Úý6¹\Ü\Û|\äÕ–©Âµô9\Ú\Õdµ\Çn$<\ám´¶§\Þ\Æå„ŽY¥\"\å\í<ž\\±Ÿ\nBmˆt“!\ä¤X˜JŠš*F<A\Ål\Å\Î„%-²\ìtvSK;”B||«š\ØZ@qrJld.1-¸{F•\É@žuô¿p¶}¬Uvñ\Õð¥sÒ¯‹iN\ÎO\Ó!8RNA¤\âµ{\ÊÁ9Â½¢ze		RW\è9W\ÐA\ÊIòª¤ü—Ác²+ÁV\Ä;ûrI\írq\Ü¸*ÀþUö±;y\Ð÷üh\å\×aNK„ž¡´\ãøu©öŠ¨\×{ÂœRÛ®c¡\çNW‹$k„+®¹#t[‚”«À¥Cýj«–\îŽ\Å\â\\ŸœR?µ%:Ê’<\çMñ›?´+\èh`ÕŸ\Ä\Þ]4sò;H«q\Ûr\ÊTBy;üdt#Ò«™±»\ÃLHˆ\é\Ù\Õ`r\ÏÎ“|v7ž…¶RýÅ’9•`¸¯qŸ[:šB6”\Üµz{Ù®z}n›E¤\à¶U\î\çÒ»K›\Û.”m\"BIÇ™<ªU5¸Œû75¹\Îñ¯mdw¸ˆP9ñ\0\n·š.\ãi<\ÏZ 4\Í\ï}\ÛJ´\éRJJIO\ÆÚ‡‡\È\Õ\æ\Ã\Ó\Ñ\ÈAt\àøò5³S\ÌL»3žG\rŠ>\ê¼yS½ˆ©;yŒƒL\Ëzsœ“‚z•/¥6\Æ.e§z\æy«8\ÍX\Èp;¾\Û‘)Hõ\åH\ÛCd`\âºwI…\nHN1\åIõ+\í$`˜\èAÀ¯jq”Ž•Ýµ\Ì`øSk„$vIq\ÂH\æq]Q©¤–\å:\Ù\ç\\gò[mKiqe²‡™tam¸œ¥CÈ\ZicM\é\Û{\ÂD$FI@\Èù\n^ó‚Ž%¤Ÿ%\'\Ãl¤¨F\á®d\îñOaJI\0ƒü\é$\Õ\rÜ§\áN\áJZ\Û\ê-8\ÖÕ¤ò>u\Æ\â\Ø0¤¡\Ôshõ\ÅFGRä®£5òÄ¸w(\è‘\nX[o%c!@ôüü#\Ò\é¹\èw³]L›•#\ë“i+q„ÿ\0ä¼ž¼¼+š[\Æ;m!¢‚Õ…r9©­´-´¡-¤‚¡\Ï)oû`qþ#Ž˜•\ZdFÜ‰¹h9%{HŸJW9\×&º[h}›|³\ë^˜J\Úh2\ÙHqIÁ9\Åu\Î#a•Km+õ=M^¹ŠB\Ý27­Äˆú\êÅº#²\î76û„v›N\å\áÚµ|‚I5œxŸÁ‰1\íMF\á\äi·%\Û\Û\rÜ\Û\ïcñ~Uª\Í\Ñ\Ûtˆ®6€²úV…cÐŽu\æe\Ü[YS\Ð\Ù	p\Çhñ>t½\Ú¨‹\Ë.®Ý¦2\á~—¶\Ù«½\î\äÛ\çkL`$ø‚:‚<ªO\ÄIkŽ’¹-¹-4û1”Z;¹ŸJnö‹\áþ´c‰*»iJ6\Ë\ÌDJ)mA/ô_ôª\Òv\â\Z,s{Õ¹÷~\È\ç\í7|…x\rn‘S¨i\ÈÖ§R”6\à¸8Kª4ö—\â•\Õ÷Iý\Î†\Ü9¾ö|‰†´eŸXpútWõù\×u!?Q\ÈõÀ¬7r\ÓZ™v+r$Û¤)\Ö\ã¶{0	!X\åOü1\Ó|F·\ë\Û$«„	-\ÃKùw<ÀI\ØX¢ö¦]¶øg\êO±\Ú\ß-ˆK(h…\ÌmGL÷×¹þ}:)\'±;3˜\àµ»’Tý­yV\×a¸\È(ÿ\0\ÚSEjU\Ìð/?É¸¯:K\Z¹ø\Ì#wh\Ãd€€I\ë\ãùTr<)³Y\ì\å\ÈD6ÕŒ€BT!M>Ò·.#[8ˆ\ÛzkO\Þ%\Û$@o/Û ºò\Ã\åK%$\0\0I\ç\çUÑ®*\é\Ë[—Kn¾N¹\É!”(\ÇuòŒŽj(H8¦·)±F”“3g\Úò‰\é¶\r®dk=,Ë²\Ò[\\…\0¬§ðg\Ã¦Ë¨µ>°bF \ÔR•!N\È(c\Ý\ÂP$,\ÔF\Ö\Ó\ì7/M]\Ä\Å!*w0ø_»\çV¥¯O\Ý\íV˜½\åö-\0¡\Ø+\âñð«*\Øå¹³²\Ê\\\rjl/;\Ôó4\ÆS\à\êyú\ÓÜ6\ì§;E\Ø\æ‡?ZXÊ¸/H\Ï\Ê-ó>]‚¿Òœ\Ý\å¬¿Œ¶AÜ¤õ\ëšá–›I@t)\'¨§g4…\ÝyH·\Îü\â¹þ•\Çû•{-[eœ½Áý*.P]2J-²/9•\"y\Z†\ßõRì‰™:L\Þ\ï\Z>¥Ÿy\0‰$Š²\åi=E%]\Ü\Ø\î \Ý\Ñ\Ì}qY\âF\â÷8¥g°\Ýxc©\ì\ÚZ\Ûu2rE¦B[\Z9S…8\'Fik&›\ÂcX\\¢\æ³0`%‡w8\ÒT¢¡\×#?ÖŸžq%•…¡¼„\ä+9¥\Ë\Ó×žZÍŠzA\'oûªúxxP½/}-cö\Ã)\è;ªùÿ\0\n±\Ê8\ì£\rË¢¨´¾œ¿°\á¥\ÉXN		ðòªKUû0B»Kr\ë¢n\ÔÓ€¡p\ÞÊµ¾?	­&\æž\Ô(II\Ó7eøBtÿ\0ø×„h\ÝN\è.*\Ít\r««f2Á#\éTI\Â\\d¹nG\ç´Ðš›@\\\Ôõ\Ò6ô4HK\ì\r\È\Îq‚GJn»=t(—(«\Ù!%(}•rÁ>\"¿Eõ\Õ}°I°IÑ“\ÖÜ€J¿\Ü\×\Ôú\â©\×ý’®°\Ú]Ñ“nPVT?É¸g\Ë\êŒZy,S\Ê\å|%¿u¡¢³\r\Ô1w²(**Ê¹\äuB½\rh5©¼Am\Ù\Ì*´$&C.a~$yŠÌ£\Ù\ïü*¾\'Qp\ÏJ^®V\å\è/q\â\0\ÛÎ­‹&²\×\"¡Wnq,\ä$\Ø\æmÏ¡\ìñŠr­D‘k\êr\éž\ÐB’	?Æmóodý\äÿ\0*­ô\Ó|O¼\É\ï38yu¶F’™0\Þ\'Ì§nEN\àBÕ‘Ð°»\r\Ã\âø79ÿ\0\noúŠñØ£ªkÀôJKjÉ¦§ *º˜Zµ`”\Ú\'«Ãº,JnUŸYû\"xO—t_O¥ü”Ü¾…©)Jržf½!þeµ¤ô>¼G´\ê@œ.\Ëpò«Ò¸\Ümz½W\É5\Ä}\æ\ÌEäŸ¥\ì>\Ð{r}!Z”Ä¬üù\×P\ÈBÀü…7%­bµ\í!uÇšb8¥,M«P<\ÇN\Ý|scúW\Ð~Q\'T…[0J?:G%|”\Ú\0©\'‘4®u‡T4¼&Ást‡dG>x™\ZgRº¢\ëšr\é¸$õ†\àþ”¼®Y\ì±Vû\"0-\Ê ]R‰\ÜGAR;mºs<\Ðò\ÎFSœR›~˜\Ô\ÉÁ^œº$Ÿ8n\éOQ´ö¡N3ežŸœeÿ\0¥Nƒ|´v[±\Â8E³5þ$•­\å+©\'µ6\ØM#\'=w#&–\"\Õzi;M–zˆÿ\0\å—þ•\Õ\ÛÂ¹.\Ë<ùuÿ\0¥Z¬­q•þJf\ÞHæ¢„…@2\"¥-¿%H9ÀÇˆ5Ôº\×O\è\Û\"õ>«¾\ÃjÜ€’®\ÍÐµ«>	H\ëV¼û\r\Õè’›ý5{\ã:ž\î¾d \àt\ë_•S8\í.BÄ¾qC}\å\Õ!+°NRvöŠ\Ç.Ï¦1UÛ«1n/’Êªs—\É\ZŠü`¶jiq/\ì\Çx[\Øh¢\Þ\Îý¥Áø\Ô?¥Ftö«\ÕÚ±‘&\×h\Z\ÔGi!\ÞJ\Å0¹Áž7\ÌÒ­3\'„šÔ½{P\Ñ\Óò÷\íÇ€\ì\ê]¢¸SÅˆšR=±\ÎkV^C¤­/X¥#‘>¨þ5óoV…³nÕ–\Û5`—\Ù	\Õ\n[—;kjm<\ÛKe@CKSr½5±øw\Æ\Ûu$ö}¦ioû6\âƒ\ÍJSœ9\ÕM¸ˆirå‚™&ð»‹\Î\ÛÁ7\ÕÝ ?\nl\Òr-•\ç”5M®ø/M#ôg\ØñÇž\à=•\Ù2{wU\"a[›v\î=\å\Ï\n+—±šû`ö|\Óö\ÝIj›nž‡f©\ÈóS/ N”\îBÀ# ‚2:h¯s¥MQ.ð¿øTû.ò”ž©ò¯›øGÒŠ*ó±„}(Ø\Â>”Q@\Ä~ô£b?úQE\0øGÒˆü#\éE\0lG\áJ6#ð¥P±„}(Ø\Â>”Q@\Ä~ô£b?úQE\0øGÒˆü#\éE\0lG\áJ6#ð¥P±„}(Ø\Â>”Q@\Ä~ô£b?úQE\0øGÒˆü#\éE\0lG\áJ6#ð¥P±„}(Ø\Â>”Q@\Ä~ô£b?úQE\0øGÒˆü#\éE\0lG\áJ6#ð¥P±„}(Ø\Â>”Q@\Ä~ô£b?úQE\0}\0@QEÿ\Ù');
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
