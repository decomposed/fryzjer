-- Wyczyszczenie bazy
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS customers;

-- Tabela z użytkownikami
CREATE TABLE `users` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `login` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_ow0gan20590jrb00upg3va2fn` (`login`)
);

  CREATE TABLE `customers` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `first_name` varchar(255) DEFAULT NULL,
    `last_name` varchar(255) DEFAULT NULL,
    `telephone_number` varchar(255) DEFAULT NULL,
    `visit_date` date DEFAULT NULL,
    `visit_time` time DEFAULT NULL,
    `assigned_hairdresser` varchar(255) DEFAULT NULL,
    `additional_info` varchar(500) DEFAULT NULL,
    `comments` varchar(500) DEFAULT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `UK_ow0gan20590jrb00upg3va2fn` (`telephone_number`)
    );