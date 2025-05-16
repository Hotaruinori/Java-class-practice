 -- 建議資料表要先選擇資料庫
 -- auto_incremnet 是自動給號 ，必須是primary key 或是 Unique
 -- delete刪除後還是會接續編下去， 除非用truncate
 -- truncate 後會從1開始編號，之後如果有插隊編號，還是會從最後一個號碼編號，可用last_insert_ID做確認 
use javdb;
create table T1(
	ID int not null Auto_increment,
    name char(30) not null default 'YOUR NAME',
	Address varchar(60),
    primary key (ID)
)auto_increment = 3000 default character set = utf8mb4;
  
delete from javadb.t1;
insert into javadb.t1 (Address) values ('DDDDD');
truncate javadb.t1;
insert into javadb.t1 (ID, Address) values (3, 'FFFF');
select last_insert_ID();
 -- 自動編號會給到int的上限，避免號碼滿可以建立一個專門的自動給號表格，比方表格欄位用日期＋自動給號表格 
 --  Serial (會賦予not null, Unique, unsigned,  Auto_increment)
 --  Unique (唯一/可允許NULL/一個資料表中可有多個UQ)
 --  Primary (唯一/不可允許NULL/一個資料表中只能有一個PK)
 --  Unsigned (不能有負號) 
create table T2(
	ID serial,
	name char(30),
    Address varchar(30)
);
create table if not exists T3(
	ID serial,
	name char(30),
    Address varchar(30),
    primary key (ID)
);
-- 檢視、設定引擎 
show engines;
set global storage_engine = MYISAM; -- 這一個是舊版本的引擎 
set session storage_engine = ? ;-- 只有使用的用戶端會改 

-- CRUD  
drop table if exists t3; 
-- 修改
alter table `javadb`.`t1` add column `TEL` varchar(45) NULL after `Address`; 
alter table javadb.employee add column MEMO varchar(100) NULL after EMP_Photo;
alter table javadb.employee add column EMP_NO varchar(100) NULL first;
alter table javadb.employee add column Parent varchar(100) NULL;
-- change 修改欄位名稱定義及位置, modify 不能改名稱可改定義與位置
alter table javadb.t2 change column address ADDR varchar(50) after id;
alter table javadb.t2 modify addr varchar(30) after name;
-- 刪除欄位
alter table javadb.t2 drop column addr; 
-- 修改table名字
alter table javadb.t2 rename to TX; 
rename table javadb.tX to T2, T1 to T5;
-- show查詢
show tables from javadb; 
show tables from world like '%Y%'; 
-- 系統資料庫查詢
select * from information_schema.tables where table_schema = 'world';
DESC world.country;
show columns from world.country;
show fields from world.country;
show create table javadb.employee;

 
 #31 使用CREATE TABLE指令建立TABLE：Product_Main
 create table Product_Main(
	Product_ID int not Null Auto_increment,
    Product_name Varchar(60) Null,
    Product_list Decimal(10, 1) Null,  -- DECIMAL(10, 1) 是一種精確數值資料類型，10 位數（包括整數部分 + 小數部分） 
    Product_cost Double Null,
    Product_lind Enum('餅乾', '糖果', '米果') Null,
    ProductRemark01 Text Null,
    ProductRemark02 Text Null,
    primary key (Product_ID)
 );
 
 #32 使用撰寫指令方式建立資料表VENDOR_MAIN
 Create Table VENDOR_MAIN(
	VENDOR_ID int not Null Comment '廠商編號',
    VEN_NAME Varchar(36) Null,
    VEN_TEL Decimal(20) Null,
    VEN_AREA Enum('台北市', '桃園市', '新竹市') Null,
    Primary key(VENDOR_ID)
 );
 
#33 修改32題資料表內容
-- 1. 使用指令將VEN_AREA欄位順序搬到最前面。
alter table javadb.VENDOR_MAIN modify column VEN_AREA Enum('台北市', '桃園市', '新竹市') first;

#34 修改31題資料表內容
-- 1. 將PRODUCT_COST欄位更改為FLOAT(10,1)屬性。
-- 2. 欄位名稱更改為COST。
-- 3. 將欄位移至最後2個位置。
alter table javadb.Product_Main change column PRODUCT_COST COST Double After ProductRemark01;

