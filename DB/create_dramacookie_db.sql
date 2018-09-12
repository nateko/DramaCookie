create database drama_cookie;
create user 'dramacookie'@'localhost' identified by 'admin'; 
grant all on drama_cookie.* to 'dramacookie'@'localhost'; 
SET GLOBAL time_zone = "Europe/Riga";
SET time_zone = "+03:00";
SET @@session.time_zone = "+03:00";

drop table if exists users;
CREATE TABLE Users (
id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
login VARCHAR(100) NOT NULL,
email VARCHAR(100) NOT NULL,
password CHAR(60) NOT NULL,
role VARCHAR(20) default 'GUEST',
status TINYINT(1) default 0,
ip_address VARCHAR(45),
creation_date TIMESTAMP,
last_change_date TIMESTAMP,
last_access_date TIMESTAMP
);

