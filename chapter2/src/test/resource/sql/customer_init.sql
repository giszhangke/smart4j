TRUNCATE customer;
insert into demon_test.customer (select * from test.customer);