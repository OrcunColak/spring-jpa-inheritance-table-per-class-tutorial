CREATE TABLE items (
  id BIGINT NOT NULL,
  item_name VARCHAR(255),
  PRIMARY KEY (id)
);

CREATE TABLE books (
  id BIGINT NOT NULL,
  item_name VARCHAR(255),
  author VARCHAR(255),
  isbn VARCHAR(255),
  PRIMARY KEY (id)
);

CREATE TABLE movies (
  id BIGINT NOT NULL,
  item_name VARCHAR(255),
  director VARCHAR(255),
  duration INTEGER NOT NULL,
  PRIMARY KEY (id)
);

CREATE SEQUENCE items_seq START WITH 1 INCREMENT BY 1;