--liquibase formatted sql

--changeset dev:create-table
CREATE TABLE Pets(
                     Id int primary key,
                     Name varchar(40),
                     Code bigint,
                     Type varchar(40),
                     FurColor varchar(40)
);

--changeset dev:insert-pets-01
INSERT INTO Pets VALUES(1, 'Mustikas', 202211151535, 'Cat', 'Black');
INSERT INTO Pets VALUES(2, 'Roy', 202211151536, 'Dog', 'Brown');
INSERT INTO Pets VALUES(3, 'Charles', 202211151536, 'Horse', 'White');