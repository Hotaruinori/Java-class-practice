-- E為次方的意思，如5E+3 = 5000 代表5*10的3次方，+可省略
-- SQL最多可以會儲存小數點後30位數 
SELECT 0.1 + 0.1 = 0.2, 0.1E0 + 0.1E0 = 0.2E0;
SELECT 0.1 + 0.2 = 0.3, 0.1E0 + 0.2E0 = 0.3E0; -- 後者不相等
SELECT 1 + '2', '1' + '2' , '1E+2' + '2E-2'; -- 照樣計算 但非數字會警告

-- 字串連接可以使用||運算子，但要透過設定改變SQL預設處理方式
SELECT 'Hello' || 'MySQL';
SET SQL_MODE = 'PIPES_AS_CONCAT'; -- 跑過這個設定才可以字串連接 
SELECT 'Hello'   'MySQL';
SET sql_mode = 'IGNORE_SPACE'; 
SET SQL_MODE ='';
-- 建議直接省用 CONCAT or CONCAT_WS函式 ，CONCAT_WS函式第一個值為要用來連結的文字(或符號)，要加' '引號
select concat(name, continent, region) from world.country;
select concat_ws('$$$', name, continent, region) from world.country;

-- 判斷null值如果直接用=等算術運算式或比較運算式，結果會全部都是null 
SELECT NULL = NULL, NULL < NULL, NULL != NULL, NULL +3 ;
SELECT NULL is NULL, NULL is not NULL, NULL <=> NULL ;


SELECT datediff('2007-01-01', '2022-01-01'); -- 計算前減後的天數差

SELECT ename, hiredate, datediff('2007-01-01', hitrdate) days 
FROM CMDEV.emp;

-- 總長度５０前面補＄號 
SELECT LPAD(Name, 50, '$')
FROM world.country
WHERE Continent = 'Antarctica';
-- 總長度５０後面補＄號 
SELECT RPAD(Name, 50, '$')
FROM world.country
WHERE Continent = 'Antarctica';

SELECT left('ABCDE', 2), right('ABCDE', 2),
	SUBSTRINGt('ABCDE', 2), t('ABCDE', 2, 3);
    
SET SQL_MODE = 'PIPES_AS_CONCAT';




SELECT CONCAT_WS(', ', name, continent, region, population)
FROM world.country;


SELECT name, length(name) length
FROM world.country
ORDER BY length DESC;

SELECT name, CHAR_length(name) length
FROM world.country
ORDER BY length DESC;

-- A123456789 從第二個位置取一個值
SELECT substring('A123456789', 2, 1);
SELECT ltrim('  A123456789'   ); -- 消除左邊空白
SELECT Rtrim('  A123456789'   ); -- 消除右邊空白
SELECT Trim('  A123456789'); -- 消除左右邊空白
SELECT substring(Trim('  A123456789'), 2, 1);

-- 大小寫
SELECT lower('ABC');
SELECT upper('abc');

-- 增減時間
SELECT '2025-04-24' + interval 3 day;
SELECT '2025-04-24 14:00:00' + interval 3 hour;
SELECT '2025-04-24 14:00:00' - interval 3 hour;
SELECT '2025-04-24 14:00:00' + interval -3 hour;
-- 取得現在時間
SELECT curdate() + interval 30 day;
SELECT current_date();
SELECT curtime();
SELECT year(curdate());
SELECT month(curdate());
SELECT day(curdate());
SELECT extract(YEAR FROM curdate());
SELECT extract(month FROM curdate());
SELECT extract(day FROM curdate());
SELECT dayofmonth(curdate());
SELECT monthname(current_date());
SELECT dayname(current_date());
SELECT concat('星期', dayofweek(current_date()-1)); -- 從週日當第一天
-- 增減時間2
SELECT adddate(curdate(), 25);
SELECT adddate(curdate(), interval 25 day);
SELECT addtime(curdate(), '10:00:00'); -- 限制這個格式
SELECT subdate(curdate(), 3); -- 減3天
SELECT subtime(curdate(), '00:05:00');
SELECT datediff(curdate(), '2025-01-01'); -- 計算日期差距

SELECT name FROM country order by rand() limit 3; -- 任意參數排序 
SELECT name, year(curdate()) FROM world.country order by year DESC;


-- 偵測空格在第幾個位置 
SELECT name, locate(' ', name) FROM world.country;
-- 取姓氏
SELECT left(name, locate(' ', name) -1) NAMEofFirstWord
FROM world.country
WHERE locate(' ', name) <> 0;

-- 進位捨去
SELECT round(3.1415926), round(3.1415926, 3), ceil(3.1415926), floor(3.1415926);


-- 資料表別名
SELECT e.ename, e.hiredate
FROM cmdev.emp e;

SELECT ename, hiredate,
	if ( year(hiredate) < 1985, 'Senior', 'General')
FROM cmdev.emp
order by hiredate;


-- 多條件判斷 
SELECT ename, salary, 
	CASE 
		WHEN salary >=3000 THEN 'A'
        WHEN salary >=1000  AND salary <=2999 THEN 'B'
        ELSE 'C'
    END grade
FROM cmdev.emp order by salary DESC;

-- 多條件判斷 ，依照條件加薪，去掉小數點
SELECT ename, salary, round(salary * 
	CASE 
		WHEN salary >=3000 THEN 3
        WHEN salary >=1000  AND salary <=2999 THEN 2
        ELSE 1.1
    END )bonus
FROM cmdev.emp order by salary DESC;
-- 多條件判斷 
SELECT ename, salary, job,
	CASE job 
		when  'SALESMAN' then 'A'
        when  'CLERCK' then 'B'
        ELSE 'C'
    END jobs
FROM cmdev.emp;

SELECT ename, salary, job,
	CASE 
		when  job  = 'SALESMAN' then 'A'
        when  job  = 'CLERCK' then 'B'
        ELSE 'C'
    END jobs
FROM cmdev.emp;


SELECT empno, ename, salary, comm, salary+comm from cmdev.emp; -- 會有問題，+null的結果也會變null
SELECT empno, ename, salary, comm, salary + ifnull(comm, 0) from cmdev.emp; -- 正常
SELECT comm, isnull(comm) from cmdev.emp;
SELECT comm<=>NULL from cmdev.emp;



SELECT SUM(population) PopSum,
		AVG(population) PopAvg,
        MAX(population) PopMax,
        Min(population) PopMin,
        Count(*) Amount
FROM world.country;


SELECT count(*), count(code), count(indepyear), count(lifeExpectancy)
FROM world.country;

SELECT count(*), count(comm), count(deptno)
FROM cmdev.emp;

SELECT group_concat(dname order by dname Separator ' | ')
FROM cmdev.dept;


SELECT Region FROM world.country WHERE Continent = 'Europe';
SELECT group_concat(distinct region) FROM world.country WHERE Continent = 'Europe';


SELECT continent, SUM(population) PopSum
FROM world.country
group by Continent;


SELECT region, SUM(population) PopSum
FROM world.country
group by region;

SELECT continent, count(*) Amount
FROM world.country
group by Continent;

SELECT region, count(*) Amount
FROM world.country
group by region;

SELECT region FROM world.country where Region = 'CENTRAL AFRICA';

#12 使用資料庫函式計算您已經活了幾天了。
SELECT datediff(curdate(), '1989-03-04');
-- 如果你想計算到某個特定日期（例如 2025-12-31）的天數 
SELECT DATEDIFF('2025-12-31', '1990-05-15') AS days_until_2025_end;
-- 如果你想知道更詳細的年齡（例如 35 歲 7 個月 10 天），可以使用 TIMESTAMPDIFF()： 
SELECT
TIMESTAMPDIFF(YEAR, '1990-05-15', CURRENT_DATE()) AS years,
TIMESTAMPDIFF(MONTH, '1990-05-15', CURRENT_DATE()) % 12 AS months,
DATEDIFF(CURRENT_DATE(), 
		DATE_ADD('1990-05-15', 
				INTERVAL TIMESTAMPDIFF(MONTH, '1990-05-15', CURRENT_DATE()) MONTH)
) AS days;


#13 使用cmdev資料庫
-- 1. 計算進入公司年度等於1981年者，年終獎金(bonus)為月薪的2倍。
-- 2. 顯示欄位ename, hiredate, salary, bonus。
SELECT ename, hiredate, salary, salary * 2 as bonus 
FROM cmdev.emp where year(hiredate) = 1981;

select ename, hiredate, salary,
	case
		when YEAR(hiredate) = 1981 then salary*2
        else 0
	end as bonus
from cmdev.emp; 

#14 使用extract函式
-- 顯示取得今日的年，月，日
SELECT extract(YEAR FROM curdate()) as year,
extract(month FROM curdate()) as month,
extract(day FROM curdate()) as day;

#15 顯示現在時間之後的3小時的'時'的部分為何?
SELECT hour(curtime() + interval 3 hour);

#16 請用適當函式如下說明顯示字串AppleOrangeMango的變化
-- 1. 共有幾個字元
-- 2. 顯示從左邊開始5個字元
-- 3. 顯示從右邊開始5個字元
-- 4. 顯示從第5個字元開始，存取6個字元
select length('AppleOrangeMango');
select left('AppleOrangeMango', 5);
select right('AppleOrangeMango', 5);
select substring('AppleOrangeMango', 5, 6);

#17 使用concat_ws函式
-- 1. 使用world資料庫的country資料表
-- 2. 將欄位code與name欄位內容連結起來，中間用$$$隔開
select * from world.country;
select concat_ws('$', code, name) from world.country;

#18 使用cmdev資料庫
-- 1. 計算進入公司年度等於1981年者，年終獎金(bonus)為月薪的2倍。
-- 2. 顯示欄位ename, hiredate, salary, bonus。
select ename, hiredate, salary, salary*2 as bonus from cmdev.emp where year(hiredate) = 1981;

#19 使用cmdev資料庫
-- 1. 使用emp資料表。
-- 2. 找出並顯示該公司總共有幾種職務名稱之語法。
select count(distinct job) from cmdev.emp;



