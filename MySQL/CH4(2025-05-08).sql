-- JOIN 與 UNION 查詢
select country.code, country.Capital, city.Name from world.city,world.country; -- 交叉查詢corss join 但目前的還無意義需要再加工
select country.code, country.Capital, city.Name from world.city,world.country
	where country.Capital = city.id order by Capital;                             -- inner join 把有相同含意的欄位做連結才有意義
select code, Capital, city.Name from world.city,world.country
	where country.Capital = city.id order by Capital;                             -- 省略的理由是兩個資料表中沒有重複的名稱才能
select CO.code, CO.Capital, CI.Name from world.city CI,world.country CO
	where CO.Capital = CI.id order by Capital;                             -- 也可以用代號

-- 使用JOIN  inner可省略
select code, Capital, city.Name from world.city inner join world.country   
	on Capital = id order by Capital; 
-- inner join下面三種都可以 
select EMPNO, ename, dname from cmdev.emp, cmdev.dept where emp.deptno = dept.deptno;
select EMPNO, ename, dname from cmdev.emp inner join cmdev.dept on emp.deptno = dept.deptno;
select EMPNO, ename, dname from cmdev.emp inner join cmdev.dept using (deptno);

-- outer join
-- left right為選擇哪一個是主要資料表
select emp.empno, emp.ename, emp.deptno, dept.dname from cmdev.emp left outer join cmdev.dept on emp.deptno = dept.deptno;
select emp.empno, emp.ename, emp.deptno, dept.dname from cmdev.emp right outer join cmdev.dept on emp.deptno = dept.deptno;

select emp.empno, emp.ename, emp.deptno, dept.dname from cmdev.emp right outer join cmdev.dept using (deptno);

-- 使用union，搜尋的欄位名稱與數量要一樣 ，名稱不一樣雖然不會報錯，但會是沒意義的結果。
select region, name, population from world.country where region = 'western europe' and Population < 200000
union
select region, name, population from world.country where region = 'eastern europe';

#21使用cmdev.emp, dept資料表
-- 1. 找出有部門的員工資料之指令敘述。
-- 2. 顯示員工編號，姓名，隸屬的部門名稱。
select emp.empno, emp.ename, dept.dname from cmdev.emp join cmdev.dept on emp.deptno = dept.deptno;

#22 使用WORLD資料庫
-- 1. 使用CITY與COUNTRY資料表。
-- 2. 找出capital與id有相同的資料之指令敘述。
-- 3. 顯示欄位為code, capital,city資料表的name。
-- 4. 請使用資料表別名。
select code, capital, CI.name from world.country CO join world.city CI on CO.Capital = CI.id;

#23 請使用world.city及world.country資料表
-- 1. 使用outer join，顯示code(country), name(country),capital,district,population欄位，並找出(country)資料表的所有資料之指令敘述。
select country.code, country.name, capital, district, country.population 
	from world.city right outer join world.country on country.Capital = city.id;

#24 使用cmdev資料庫的emp, dept資料表
-- 1. 使用交叉查詢方式，查詢兩個資料表的結合資料的呈現。
-- 2. 呈現empno, ename, deptno三個欄位。
select empno, ename, emp.deptno from cmdev.emp, cmdev.dept where emp.deptno = dept.deptno;

#25 顯示出有那些部門(dept資料表)沒有員工之指令敘述
select dept.dname 
from cmdev.emp right outer join cmdev.dept on emp.deptno = dept.deptno 
where ename is null;

-- 練習1
select empno, ename, job, d.deptno, d.dname 
from cmdev.emp e inner join cmdev.dept d on e.deptno = d.deptno;

-- 練習2
select empno, ename, job, d.deptno, d.dname 
from cmdev.emp e left join cmdev.dept d on e.deptno = d.deptno;

-- 練習3
select 'Minimum' as 'Asia', min(population) as population from world.country where Continent = 'asia'
union
select 'Maximum' as 'Asia', max(population) as population from world.country where Continent = 'asia';
