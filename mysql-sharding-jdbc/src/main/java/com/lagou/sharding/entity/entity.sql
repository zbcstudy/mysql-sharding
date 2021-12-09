CREATE TABLE `order0` (
`id`  bigint(11) NOT NULL ,
`is_del`  tinyint(1) NULL ,
`company_id`  int(11) NULL ,
`position_id`  varchar(50) NULL ,
`user_id`  bigint(11) NULL ,
`publish_user_id`  bigint(11) NULL ,
`status`  tinyint(1) NULL ,
`created`  timestamp NULL ON UPDATE CURRENT_TIMESTAMP ,
`updated`  timestamp NULL ON UPDATE CURRENT_TIMESTAMP ,
PRIMARY KEY (`id`)
);

CREATE TABLE `order1` (
`id`  bigint(11) NOT NULL ,
`is_del`  tinyint(1) NULL ,
`company_id`  int(11) NULL ,
`position_id`  varchar(50) NULL ,
`user_id`  bigint(11) NULL ,
`publish_user_id`  bigint(11) NULL ,
`status`  tinyint(1) NULL ,
`created`  timestamp NULL ON UPDATE CURRENT_TIMESTAMP ,
`updated`  timestamp NULL ON UPDATE CURRENT_TIMESTAMP ,
PRIMARY KEY (`id`)
);

CREATE TABLE `t_crypt` (
`id`  bigint(11) NOT NULL ,
`name`  varchar(50) NULL ,
`pwd_plain`  varchar(50) NULL ,
`pwd_cipher` varchar (50) NULL,
PRIMARY KEY (`id`)
);