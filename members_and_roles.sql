USE `jupiter_company`;

DROP TABLE IF EXISTS `roles`;
DROP TABLE IF EXISTS `members`;

--
-- Table structure for table `members`
--

CREATE TABLE `members` (
  `user_id` varchar(50) NOT NULL,
  `pw` char(68) NOT NULL,
  `active` tinyint NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Inserting data for table `members`
--
-- NOTE: The passwords are encrypted using BCrypt
--
-- A generation tool is avail at: https://www.luv2code.com/generate-bcrypt-password
--
-- Default passwords here are: test123
--

INSERT INTO `members`
VALUES
('steve','{bcrypt}$2a$10$M8S.Fsi4PJ8KPiQiuS6T7.PUJwiu.BYcqsjeIig6e7OkwvVkVxGTG',1),
('emily','{bcrypt}$2a$10$M8S.Fsi4PJ8KPiQiuS6T7.PUJwiu.BYcqsjeIig6e7OkwvVkVxGTG',1),
('megan','{bcrypt}$2a$10$M8S.Fsi4PJ8KPiQiuS6T7.PUJwiu.BYcqsjeIig6e7OkwvVkVxGTG',1);


--
-- Table structure for table `authorities`
--

CREATE TABLE `roles` (
  `user_id` varchar(50) NOT NULL,
  `role` varchar(50) NOT NULL,
  UNIQUE KEY `authorities5_idx_1` (`user_id`,`role`),
  CONSTRAINT `authorities5_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `members` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Inserting data for table `roles`
--

INSERT INTO `roles`
VALUES
('steve','ROLE_EMPLOYEE'),
('emily','ROLE_EMPLOYEE'),
('emily','ROLE_MANAGER'),
('megan','ROLE_EMPLOYEE'),
('megan','ROLE_MANAGER'),
('megan','ROLE_ADMIN');
