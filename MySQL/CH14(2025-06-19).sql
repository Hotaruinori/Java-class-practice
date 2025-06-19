-- 使用 Declare
Delimiter $$
use javadb$$
drop function if exists My_Func$$
create function My_Func(X1 int, X2 int) returns int Deterministic
begin
	Declare V1, V2, V3 int;
    Declare S1 int default 10;
    Set V1 = X1;
    Set V2 = X2;
    Set V3 = X1 + X2;
    Return V3;

end$$
Delimiter ;
-- 一樣打開可以自寫函數的設定  or 如上面使用Deterministic 都可以解決創函數發生錯誤的問題--
Show Variables Like '%FUNC%';
set global log_bin_trust_function_creators = 0;

-- 有沒有單引號都可--
Select My_Func(1, 2);
Select My_Func('1', '2');

-- in的方向可以省略---
Delimiter $$
use cmdev$$
drop procedure if exists Insert_dept$$
create procedure Insert_dept(New_deptno int, New_dept varchar(16), New_location varchar(16))
begin
	insert into cmdev.dept values (New_deptno, New_dept, New_location);
    select 'Insert Data Success!!!';
end $$
Delimiter ;

call Insert_dept(999, 'MIS', 'Taiwan');

-- UPDATE ----------------------
Delimiter $$
use cmdev$$
drop procedure if exists Update_dept$$
create procedure Update_dept(New_deptno int, New_dept varchar(16), New_location varchar(16))
begin
	Replace into cmdev.dept values (New_deptno, New_dept, New_location) ;
    select 'Update Data Success!!!';
end $$
Delimiter ;
-- 也可以用update set where 但要注意如果沒有找到對應的deptno即使沒報錯，但是不會更改成功
Delimiter $$
use cmdev$$
drop procedure if exists Update_dept$$
create procedure Update_dept(Search_no int, New_dname varchar(16), New_location varchar(16))
begin
	Update cmdev.dept set Dname = New_dname, Location = New_location where Deptno = Search_no ;
    select 'Update Data Success!!!';
end $$
Delimiter ;

call Update_dept(999, 'RD', 'JAPAN');
-- Delete ----------------------
Delimiter $$
use cmdev$$
drop procedure if exists Delete_dept$$
create procedure Delete_dept(Search_no int)
begin
	Delete from cmdev.dept where deptno = Search_no;
    select 'Delete Data Success!!!';
end $$
Delimiter ;

call Delete_dept(999);

-- 檢視cmdev中有的 routine_schema---------------
select * from information_schema.routines where routine_schema = 'cmdev';
select ROUTINE_DEFINITION from information_schema.routines where routine_schema = 'cmdev';


-- 使用判斷式---------------------
Delimiter $$
use javadb$$
drop procedure if exists Test_weight$$
create procedure Test_weight(IN Weight int)
begin
	if Weight>100 then
		select Concat('Your Weight greater than= ', Weight);
	elseif Weight<100 then
		select Concat('Your Weight less than= ', Weight);
	elseif Weight=100 then
		select Concat('Your Weight = ', Weight);
    end if ;
end $$
Delimiter ;

call javadb.Test_weight(101);
call javadb.Test_weight(99);
call javadb.Test_weight(100);

-- Case When 建議要加Else (類似JAVA的Switch....case)---------------------
Delimiter $$
use javadb$$
drop procedure if exists Case_weight$$
create procedure Case_weight(IN Weight int)
begin
	declare Standard int default 100;
    Case
    When Weight > Standard then
		Select 'You are heavy!!!';
    When Weight < Standard then
		Select 'You are Light!!!';
	Else
		Select 'Standard';
    End case;
end $$
Delimiter ;

call javadb.Case_weight(101);
call javadb.Case_weight(99);
call javadb.Case_weight(100);
-- 可以使用Procedure做的事--------------
-- Password 1234 ->(反)演算法 ->演算後儲存 6878;

-- MySQL中有以下三種迴圈 可搭配Label標籤
-- While
Delimiter $$
use cmdev$$
drop procedure if exists While_test$$
create procedure While_test(IN X int)
begin
	Declare C int default 1;
    Declare Result int default 0;
    While C <= X Do
		set Result = Result + C;
        set C = C + 1;
	End While;
    Select Result;
end $$
Delimiter ;

call While_test(100);

-- Repeat
Delimiter $$
use cmdev$$
drop procedure if exists Repeat_test$$
create procedure Repeat_test(IN X int)
begin
	Declare Counter int default 1;
    Declare Summary int default 0;
	Repeat
		set Summary = Summary + Counter;
        set Counter = Counter + 1;
		until Counter > X
    End Repeat;
    Select Summary;
end $$
Delimiter ;

call Repeat_test(100);

-- Loop




