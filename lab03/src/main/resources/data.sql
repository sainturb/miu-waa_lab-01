INSERT INTO category (id, name) VALUES (nextval('category_id_seq'), 'Mobile');
INSERT INTO category (id, name) VALUES (nextval('category_id_seq'), 'Tablet');
INSERT INTO category (id, name) VALUES (nextval('category_id_seq'), 'Laptop');
INSERT INTO product (id, name, price, rating, category_id) VALUES (nextval('product_id_seq'), 'iPhone 12 Pro', 999, 1, 1);
INSERT INTO product (id, name, price, rating, category_id) VALUES (nextval('product_id_seq'), 'iPad Air 4th Gen', 599, 2, 2);
INSERT INTO product (id, name, price, rating, category_id) VALUES (nextval('product_id_seq'), 'Macbook Pro 14" 2021', 2000, 3, 3);