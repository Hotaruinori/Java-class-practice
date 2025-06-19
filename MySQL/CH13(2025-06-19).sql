Delimiter $$
use javadb$$
drop procedure if exists Test_Proc$$
Create procedure Test_Proc(IN PI_IN int, OUT PO_OUT int, INOUT PIO_INOUT int)
begin
	Select PI_IN, PO_OUT, PIO_INOUT;
    set PI_IN = 99;
    set PO_OUT = 99;
    set PIO_INOUT = 99;
end $$
Delimiter ;

Call Test_Proc(1, 2, 3); -- 這會錯誤不能硬塞
Call Test_Proc(1, @MY_OUT, @MY_INOUT);  -- 這個OK
select @PO_OUT;  -- 還是null
select @PO_IN; 
select @MY_OUT;  -- 接收值的是它所以變成99
select @MY_INOUT;  -- 也會是99

-- 設定看看
set @MY_IN = 1, @MY_OUT = 2, @MY_INOUT = 3;
Call Test_Proc(@MY_IN , @MY_OUT, @MY_INOUT);   -- 會是1 、null、3  (如果是原地執行執行第二次會是1 、null、99) 
select @MY_OUT;   -- 會是99
select @MY_INOUT;  -- 也會是99
-- ----------------------------------------------------------
Delimiter $$
use javadb$$
drop procedure if exists My_test$$
create procedure My_test(IN PI_CON varchar(30))
begin
	select count(*) from world.country where continent = PI_CON;
end$$
Delimiter ;

call javadb.My_test('Europe');
set @MY_Continent = 'ASIA';
call My_test(@MY_Continent);
-- --------------------------------------------------------------
Delimiter $$
use javadb$$
drop procedure if exists You_test$$
create procedure You_test(IN PI_IN varchar(30), OUT PI_OUT int)
begin
	select count(*) into PI_OUT from world.country where continent = PI_IN;


end$$
Delimiter ;

call You_test('ASIA', @My_count);
select @My_count;







