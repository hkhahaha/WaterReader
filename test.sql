/*
Navicat MySQL Data Transfer

Source Server         : 1
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2019-03-05 15:27:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_admin
-- ----------------------------
DROP TABLE IF EXISTS `tb_admin`;
CREATE TABLE `tb_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_admin
-- ----------------------------
INSERT INTO `tb_admin` VALUES ('1', 'admin', 'bcdefg');
INSERT INTO `tb_admin` VALUES ('2', '123', '123');
INSERT INTO `tb_admin` VALUES ('3', '123', 'bcd');

-- ----------------------------
-- Table structure for tb_room
-- ----------------------------
DROP TABLE IF EXISTS `tb_room`;
CREATE TABLE `tb_room` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `room` varchar(255) DEFAULT NULL COMMENT '学生的宿舍编号',
  `address` varchar(255) DEFAULT NULL COMMENT '学生的具体宿舍',
  PRIMARY KEY (`id`),
  KEY `room` (`room`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_room
-- ----------------------------
INSERT INTO `tb_room` VALUES ('1', 'R140', '红棉楼R140');
INSERT INTO `tb_room` VALUES ('2', 'R141', '红棉楼R141');
INSERT INTO `tb_room` VALUES ('3', 'R139', '红棉楼R139');
INSERT INTO `tb_room` VALUES ('5', 'test', 'testAA');
INSERT INTO `tb_room` VALUES ('7', '请输入宿舍号。。。。', '请输入宿舍位置。。。。');

-- ----------------------------
-- Table structure for tb_room_water
-- ----------------------------
DROP TABLE IF EXISTS `tb_room_water`;
CREATE TABLE `tb_room_water` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `room` int(11) DEFAULT NULL COMMENT 'Ñ§ÉúµÄËÞÉá±àºÅ',
  `water` varchar(255) DEFAULT NULL COMMENT 'Ë®Á¿ÐÅÏ¢',
  `date` date DEFAULT NULL COMMENT '³­±íÖÜÆÚ',
  PRIMARY KEY (`id`),
  KEY `FK_g7d9jc3lfvbcb1cuu2le3cmcf` (`room`),
  CONSTRAINT `FK_g7d9jc3lfvbcb1cuu2le3cmcf` FOREIGN KEY (`room`) REFERENCES `tb_room` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_room_water
-- ----------------------------
INSERT INTO `tb_room_water` VALUES ('1', '2', '20', '2019-02-14');
INSERT INTO `tb_room_water` VALUES ('2', '1', '2222', '2018-10-01');
INSERT INTO `tb_room_water` VALUES ('27', '3', '20222', '2019-01-31');
INSERT INTO `tb_room_water` VALUES ('28', '1', '1231231231', '2019-01-31');
INSERT INTO `tb_room_water` VALUES ('29', '5', '666666', '2019-02-28');
INSERT INTO `tb_room_water` VALUES ('30', '1', '66669999', '2019-01-31');
INSERT INTO `tb_room_water` VALUES ('31', '7', '请输入水量。。。。', null);
INSERT INTO `tb_room_water` VALUES ('32', '7', '请输入水量。。。。', '2018-10-01');

-- ----------------------------
-- Table structure for tb_st
-- ----------------------------
DROP TABLE IF EXISTS `tb_st`;
CREATE TABLE `tb_st` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '学生的姓名',
  `student_number` varchar(255) DEFAULT NULL COMMENT '学生的学号',
  `grade` varchar(32) DEFAULT NULL COMMENT '学生的年级',
  `part` varchar(32) DEFAULT NULL COMMENT '学生的系别',
  `room` int(11) DEFAULT NULL COMMENT 'Ñ§ÉúµÄËÞÉá±àºÅ',
  PRIMARY KEY (`id`),
  KEY `FK_8qmjknhudg5vb9miumqns1oom` (`room`),
  CONSTRAINT `FK_8qmjknhudg5vb9miumqns1oom` FOREIGN KEY (`room`) REFERENCES `tb_room` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_st
-- ----------------------------
INSERT INTO `tb_st` VALUES ('18', '123456', '123456', '123456', '123456', '2');
INSERT INTO `tb_st` VALUES ('19', '123456', '123456', '123456', '123456', '2');
INSERT INTO `tb_st` VALUES ('20', '请输入学生的姓名。。。。', '123456', '123456', '123456', '2');
INSERT INTO `tb_st` VALUES ('21', '请输入学生的姓名。。。。', '请输入学生的学号。。。。', '请输入学生的年级。。。。', '请输入学生的系别。。。。', '2');
INSERT INTO `tb_st` VALUES ('22', '姓名', '学号', '年级', '系别', '5');
INSERT INTO `tb_st` VALUES ('23', '请输入学生的姓名。。。。', '请输入学生的学号。。。。', '请输入学生的年级。。。。', '请输入学生的系别。。。。', '7');

-- ----------------------------
-- Table structure for tb_water_cycle
-- ----------------------------
DROP TABLE IF EXISTS `tb_water_cycle`;
CREATE TABLE `tb_water_cycle` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL COMMENT '抄表时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_water_cycle
-- ----------------------------
INSERT INTO `tb_water_cycle` VALUES ('1', '2019-02-00');
INSERT INTO `tb_water_cycle` VALUES ('2', '2019-03-00');
INSERT INTO `tb_water_cycle` VALUES ('3', '9102-10-10');

-- ----------------------------
-- Table structure for tb_water_person
-- ----------------------------
DROP TABLE IF EXISTS `tb_water_person`;
CREATE TABLE `tb_water_person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL COMMENT '抄表员的用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '抄表员的密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_water_person
-- ----------------------------
INSERT INTO `tb_water_person` VALUES ('6', 'water', 'bcd');
INSERT INTO `tb_water_person` VALUES ('7', '123123', 'bcd');
INSERT INTO `tb_water_person` VALUES ('8', 'hk', 'bcd');
INSERT INTO `tb_water_person` VALUES ('9', '456', 'efg');
INSERT INTO `tb_water_person` VALUES ('11', '123', 'bcd');
