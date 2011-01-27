/*
MySQL Data Transfer
Source Host: localhost
Source Database: demo
Target Host: localhost
Target Database: demo
Date: 2011-1-13 17:35:07
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for fawen
-- ----------------------------
CREATE TABLE `fawen` (
  `id` int(11) NOT NULL auto_increment,
  `wenhao` varchar(20) collate utf8_unicode_ci default NULL,
  `title` varchar(40) collate utf8_unicode_ci default NULL,
  `content` varchar(200) collate utf8_unicode_ci default NULL,
  `fawenTime` datetime default NULL,
  `groupId` varchar(2) collate utf8_unicode_ci default NULL,
  `state` varchar(2) collate utf8_unicode_ci default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `fawen` VALUES ('1', '京发改001', '发文标题', '发文内容', '2010-12-31 00:00:00', '01', '01');
