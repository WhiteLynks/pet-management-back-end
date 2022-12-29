--liquibase formatted sql

--changeset dev:create-table
CREATE TABLE pets(
                     id Long primary key auto_increment,
                     name varchar(255),
                     code bigint,
                     type varchar(40),
                     color varchar(40)
);

CREATE TABLE types(
    id Long primary key auto_increment,
    type varchar(40)
);

CREATE TABLE colors(
                      id Long primary key auto_increment,
                      color varchar(40)
);

--changeset dev:insert-pets-and-values-01
INSERT INTO pets VALUES(111, 'Mustikas', 202211151535, 'Cat', 'Black');
INSERT INTO pets VALUES(112, 'Roy', 202211151536, 'Dog', 'Brown');
INSERT INTO pets VALUES(113, 'Charles', 202211151536, 'Horse', 'White');

INSERT INTO types VALUES(1, 'Cat');
INSERT INTO types VALUES(2, 'Dog');
INSERT INTO types VALUES(3, 'Horse');

INSERT INTO colors VALUES(1, 'Black');
INSERT INTO colors VALUES(2, 'Brown');
INSERT INTO colors VALUES(3, 'White');