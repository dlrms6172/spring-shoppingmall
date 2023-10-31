-- shop.item definition

CREATE TABLE `item` (
  `item_id` bigint(20) NOT NULL,
  `item_detail` longtext NOT NULL,
  `item_nm` varchar(50) NOT NULL,
  `item_sell_status` varchar(255) DEFAULT NULL,
  `price` int(11) NOT NULL,
  `reg_time` datetime(6) DEFAULT NULL,
  `stock_number` int(11) NOT NULL,
  `update_time` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;