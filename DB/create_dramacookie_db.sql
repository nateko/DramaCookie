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

drop table if exists profile;
create table profile (
id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
user_id int(6) UNSIGNED,
first_name VARCHAR(100) NOT NULL,
last_name VARCHAR(100) NOT NULL,
birth_date date,
about_me text,
gender varchar(6),
profile_picture text,
FOREIGN KEY (user_id)
        REFERENCES users(id)
        ON DELETE CASCADE
);

drop table if exists tags;
create table tags (
id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255) unicode,
counter int(6) unsigned
);