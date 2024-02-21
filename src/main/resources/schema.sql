create table books (
  id bigint not null,
  item_name varchar(255),
  author varchar(255),
  isbn varchar(255), primary key (id)
);

create table items (
  id bigint not null,
  item_name varchar(255),
  primary key (id)
);

create table movies (
  id bigint not null,
  item_name varchar(255),
  director varchar(255),
  duration integer not null,
  primary key (id)
);

create sequence items_seq start with 1 increment by 1