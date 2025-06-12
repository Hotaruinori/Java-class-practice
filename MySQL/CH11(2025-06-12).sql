-- view 的用途之一是簡化作業
-- 也可以稱為虛擬表格不是真正存在的資料表(代表而已)，也不會有任何(主)鍵
-- 安全機制，讓使用者指考透過檢視，而不是直接訪問底層資料表
-- 命名盡量讓人可以一看就知道是view

-- 創建範例
create view `new_EMP` AS
select * from emp order by salary;

-- 使用
select * from cmdev.new_emp;

-- or replace
use JAVADB;
create or replace view `EMP_view` AS          -- DDL Data Defined Language
select empno, ename, job from cmdev.emp;

-- inner join
select emp_view.empno, emp_view.ename, emp.job from emp_view, cmdev.emp where emp_view.empno = emp.empno;
-- count
select count(*) from emp_view;
-- 配合子查詢
create or replace view MAXGNP as
	select name, GNP, region from world.country where (region, GNP) 
		in (select region, max(GNP) from world.country group by region);
        
-- 從這樣不能完全判定是否是table (除了看有沒有key)
desc maxgnp;
describe maxgnp;

-- 建立temporary table暫存式資料表 ，DB是找不到的，可以用在如購物車的場景，斷線就消失
create temporary table ABC(
	no serial,
    name varchar(20)
);
select * from ABC;
insert into ABC values (null, 'AAAAA');

-- view是不可以使用temorary table 也不能使用自定義變數，from子句不可以使用子查詢，如下面單獨select沒問題，但進到view由於名稱相同會錯誤
create or replace view Scaleveiw as
	select co.name, ci.name, co.population, ci. population from country co, city ci;
-- 這樣可以
create or replace view Scaleview as
	select co.name countryname, ci.name cityname, co.population country_popu, ci. population city_popu from country co, city ci;
-- 這樣也可以
create or replace view Sview(countryname, cityname, country_popu, city_popu) as
	select co.name, ci.name, co.population, ci. population from country co, city ci;
-- 修改
alter view sview as select co.name countryname, ci.name cityname, co.population country_popu, ci. population city_popu from country co, city ci;
-- 刪除
drop view if exists sview;

-- 修改view會反映到原始資料表 (反之亦然)
create or replace view cmdev.empdept30_view as
	select empno, ename, job, manager, hiredate, salary, comm from cmdev.emp where deptno = 30;
update  cmdev.empdept30_view set comm = 600 where empno = 7844;
-- 寫入可以新增本來不在view內的
insert into cmdev.empdept30_view values (9001, 'Kingkon', 'Salesman', 7698, '2025-06-12', 1250, 200);
-- 修改本來不在view內的是無效的(但不會報錯)
update  cmdev.empdept30_view set comm = 600 where empno = 7369;

--  WITH CHECK OPTION 會自動檢查條件是否為30號部門 (CASCADED連鎖檢查, 為預設)
create or replace view cmdev.empdept30_view as
	select empno, ename, job, manager, hiredate, salary, comm from cmdev.emp where deptno = 30 WITH CASCADED CHECK OPTION;
-- 現在寫入會錯誤，因為有設定WITH (CASCADED) CHECK OPTION
insert into cmdev.empdept30_view values (9002, 'Kingkong', 'Salesman', 7698, '2025-06-12', 1250, 200);   
 
 -- WITH LOCAL CHECK OPTION 只會檢查自己這一層的條件
create or replace view cmdev.empsalary_view as 
	select * from cmdev.emp where salary >= 1500;
-- 第二層(從view建立view)
create or replace view cmdev.empdept20_view as
	select * from cmdev.empsalary_view where deptno =20 with local check option;
    
-- 這行就不能改會出錯，因為違反with local check option
update cmdev.empdept20_view set deptno = 30 where empno = 7566;
-- 可改，但因為薪資已經小於1500(第一層)，所以已經不會出現在view中
update cmdev.empdept20_view set salary = 1000 where empno = 7566;
-- 一樣可以新增，但僅會在原始資料表看到因為salary<1000
insert into cmdev.empdept20_view values (7666, 'smith', 'clerk', 7566, '2025-06-01', 1000, 1, 20);
-- 如果改成連鎖cascaded 會連第一層都檢查 (重新製作view來測試)
create or replace view cmdev.empdept20_view as
	select * from cmdev.empsalary_view where deptno =20 with cascaded check option;
-- 現在再去修改就會出錯，因為cascaded check 會檢查到第一層 salary>= 1500的條件
update cmdev.empdept20_view set salary = 999 where empno = 7788;
-- 第一層刪除後會讓第二層無法跑
drop view cmdev.empsalary_view;
-- 如果有很多層可以用這方法檢查是哪一層出錯
check table cmdev.empdept20_view;
select * from information_schema.views where table_schema = 'cmdev';



















