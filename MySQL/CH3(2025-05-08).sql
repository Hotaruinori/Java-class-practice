use world;
-- 去除相同資料 
select distinct region from world.country;
-- emp 資料表有幾種職務
use cmdev;
select distinct job from emp;
 -- 群組化後呈現結果 (同樣有distinct效果), group by的參數必須要顯示否則會出錯
use world;
select Continent from world.country group by Continent;
select Continent, sum(population) from world.country group by Continent;
select Region, Round(avg(population)) from world.country group by Region;
select GovernmentForm, sum(population) from world.country group by GovernmentForm;
-- 如果群組化2個欄位，最好也顯示才有其意義
select Continent, Region, sum(population) from world.country group by Continent, Region order by Continent;
-- 群組小計 
select Continent, Region, count(*) from world.country group by Continent, Region with rollup;
select Continent, sum(population) from world.country group by Continent with rollup;
-- 如果使用group by 就要使用 having來代替 where
select Region, sum(population) from world.country where sum(population)> 1000000 group by Region; -- 這是錯的->
select Region, sum(population) from world.country group by Region having sum(population) > 1000000;
-- 是否打開開關會有影響 ，正常不會select中有region但group by中沒有這樣去使用，打開後會去檢查，如有這樣的情況才會報錯
select Continent, Region, count(*) from world.country group by Continent;
SET sql_mode = 'ONLY_FULL_GROUP_BY';


#20 使用cmdev資料庫
-- 1. 計算在emp資料表中，針對每類職務，總共要發多少佣金(comm)
select * from cmdev.emp;
select job, sum(comm) from cmdev.emp group by job;


-- 練習1
select empno, ename, hiredate, dayname(hiredate) as day from cmdev.emp;
-- 練習2
select ename, job, salary,
	case job
		when 'PRESIDENT' then salary*2
		when 'MANAGER' then salary*1.5
		when 'ANALYST' then salary*1
		else 0
    end bonus from cmdev.emp;
-- 練習3
select job, sum(salary) sum , avg(salary) average, max(salary) maximum, min(salary) minimum 
	from cmdev.emp group by job;