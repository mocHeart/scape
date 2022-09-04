-- 创建数据库
CREATE DATABASE `scape` CHARACTER SET utf8 COLLATE utf8_general_ci

-- 创建用户表
CREATE TABLE `user` (
`id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
`name` varchar(64) DEFAULT NULL COMMENT '姓名',
`nick_name` varchar(64) DEFAULT NULL COMMENT '昵称',
`age` int(5) DEFAULT NULL COMMENT '年龄',
`email` varchar(64) DEFAULT NULL COMMENT '邮箱',
`profile` varchar(255) DEFAULT NULL COMMENT '个人简介',
`avatar` varchar(255) DEFAULT NULL COMMENT '头像地址',
`password` varchar(64) DEFAULT NULL COMMENT '密码',
`is_online` tinyint(4) DEFAULT '0' COMMENT '是否在线',
`created_time` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`last_login_time` datetime DEFAULT NULL COMMENT '上次登录时间',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 示例数据
INSERT INTO `user` (`id`, `name`, `nick_name`, `age`, `email`, `profile`, `avatar`, `password`, `created_time`, `last_login_time`) VALUES ('1', 'system', 'system', '20', 'einstein@163.com', '犹太人，是20世纪著名的理论物理学家、思想家及哲学家，也是相对论的创立者，是现代物理学及二十世纪最重要的科学家之一', 'https://ts1.cn.mm.bing.net/th/id/R-C.6b19a4f9b52a782d42c7ed25737f77ed?rik=x2eLhdR%2bcKvKSA&riu=http%3a%2f%2fwww.5156edu.com%2feditor%2fTemp%2f20080609074354a631.jpg&ehk=OvzElHelSjFi1QBkrFtcL2IMo2050zxST%2bxek3%2fYC7M%3d&risl=&pid=ImgRaw&r=0', '123', '2022-07-19 23:51:47', '2022-07-19 23:51:49');
