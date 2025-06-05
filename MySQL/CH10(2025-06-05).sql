-- 子查詢
-- 之前我要比較美國人口數和其他國家要分兩段次，還要記住之前的結果
select population from world.country where code = 'USA'; 
select code, population from world.country where population >= 278357000;
--  可以用括號，括號內就是子查詢
select code, population from world.country where population >=(select population from world.country where code = 'USA');

select name, gnp, code from world.country where gnp=(select max(gnp) from world.country);
select name, gnp, code from world.country where gnp=(select max(gnp), code from world.country group by code); -- ERROR
-- 多值可以用in 
select name from world.country where code in ( select countrycode from world.city where population > 9000000);
select name from world.country where code = 'bra' or code = 'chn' or code = 'ind' or code = 'bra'; -- 傳統作法

-- 建立練習用表格
use JAVADB;
create table if not exists OUTERTABLE(
	N int
);
create table if not exists INNERTABLE(
	N int
);
insert into outertable values (1),(2),(3),(4),(5);  -- 全體員工
insert into innertable values (2),(3);              -- 工讀生

-- 用其他運算子，比較2個表格
-- All 
select * from outertable where N > ALL(select n from innertable);
select * from outertable where N >= ALL(select n from innertable);
select * from outertable where N <> ALL(select n from innertable); -- 不等於
-- 使用any 也等同 some
select * from outertable where N = any(select N from innertable);
select * from outertable where N = some(select N from innertable);
select * from outertable where N <> any(select N from innertable); -- 會全出來
select * from outertable where N >= any(select N from innertable); -- 會包含 2~5

-- 下面兩個查詢方式等效果
select name, gnp from world.country where continent = 'ASIA' and governmentform = 'REPUBLIC';
select name, gnp from world.country where (continent, governmentform) = ('ASIA', 'REPUBLIC');
-- 多欄位子查詢
select name, gnp from world.country where 
Region = (select Region from world.country where name = 'IRAQ') -- Middle East
and
governmentform = (select governmentform from world.country where name = 'IRAQ')  -- Republic
and
continent = (select continent from world.country where name = 'IRAQ');  -- Asia
-- 相等效果
select name, gnp from world.country where 
Region in (select Region from world.country where Region = 'Middle East') 
and
governmentform in (select governmentform from world.country where governmentform = 'Republic')
and
continent in (select continent from world.country where continent = 'Asia'); 
-- 另一種雙欄位查詢方式
select name from world.country where (Region, GovernmentForm) = 
(select Region, GovernmentForm from world.country where name = 'IRAQ');


select Continent, MAX(gnp) from world.country group by Continent;
-- 找到對應的國家 ，多值要用in
select Continent, name, gnp from world.country where (Continent, gnp) in 
(select Continent, MAX(gnp) from world.country group by Continent);

-- 字串連結的函式
select concat('The gnp of JAPAN =', gnp) from world.country where name = 'JAPAN';
select concat('The gnp of JAPAN =', (select gnp from world.country where name = 'JAPAN' )) AS JAPAN;

select(select population from world.country where Name = 'JAPAN')/(select sum(population) from world.country) as '日本人口占比';

-- 亞洲GNP前10  ，這邊給from一定要別名才不會報錯
select name, gnp from (select * from world.country where Continent = 'ASIA') ASIACOUNTRY order by GNP DESC limit 10;
select name, gnp from world.country where Continent = 'ASIA' order by GNP DESC limit 10;


-- inner join  把子查詢的資料表和country資料表一起使用 ，
select country.name, Office.language, country.Population,  country.code, Office.countrycode
from  country, (select countrycode, language, percentage from countrylanguage where IsOfficial = 'T') AS Office
where code = countrycode;

-- 建立要匯入的空table
create table if not exists Mycountry(
	code char(3),
    name char(52),
    continent enum('asia', 'africa', 'europe'),
    region char(26),
    population int,
    gnp float(10,2)
);
-- 使用子查詢匯入table
insert into Mycountry (select code, name, continent, region, population, gnp from world.country where Continent = 'asia');
drop table if exists mycountry;
replace into Mycountry (select * from world.country where continent = 'europe'); -- 錯誤 欄位數不相等
replace into Mycountry (select code, name, continent, region, population, gnp from world.country where Continent = 'europe');


-- 使用子查詢並更新資料  
update cmdev.emp set salary = salary - 33 where Deptno = (select deptno from cmdev.dept where dname = 'sales');
update cmdev.emp set salary = salary + 88 where job = (select distinct job from cmdev.emp where job = 'salesman'); -- 錯誤，同一張表做子查詢並修改；distinct為僅顯示唯一值

-- 刪除配合子查詢 記得測試時要先start transaction才可還原
start transaction;
delete from cmdev.emp where deptno = (select deptno from cmdev.dept where dname='sales');
rollback;

start transaction;
delete from cmdev.emp where deptno = (select distinct deptno from cmdev.emp where deptno = 30); -- 錯誤，同一張表做子查詢並修改；distinct為僅顯示唯一值
rollback;

-- 找出員工比他的上司雇用日期還要早的員工有哪些 ，子查詢使用到外部查詢的資料
select empno, ename, manager, hiredate from cmdev.emp as E where hiredate < (select hiredate from cmdev.emp where empno = E.manager);


-- 確保值域的正確性 Check、Constraint
use javadb;
create table persons(
	ID int not null primary key,
    Lastname varchar(60) not null,
	Firstname varchar(60) not null,
	Score int,
    Check(Score >= 0 and Score <=100)
);
create table people(
	ID int,
	Lastname varchar(60) not null,
	Firstname varchar(60) not null,
	Score int,
	city varchar(10),
    constraint CHK_SCORE_CITY check( (Score between 0 and 100) and (city = 'Taipei'))
);
insert into people values (1, 'AAA', 'AAA', 70, 'Taipei');
-- 下面幾個檢視都找不到constraint屬性
desc people;
select * from information_schema.tables where table_name = 'people';
show tables from javadb;
CREATE TABLE `persons` (
  `ID` int NOT NULL,
  `Lastname` varchar(60) NOT NULL,
  `Firstname` varchar(60) NOT NULL,
  `Score` int DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `persons_chk_1` CHECK (((`Score` >= 0) and (`Score` <= 100)))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 跳號需求不是1的
create table T3(
	N serial,
    name varchar(10)
) auto_increment = 1000;
insert into T3 values(null, 'AAAAAA');
show variables like 'auto_%';
set auto_increment_increment = 3;  -- 用這個需修改

-- 自動編號重置
truncate t3;
alter table t3 auto_increment = 3;  -- 目前測試沒有效果

-- Enum的特性
insert into cmdev.enumtable values ('XS','AA');
insert into cmdev.enumtable values ( 2,'AA');  -- 為Enum內的第二個合法參數，不是真的數值2；(enum('XS','S','M','L','XL'))
insert into cmdev.enumtable values ( 3,'QQ');
insert into cmdev.enumtable values (4,'YY');
select * from cmdev.enumtable order by enumsize;  -- 無法按照enum設定的順序排序
-- 可以把值包在一個欄位
insert into cmdev.settable values ('MON,TUE,WED');  -- 中間不能有空格
insert into cmdev.settable values (0),(1),(4),(16); -- 0代表沒有, 1代表2的0次方也就是MON, 4代表2的2次方也就是TUE, 16代表2的4次方也就是FRI
insert into cmdev.settable values (21);  -- 相當於1+4+16

