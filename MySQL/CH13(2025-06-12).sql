-- Stored Routine = Function + Stored Procedure

-- Drop 資料表> 設定變數及值 >查詢某資料表> 建立資料表
-- 可以把上述流程建立Procedure ，
USE `cmdev`;
DROP procedure IF EXISTS `show_emp_procedure`;
DELIMITER $$
USE `cmdev`$$
CREATE PROCEDURE `show_emp_procedure` ()
BEGIN
	select * from cmdev.emp;
    select count(*) from cmdev.emp;
END$$
DELIMITER ;
-- 執行Procedure 
call cmdev.show_emp_procedure();
-- -------------------------procedure範例2-----------------------
-- 讓分號設定為$$
DELIMITER $$     
USE cmdev $$
DROP procedure IF EXISTS my_emp $$
create procedure my_emp()
begin
	select * from cmdev.emp;
end$$
DELIMITER ;     
-- 恢復原狀
call cmdev.my_emp();
-- -------------------------procedure範例3-----------------------
--  Delimiter 後可以用其他符號 比方#$% 但整個範圍都要使用相同的
Delimiter $$
use cmdev $$
drop procedure if exists show_empnember $$
create procedure show_empnember()
begin
	set @emp_number = 0;
	select count(*) from cmdev.emp into @emp_number;
    select concat('總共',@emp_number, '位員工');
end $$
Delimiter ;
call show_empnember();
-- -------------------------Function範例-----------------------
-- 先打開開關
Show variables like '%FUNC%';
set global log_bin_trust_function_creators = 1
-- 開始建立 Function一定要回傳值，外面的retuns有s，裡面的沒有要注意
Delimiter $$$$
use cmdev $$$$
drop function if exists show_emp$$$$
create function show_emp() returns varchar(30)
begin
	set @emp_number = 0;
	select count(*) from cmdev.emp into @emp_number;
    return concat('總共',@emp_number, '位員工');
end$$$$
Delimiter ;
-- functon前導要用select
select show_emp();


-- --------設計可傳入兩個參數並回傳參數相加結果-----------------------
-- procedure 參數方向可以是IN/OUT/INOUT  ，但 functon 只有IN一個方向
Delimiter $$
use cmdev $$
drop function if exists SUM_TWO $$
create function SUM_TWO(A INT,B INT) returns INTEGER
begin
	return A + B;
end $$
Delimiter ;
-- 執行要數入參數
select SUM_TWO(10, 30);


-- ----------
Delimiter $$
drop procedure if exists sum_m$$
create procedure `sum_m`(IN m int, OUT output int)
begin
	declare x int;
    set x = 1;
    set output = 0;
    while x <=m do
		set output = output + x;
	set x  = x + 1;
    end while;
end $$
Delimiter ;
-- ----------
Delimiter $$
drop procedure if exists sum_n$$
create procedure `sum_n`(n int)
begin
	select (n+1)*n/2;
end $$
Delimiter ;
