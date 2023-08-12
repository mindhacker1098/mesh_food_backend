CREATE DATABASE Foodiee;

USE Foodiee;

GRANT ALL PRIVILEGES ON Foodiee.* To 'root'@'localhost' IDENTIFIED BY '8521695758';

CREATE TABLE users(
                      user_id INT NOT NULL AUTO_INCREMENT,
                      UNIQUEID VARCHAR(50) NOT NULL,
                      email VARCHAR(250) NOT NULL UNIQUE ,
                      password VARCHAR(250) NOT NULL,
                      created_at timestamp,
                      updated_at timestamp,
                      primary key(user_id)
);