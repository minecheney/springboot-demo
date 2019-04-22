CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `userName` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `status` varchar(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

INSERT INTO "user" VALUES ('2', 'test','', '7a38c13ec5e9310aed731de58bbc4214', '广州', '0');
INSERT INTO "user" VALUES ('1', 'admin','', '42ee25d1e43e9f57119a00d0a39e5250', '吉安', '1');