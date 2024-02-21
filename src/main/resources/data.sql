-- items
insert into items (id, item_name) values (NEXTVAL('items_seq'), 'Item 1');
insert into items (id, item_name) values (NEXTVAL('items_seq'), 'Item 2');

-- books
insert into books (id, item_name, author, isbn) values (NEXTVAL('items_seq'), 'Book 1', 'Author 1', 'ISBN-123456789');
insert into books (id, item_name, author, isbn) values (NEXTVAL('items_seq'), 'Book 2', 'Author 2', 'ISBN-987654321');

-- movies
insert into movies (id, item_name, director, duration) values (NEXTVAL('items_seq'), 'Movie 1', 'Director 1', 120);
insert into movies (id, item_name, director, duration) values (NEXTVAL('items_seq'), 'Movie 2', 'Director 2', 150);




