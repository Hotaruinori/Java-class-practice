--  錯誤訊息 詳細可以去看英文說明書 https://dev.mysql.com/doc/mysql-errors/8.4/en/server-error-reference.html

-- Error number: 1007; Symbol: ER_DB_CREATE_EXISTS; SQLSTATE: HY000 
-- MYSQL的錯誤碼都有對應的SQLSTATE號碼
create database cmdev;  -- 既有 Error Code: 1007. Can't create database 'cmdev'; database exists


-- Handler
-- sqlstate '23000' 可以換成 1062  就好，但只能在MYSQL使用
-- 如果捕捉到錯誤，會改成執行內部的begin~end
Delimiter $$
use cmdev$$
Drop procedure if exists Insert_Dept_Data$$
Create procedure Insert_Dept_Data(In New_Deptno int, In New_Dname varchar(16), In New_Location varchar(16))
Begin
	Declare exit Handler for sqlstate '23000'
    Begin
		Select '主鍵重複，無法新增紀錄!!!';
    end;
    Declare exit Handler for 1048
    begin
		Select '部門名稱不可為空值，無法新增紀錄!!!';
    end;
	Insert into Cmdev.Dept Values (New_Deptno, New_Dname, New_Location);
    Select '新增資料成功';
End $$
Delimiter ;

-- 原本重複呼叫會產生錯誤 Error Code: 1062. Duplicate entry '9000' for key 'dept.PRIMARY'
Call Insert_Dept_Data(9000, '研發部', '台灣'); 
-- 原本在不能輸入空值的欄位給null會產生錯誤 Error Code: 1048. Column 'dname' cannot be null
Call Insert_Dept_Data(9001, null, '台灣');

-- 進階變化上面的，改成contine後錯誤執行完會繼續執行，並設置log儲存-------------------------
Delimiter $$
use cmdev$$
Drop procedure if exists Insert_Dept_Data$$
Create procedure Insert_Dept_Data(In New_Deptno int, In New_Dname varchar(16), In New_Location varchar(16))
Begin
	Declare Err_Message varchar(34) default '寫入成功!!!';
	Declare continue Handler for sqlstate '23000'
    Begin
        Set Err_Message = '主鍵重複，無法新增紀錄!!!';
    end;
    Declare continue Handler for 1048
    begin
		Set Err_Message = '部門名稱不可為空值，無法新增紀錄!!!';
    end;
	Insert into Cmdev.Dept Values (New_Deptno, New_Dname, New_Location);
    Insert into Err_Table(Message) Values (Err_Message);
    Select Err_Message;
End $$
Delimiter ;
-- 現在會在執行時同時儲存執行結果訊息到另一個資料表中
Call Insert_Dept_Data(9001, null, '台灣');

-- 加入Condition，其位置要在 Handler之前
Delimiter $$
use cmdev$$
Drop procedure if exists Insert_Dept_Data$$
Create procedure Insert_Dept_Data(In New_Deptno int, In New_Dname varchar(16), In New_Location varchar(16))
Begin
	Declare Err_Message varchar(34) default '寫入成功!!!';
    Declare Conditon_Null Condition for 1048;
    Declare Conditon_Duplicat Condition for 1062;
	Declare continue Handler for Conditon_Duplicat
    Begin
        Set Err_Message = '主鍵重複，無法新增紀錄!!!';
    end;
    Declare continue Handler for Conditon_Null
    begin
		Set Err_Message = '部門名稱不可為空值，無法新增紀錄!!!';
    end;
	Insert into Cmdev.Dept Values (New_Deptno, New_Dname, New_Location);
    Insert into Err_Table(Message) Values (Err_Message);
    Select Err_Message;
End $$
Delimiter ;

Call Insert_Dept_Data(9001, null, '台灣');
-- -------------------------------------------------------
-- Cursor 4步驟 ：
-- Declare
-- Open
-- Fetch
-- Close
Delimiter $$
Use Cmdev$$
Drop procedure if exists Test_Cursor$$
Create Procedure Test_Cursor()
Begin
	Declare V_Dname varchar(16);
    Declare Dept_Cursor Cursor for Select Dname From Cmdev.dept;
	Open Dept_Cursor;
    Begin
		Declare exit handler for 1329
        Begin
			Select 'End of File!!!';
        End;
        Loop
			Fetch Dept_Cursor Into V_Dname;
            Select V_Dname;
        End loop;
        Close Dept_Cursor;
    End;
End$$
Delimiter ;

Call Test_Cursor();
-- 寫一個Procedure ，將月薪>=某個金額的員工寫到TopEMP資料表中
-- 1146是表格不存在 Error number: 1146; Symbol: ER_NO_SUCH_TABLE; SQLSTATE: 42S02
-- 1329 是沒有資料  Error number: 1329; Symbol: ER_SP_FETCH_NO_DATA; SQLSTATE: 02000
Delimiter $$
Use Cmdev$$
Drop procedure if exists Top_Emp$$
Create Procedure Top_Emp(In P_Salary Float(10,2))
Begin
    Declare V_EmpNo int;
    Declare V_name varchar(16);
	Declare V_Salary Float(7,2);
    Declare Cur_Emp Cursor for Select EmpNo, EName, Salary From Cmdev.Emp where Salary >=P_Salary Order By Salary Desc;
    Begin
		Declare Exit Handler for 1146
        Begin
			Create Table Cmdev.TopEmp(
				EMPNO int primary key,
                Ename Varchar(16),
                Salary Float(7,2)
			);
        End;
        Delete From Cmdev.topemp;
    End;
    Open Cur_Emp;
    Begin 
		Declare Exit Handler for 1329 Begin End;
        Loop
			Fetch Cur_emp into V_EmpNo, V_name, V_Salary;
            Insert into Cmdev.Topemp Values(V_EmpNo, V_name, V_Salary);
        End Loop;
		Close Cur_Emp;
    End;
    Select * from Cmdev.Topemp;
End$$
Delimiter ;

Call Top_Emp(1500);

-- 練習1-------------------
Delimiter $$
use mylab$$
Drop procedure if exists Mylab.Myhandler$$
create procedure Mylab.Myhandler(P_Name varchar(30), P_Power varchar(30), P_Species varchar(30), P_Gender char(1), P_Birth date)
Begin
	Declare Exit Handler for 1048
    Begin
		Select '名稱不可為Null';
    End;
	Insert into Pet Values(Null, P_Name, P_Power, P_Species, P_Gender, P_Birth);
    Select * from Mylab.Pet Where ID = L_I_ID();
End $$
Delimiter ;

Call Mylab.Myhandler('貓貓', 'AAA', '外星人', 'M', '20140303');

