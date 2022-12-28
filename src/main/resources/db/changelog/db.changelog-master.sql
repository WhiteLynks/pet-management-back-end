--liquibase formatted sql

--changeset dev:create-table
CREATE TABLE pets(
                     id Long primary key auto_increment,
                     name varchar(255),
                     code bigint,
                     type varchar(40),
                     color varchar(40)
);

--changeset dev:insert-pets-01
INSERT INTO pets VALUES(111, 'Mustikas', 202211151535, 'Cat', 'Black');
INSERT INTO pets VALUES(112, 'Roy', 202211151536, 'Dog', 'Brown');
INSERT INTO pets VALUES(113, 'Charles', 202211151536, 'Horse', 'White');