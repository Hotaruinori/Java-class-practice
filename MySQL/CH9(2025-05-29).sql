-- 索引

create table if not exists t1(
	id int,
    name varchar(20),
    primary key(id ,name)
);
desc t1;
create table if not exists t2(
	id int,
    name varchar(20) unique key,
    primary key(id)
);
desc t2;
create table if not exists t3(
	id int,
    name varchar(20) ,
    tel varchar(20) ,
    primary key(id),
    unique key (name, tel)
);
desc t3;
-- 創建表格後建立索引 alter table 方式
create table if not exists t4(
	id int,
    name varchar(20) ,
    tel varchar(20) ,
    address varchar(20) ,
    primary key(id),
    unique key (name, tel),
    index (address)
);
Alter table t4 add index(address);
Alter table t4 add index(address, tel, name);
desc t4;
select * from information_schema.tables where table_schema = 'Company';
-- 創建表格後建立索引  create方式，但主索引(PK)僅能用alter方式
create table if not exists t5(
	id int,
    name varchar(20) ,
    tel varchar(20) ,
    address varchar(20)
);
create unique index email_index on t5(name);
create index tel_index on t5(tel);
 -- create primary index on t5(id); 這是錯誤的
alter table t5 add primary key(id);
--  只要前面5個
create index tel5 on t5(address(5));
-- 刪除索引，主鍵要特別引號(tab上方)
drop index tel5 on t5; 
drop index tel_index on t5; 
drop index `primary` on t5;
drop index email_index on t5;
desc t5;
-- bigint 一種整數資料類型，用於儲存超大範圍的整數； unsigned 修飾數值類型，表示「只允許非負數」。
--  INT UNSIGNED 範圍是 0 到 4,294,967,295（原 INT 為 -2,147,483,648 到 2,147,483,647）。
-- auto_increment 自動為欄位生成遞增的唯一值（通常用於主鍵） ; auto_increment = 1000 從 1000開始編號。
create table t6(
	no bigint unsigned not null  auto_increment primary key,
    name varchar(20),
    tel varchar(20)
)auto_increment = 1000;
-- serial 為簡化寫法，自動創建一個 BIGINT AUTO_INCREMENT 欄位，是 BIGINT NOT NULL AUTO_INCREMENT UNIQUE 的語法糖
create table t7(
	no serial,
    name varchar(20),
    tel varchar(20)
)auto_increment = 1000;
insert into t7 (name, tel) values ('aaaaa','aaaaaa');
insert into t7 (name, tel) values ('bbbbb','bbbbbb');
-- 創一個專門做編號的表單，取最後一個id的編號，用於下一個表單，可以避免自動編號滿(即使是bigint)，truncate會把編號全部刪除
SELECT * FROM company.t7;
select last_insert_id();
insert into order_A(order_no) values (last_insert_id());
delete from t7;
truncate t7;
-- 時間戳記 要背
create table t8(
	ID serial,
    V varchar(10),
    created timestamp default current_timestamp,
    updated timestamp on update current_timestamp
);
insert into t8 (id, v) values (1, 'aaaaaa');
insert into t8 (id, v) values (2, 'bbbbbb');
update t8 set V = 'YYYYYY' where V = 'aaaaaa';
-- 看索引 不常用
show index from t8;
-- 比較常用
desc t8;

-- 從0開始，開關打開，一般不會使用
insert into t8 (id, v) values (0, 'GGGGGG');
insert into t8 (id, v) values (NULL, 'NNNNNN');
update t8 set V = 'ZZZZZZ' where V = 'GGGGGG';
set SQL_MODE = 'NO_AUTO_VALUE_ON_ZERO';
-- 關掉開關
set SQL_MODE = '';



