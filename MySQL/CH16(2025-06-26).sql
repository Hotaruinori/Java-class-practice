-- 異動
-- Insert trigger/ Update trigger/ Delete trigger

-- 建立 trigger
Delimiter $$
Use cmdev$$
Drop Trigger if exists Emp_Update_Before$$
Create Trigger cmdev.Emp_Update_Before Before Update On cmdev.emp For Each Row
begin
	Insert into  EMPLog (Message) Values ('Before Update Happend');
end$$
Delimiter ;
-- 下面執行成功後就會觸發Trigger，可以去檢視
SELECT * FROM cmdev.emp;
update cmdev.emp set comm = 1 where empno = 7369;
update cmdev.emp set Salary = Salary + 1 where deptno = 10;
-- 沒有這個人因此沒有異動，就不會觸發Trigger
update cmdev.emp set comm = 2 where empno = 1999;

-- 同一資料庫不可有相同名稱的Trigger
-- Temporary表格與View不可建立Trigger
-- 不可以使用Select 或 Call敘述
-- 不可以使用與交易(transcations)相關敘述

-- New Old關鍵字--------------------------------------
Delimiter $$
Use cmdev$$
Drop Trigger if exists cmdev.Emp_Before_Update$$
Create Trigger cmdev.Emp_Before_Update Before Update On cmdev.emp For Each Row
begin
	Declare EMP_Message varchar(64) default 'Updated!!';
    Set EMP_Message = Concat(EMP_Message, ' 修改前=', Old.Ename, Old.deptno, ' 修改後=', New.Deptno, New.Ename);
    Insert into EMPLog(Message) Values (EMP_Message);
end$$
Delimiter ;
-- 執行後會新增2條訊息在EMPlog，包含上面的Trigger與這次新增的Trigger
Update Cmdev.emp set comm = 99 where Empno = 7369;
Update Cmdev.Emp Set deptno = 20, Ename = 'MySQL' where empno = 7369; 

-- Insert Trigger，只有New沒有Old-----------------------------------
Delimiter $$
Use cmdev$$
Drop Trigger if exists cmdev.Emp_Before_Insert$$
Create Trigger cmdev.Emp_Before_Insert Before Insert On cmdev.emp For Each Row
begin
	Declare V_Name varchar(64) default 'Hello!!';
    Set V_Name = New.Ename;
    Insert into EMPLog(Message) Values (V_Name);
end$$
Delimiter ;
Insert into cmdev.emp (Empno, Ename) Values(9999, 'AAAA');

-- 使用函式變更---------------------
Delimiter $$
Use cmdev$$
Drop Trigger if exists cmdev.Emp_Insert$$
Create Trigger cmdev.Emp_Insert Before Insert On cmdev.emp For Each Row
begin
    Set New.Ename = UPPER(New.Ename);
    Set New.Job = UPPER(New.Job);
end$$
Delimiter ;

Insert into cmdev.emp (EMPNO, Ename, Job) Values (8888, 'bill', 'salesman');

-- 確認目前有的Triggers/ 目標Triggers的狀態
Select ACTION_STATEMENT from Information_Schema.Triggers where Trigger_Schema = 'cmdev';
Show create Trigger Cmdev.emp_Before_Insert;


-- 練習3
Delimiter $$
Drop Trigger if exists pet_after_insert$$
create trigger pet_after_insert After Insert on mylab.pet For Each Row
Begin
	Declare V_Message varchar(64) Default '新增寵物';
    Set V_Message = Concat(V_Message, New.Name);
    Insert into Petlog (Message) Values (V_Message);
End$$
Delimiter ;

Insert into mylab.Pet (Name, Owner) Values ('Doggy', 'Bill');
