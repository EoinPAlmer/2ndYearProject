# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

Create Table catagory(
    id          int not null,
    name        varchar2(255),
    constraint pkcatagory primary key (id)
);
create sequence catagory_seq;

Create Table product(
    prod_ID         int not null,
    prod_name       varchar(255),
    brand           varchar(255),
    size            int,
    price           float,
    stock           int,
    cata_Id         int,
    constriant pk_product Primary Key (prod_id)
);
Create sequence product_seq;

Create Table User(
    email       varchar2(255),
    name        varchar(255),
    role        varchar2(255),
    PASSWORD    varchar(255),
    constraint pk_user primary key (email)
);

Create Table cart(
    cart_ID         int,
    cart_price      float,
    cart_qty        int,
    prod_ID         int,
    constraint pk_cart primary key(cart_ID),
    Foreign Key(prod_ID) references Product(prod_ID)
);
Create sequence cart_seq;

# --- !Downs

alter table product drop constraint if exists fk_product_category_id;
drop index if exists ix_product_category_id;

drop table if exists category;
drop sequence if exists category_seq;

drop table if exists product;
drop sequence if exists product_seq;

drop table if exists User;

drop table if exists cart;
drop sequence if exists cart_seq;
