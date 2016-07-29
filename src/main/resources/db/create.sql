DROP TABLE IF EXISTS t_user;
CREATE TABLE t_user (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(50)  NOT NULL COMMENT '名字',
  phone varchar(50)  NOT NULL COMMENT '电话',
  company varchar(50)  NOT NULL COMMENT '公司',
  address varchar(50)  NOT NULL COMMENT '地址',
  create_date datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (id)
)  ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';
INSERT INTO t_user VALUES ('1', '张三','13500000001', 'ibm', '武汉天地', '2016-05-18 11:09:05');
INSERT INTO t_user VALUES ('2', '张三','13500000002', 'ibm', '武汉天地', '2016-05-18 11:09:05');
INSERT INTO t_user VALUES ('3', '张三','13500000003', 'ibm', '武汉天地', '2016-05-18 11:09:05');
INSERT INTO t_user VALUES ('4', '张三','13500000004', 'ibm', '武汉天地', '2016-05-18 11:09:05');
INSERT INTO t_user VALUES ('5', '张三','13500000005', 'ibm', '武汉天地', '2016-05-18 11:09:05');
INSERT INTO t_user VALUES ('6', '张三','13500000006', 'ibm', '武汉天地', '2016-05-18 11:09:05');
INSERT INTO t_user VALUES ('7', '张三','13500000007', 'ibm', '武汉天地', '2016-05-18 11:09:05');
INSERT INTO t_user VALUES ('8', '张三','13500000008', 'ibm', '武汉天地', '2016-05-18 11:09:05');
INSERT INTO t_user VALUES ('9', '张三','13500000009', 'ibm', '武汉天地', '2016-05-18 11:09:05');
INSERT INTO t_user VALUES ('10', '张三','13500000010', 'ibm', '武汉天地', '2016-05-18 11:09:05');
INSERT INTO t_user VALUES ('11', '张三','13500000011', 'ibm', '武汉天地', '2016-05-18 11:09:05');
INSERT INTO t_user VALUES ('12', '张三','13500000012', 'ibm', '武汉天地', '2016-05-18 11:09:05');
INSERT INTO t_user VALUES ('13', '张三','13500000013', 'ibm', '武汉天地', '2016-05-18 11:09:05');
