--liquibase formatted sql

--changeset dev:create-table
CREATE TABLE Pets(
                     id int primary key,
                     name varchar(40),
                     code bigint,
                     type varchar(40),
                     color varchar(40)
);

--changeset dev:insert-pets-01
INSERT INTO Pets VALUES(1, 'Mustikas', 202211151535, 'Cat', 'Black');
INSERT INTO Pets VALUES(2, 'Roy', 202211151536, 'Dog', 'Brown');
INSERT INTO Pets VALUES(3, 'Charles', 202211151536, 'Horse', 'White');