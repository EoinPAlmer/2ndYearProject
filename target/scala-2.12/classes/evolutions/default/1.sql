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
    prod_ID         bigint auto_increment not null,
    prod_name       varchar(255),
    brand           varchar(255),
    size            int,
    price           float,
    stock           int,
    cata_Id         int,
    Primary Key (prod_ID)
);
Create sequence product_seq;

create table user (
  type                          varchar(31) not null,
  email                         varchar(255) not null,
  name                          varchar(255),
  password                      varchar(255),
  role                          varchar(255),
  street1                       varchar(255),
  street2                       varchar(255),
  town                          varchar(255),
  post_code                     varchar(255),
  credit_card                   varchar(255),
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

create table basket(
id      bigint auto_increment not null,
customer_email  varchar(255),
unique(customer_email),
primary key(id)
);

create table category_product(
cate_id bigint not null,
prod_ID bigint not null,
primary key(cate_id, prod_ID)
);

create table order_prod(
    id bigint auto_increment not null,
    order_id bigint,
    basket_id bigint,
    prod_ID bigint,
    quantity int not null,
    price double not null,
    primary key (id)
);
create table shop_order(
    id      bigint auto_increment not null,
    order_date     timestamp,
    customer_email  varchar(255),
    primary key(id)
);


# --- !Downs


alter table basket add constraint fk_basket_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;

alter table category_product add constraint fk_category_product_category foreign key (cate_id) references category (id) on delete restrict on update restrict;
create index ix_category_product_category on category_product (cate_id);

alter table category_product add constraint fk_category_product_product foreign key (prod_ID) references product (prod_ID) on delete restrict on update restrict;
create index ix_category_product_product on category_product (prod_ID);

alter table order_prod add constraint fk_order_prod_order_id foreign key (order_id) references shop_order (id) on delete restrict on update restrict;
create index ix_order_prod_order_id on order_prod (order_id);

alter table order_prod add constraint fk_order_prod_basket_id foreign key (basket_id) references basket (id) on delete restrict on update restrict;
create index ix_order_prod_basket_id on order_prod (basket_id);

alter table order_prod add constraint fk_order_prod_prod_ID foreign key (prod_ID) references product (prod_ID) on delete restrict on update restrict;
create index ix_order_prod_prod_ID on order_prod (prod_ID);

alter table shop_order add constraint fk_shop_order_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;
create index ix_shop_order_customer_email on shop_order (customer_email);


# --- !Downs

alter table basket drop constraint if exists fk_basket_customer_email;

alter table category_product drop constraint if exists fk_category_product_category;
drop index if exists ix_category_product_category;

alter table category_product drop constraint if exists fk_category_product_product;
drop index if exists ix_category_product_product;

alter table order_product drop constraint if exists fk_order_product_order_id;
drop index if exists ix_order_product_order_id;

alter table order_product drop constraint if exists fk_order_product_basket_id;
drop index if exists ix_order_product_basket_id;

alter table order_product drop constraint if exists fk_order_product_product_id;
drop index if exists ix_order_product_product_id;

alter table shop_order drop constraint if exists fk_shop_order_customer_email;
drop index if exists ix_shop_order_customer_email;

drop table if exists basket;

drop table if exists category;

drop table if exists category_product;

drop table if exists product;

drop table if exists order_product;

drop table if exists shop_order;

drop table if exists user;