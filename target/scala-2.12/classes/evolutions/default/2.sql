# --- Sample dataset

# --- !Ups

insert into category(id,name) values(1,'Adidas');
insert into category(id,name) values(2,'Nike');
insert into category(id,name) values(3,'Balenciaga');
insert into category(id,name) values(4, 'Yeezy');

insert into Product_on_sale (id,name,brand,size,price,stock) values(1, 'Yeezy boost 350 Turtle Dove', 'Yeezy', 10, 700, 14);
insert into Product_on_sale (id,name,brand,size,price,stock) values(2, 'Yeezy boost 750 black', 'Yeezy', 8, 850, 10);
insert into Product_on_sale (id,name,brand,size,price,stock) values(3, 'BAPE NMD Green Camo', 'Adidas', 9, 600, 10);
insert into Product_on_sale (id,name,brand,size,price,stock) values(4, 'BAPE NMD MasterMind', 'Adidas', 8, 650, 7);
insert into Product_on_sale(id,name,brand,size,price,stock) values(5, 'Nike React', 'Nike', 9,100, 11);
insert into Product_on_sale (id,name,brand,size,price,stock) values(6, 'Nike Air Jordan', 'Nike', 9, 620, 10);
insert into Product_on_sale (id,name,brand,size,price,stock) values(7, 'Baleniaga Platform crocs', 'Balenciaga', 9, 800, 10);
insert into Product_on_sale (id,name,brand,size,price,stock) values(8, 'Balenciaga Thriple S', 'Balenciaga', 9, 600, 10);

insert into user (type,email,role,name,password) values ('m','finn@sneakersan.com','Admin','FinnHarvey','password');
insert into user (type,email,role,name,password) values ('m','eoin@sneakersan.com','Admin','EoinPalmer','password');
insert into user (type,email,role,name,password) values ('m','paul@sneakersan.com','Admin','PaulRoche','password');
insert into user (type,email,role,name,password) values ('c','customer@sneakersan.com','customer','customer','password');