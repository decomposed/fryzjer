-- Wyczyszczenie bazy
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS users;

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

-- Tabela z petentami
CREATE TABLE `customers` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `telephone_number` varchar(255) DEFAULT NULL,

-- `login` varchar(255) NOT NULL,
-- `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_ow0gan20590jrb00upg3va2fn` (`telephone_number`)
);

