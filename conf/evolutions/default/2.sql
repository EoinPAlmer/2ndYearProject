# --- Sample dataset

# --- !Ups

insert into category(id,name) values(1,'Adidas');
insert into category(id,name) values(2,'Nike');
insert into category(id,name) values(3,'Balenciaga');
insert into catagory(id,name) values(4, 'Yeezy');

insert into product (prod_ID,prod_name,brand,size,stock,cata_Id,price) values(1, 'Yeezy boost 350 Turtle Dove', 'Yeezy', 10, 700, 14, 4);
insert into product (prod_ID,prod_name,brand,size,stock,cata_Id,price) values(2, 'Yeezy boost 750 black', 'Yeezy', 8, 850, 10, 4);
insert into product (prod_ID,prod_name,brand,size,stock,cata_Id,price) values(3, 'BAPE NMD Green Camo', 'Adidas', 9, 600, 10, 1);
insert into product (prod_ID,prod_name,brand,size,stock,cata_Id,price) values(4, 'BAPE NMD MasterMind', 'Adidas', 8, 650, 7, 1);
insert into product (prod_ID,prod_name,brand,size,stock,cata_Id,price) values(5, 'Nike React', 'Nike', 9,100, 11, 2);
insert into product (prod_ID,prod_name,brand,size,stock,cata_Id,price) values(6, 'Nike Air Jordan', 'Nike', 9, 620, 10, 2);
insert into product (prod_ID,prod_name,brand,size,stock,cata_Id,price) values(7, 'Baleniaga Platform crocs', 'Balenciaga', 9, 800, 10, 3);
insert into product (prod_ID,prod_name,brand,size,stock,cata_Id,price) values(8, 'Balenciaga Thriple S', 'Balenciaga', 9, 600, 10, 3);

insert into user (type,email,role,name,password) values ('m','finn@sneakersan.com','Manager','FinnHarvey','password');
insert into user (type,email,role,name,password) values ('m','eoin@sneakersan.com','Manager','EoinPalmer','password');
insert into user (type,email,role,name,password) values ('m','paul@sneakersan.com','Manager','PaulRoche','password');
insert into user (type,email,role,name,password) values ('c','customer@sneakersan.com','customer','customer','password');