 -- CHAPTER 2 
 -- Structure Query Language (SQL) (DQL = Data Query Language)(ANSI92)(ISO標準)
 -- database(schema) -> table(資料表) + views(視圖) + stored procedure(預存程序) + function(函式)alter
 -- tables -> column(欄位/行) + index(索引) + foreign key(外鍵FK) + trigger(觸發器)
 -- fk. -> index的一種
 -- 關聯式資料庫管理系統(rdbms) -> 關聯(主鍵PK primate key)與外鍵(FK)的連結
 -- pk = primary key 主鍵(內容不可重複/ 不可空值null/ 在一個資料夾中只能有一個主鍵)

USE world;
 --  顯示或查詢
SELECT 123;
SELECT '123';
SELECT 123+456;
SELECT '123'+'456';
 -- 相加 ABC會視為0
SELECT 'ABC'+'456';
SELECT * FROM world.city;
SELECT ID , CountryCode, name FROM city;
 -- 數學
SELECT 7 % 3; -- 餘數
SELECT 7 MOD 3 ;
SELECT 7 * 3;
SELECT 7 / 3 ;
SELECT 7 div 3;
 --  使用別名, 可加AS 或 空格
SELECT ENAME, hiredate, salary, salary*12 AS 年薪, (salary*12) + (salary DIV 2) 年薪加年終 FROM CMDEV.EMP;
 -- 單雙引號都可以
SELECT ENAME AS "SELECT", hiredate, salary FROM CMDEV.EMP;

 -- 條件
SELECT * FROM cmdev.emp WHERE job = "Clerk";
SELECT * FROM cmdev.emp WHERE salary  >= 2000;
SELECT * FROM cmdev.emp WHERE hiredate >= '1981/01/01';
 -- 可以用於判斷空值的等於
SELECT * FROM cmdev.emp WHERE comm  <=> null;
SELECT * FROM cmdev.emp WHERE comm  = null; -- 這個找不到
SELECT * FROM cmdev.emp WHERE comm  is null; -- 相當於等於
 -- 找出薪資介於1500~2500
SELECT * FROM cmdev.emp where salary <=2500 and salary >=1500;
SELECT * FROM cmdev.emp where salary between 1500 and 2500;
 -- 不等於
SELECT * FROM cmdev.emp where comm is not null;
SELECT * FROM cmdev.emp where salary != 1500;
 -- 
SELECT * from world.city where CountryCode = 'TWN';
 -- 運算順序先 and 再 or
select name, continent, population from world.country where
(Continent = 'Europe' or Continent = 'Africa') and Population < 10000;
 -- IN 代替 OR
SELECT name, continent, region, Population from world.country where Continent = 'ASIA'
	OR Continent = 'Africa' or Continent = 'Europe';
SELECT name, continent, region, Population from world.country where 
 Continent IN ('ASIA' , 'Africa', 'Europe');
 
  -- 找出1980-1981到公司上班的員工有哪些？alter
USE CMDEV;
SELECT * FROM cmdev.emp where hiredate >= '1980-01-01' and hiredate <= '1981-12-31';
SELECT * FROM cmdev.emp where hiredate between '1980-01-01' and '1981-12-31';

 -- #1 查詢顯示world資料庫中city資料表所有的資料
SELECT * FROM world.city;
 -- #2 請查詢顯示cmdev資料庫中emp資料表 ，1. empno, ename, job欄位內容
SELECT empno, ename, job FROM cmdev.emp; 

 -- 模糊比對
SELECT *  FROM world.city;
SELECT ID, name FROM world.city WHERE NAME LIKE 'W%';
SELECT ID, name FROM world.city WHERE NAME LIKE '%W';
SELECT ID, name FROM world.city WHERE NAME LIKE '%W%';
SELECT name, continent, region FROM world.country WHERE Region LIKE '%BB%';  -- 找BB
SELECT name, continent, region FROM world.country WHERE Continent LIKE '______A'; -- 找A前面有6個字
SELECT name, continent, region FROM world.country WHERE NAME LIKE 'A________'; -- 找A後面有8個字

 -- 排序
SELECT empno, ename, job, manager, hiredate, salary FROM cmdev.emp order by salary ASC; -- 小大
SELECT empno, ename, job, manager, hiredate, salary FROM cmdev.emp order by salary DESC; -- 大小
SELECT empno, ename, job, manager, hiredate, salary FROM cmdev.emp order by salary, hiredate; #依次排序(小大)
SELECT empno, ename, job, manager, hiredate, salary FROM cmdev.emp order by salary DESC, hiredate;
SELECT empno, ename, job, manager, hiredate, salary FROM cmdev.emp order by 2 ; -- 在SQL中從1開始計算欄位
SELECT empno, ename, job, manager, hiredate, salary*12 AS Annual_Salary FROM cmdev.emp order by Annual_Salary;  -- 直接用別名
SELECT empno, job, manager, hiredate, salary*12 AS Annual_Salary FROM cmdev.emp order by ename; -- 用沒選到的參數排序
 -- 你的老闆要求列出薪資前三高(低)
SELECT empno, ename, job, manager, hiredate, salary FROM cmdev.emp order by salary DESC limit 3; 
SELECT empno, ename, job, manager, hiredate, salary FROM cmdev.emp order by salary ASC limit 3;
 -- 除了前3低不顯示(跳過)，顯示第4-10名(低)，從跳過後的開始顯示7比
SELECT empno, ename, job, manager, hiredate, salary FROM cmdev.emp order by salary ASC limit 3, 7;

#3使用cmdev資料庫 找出emp(員工)資料表中，薪資>=1000的員工有哪些，顯示員工編號，員工姓名，雇用日期及薪資。
SELECT empno, ename, hiredate, salary FROM cmdev.emp WHERE salary >= 1000 ;
#4 使用world資料庫的city資料表 
	-- 1. 顯示id, name欄位
	-- 2. 過濾條件為CountryCode欄位中開頭有t的資料。
SELECT ID, Name FROM world.city WHERE CountryCode LIKE 't%';
-- CHAPTER 2 
-- 練習1
USE world;
SELECT code AS countrycode, name, population FROM world.country WHERE population >= 500000;
-- 練習2
SELECT continent, code, name, population FROM world.country WHERE Continent IN ('ASIA', 'EUROPE', 'AFRICA');
-- 練習3
SELECT code, name, population FROM world.country WHERE Region = 'MIDDLE EAST' ORDER BY Population ASC;