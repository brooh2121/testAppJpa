create table if not exists book (
book_id serial,
book_name varchar (500)
);

create table book_price (
price_id serial,
book_price double precision,
price_date timestamp default current_timestamp,
book_id bigint
);

create sequence if not exists book_id_seq start 1;

create sequence if not exists price_id_seq start 1;

insert into book values(nextval('book_id_seq'),'Рассказ о пухлом');
insert into book_price values(nextval('price_id_seq'),1000,date_trunc('week', current_timestamp),1);
insert into book_price values(nextval('price_id_seq'),1000,date_trunc('day', current_timestamp),1);
