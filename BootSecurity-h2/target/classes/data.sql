insert into users (username, password, enable) values
('alice', 'password123', true),
('bob', 'password456', true);


insert into authorities (username, authority) values
('alice', 'ROLE_ADMIN'),
('bob', 'ROLE_USER');
