-- 取得表格資訊 
desc cmdev.dept;

-- DML(Data Manipulation language)資料操作
-- INSERT 寫入(into 可以省略) 
use cmdev; 
insert into dept (deptno, dname, location) values (999, 'MIS', 'TaoYuan'); 
insert into dept  values (888, 'MIS', 'TaoYuan'); 
insert dept (dname, location, deptno) values ('AAAA', 'Taipei', 1000);

insert dept values (1001, 'TAWA', null);
insert dept values (1002, 'ABCD', default);
insert dept (deptno, dname) values (1003, 'HHHH');
insert dept (deptno, dname) values (1004, 'BBBB');
insert dept (deptno, dname, location) values (1005, 'CCCC', null);
insert dept (deptno, dname, location) values (1006, 'DDDD', default);
-- 一次寫入多筆紀錄
insert dept (deptno, dname, location) values (1007, 'EEEE', default),(1008, 'FFFF', null),(1009, 'GGGG', 'TaiChung') ;
insert dept (deptno, dname, location) values (1010, 'Tainan', '') ;
-- 另外一種語法 
insert into dept set deptno = 1011, dname = 'Hsinchu', location = 'Hsinchu';

-- 重複主鍵會出錯，可以改成置換replace來修改除了主鍵之外的欄位 ，也可以直接作為新增
insert into cmdev.dept values (1011, 'TTTT', 'TTTT'); 
replace into cmdev.dept set deptno = 1011, dname = 'R and D', location = 'Hsinchu';
replace into cmdev.dept set deptno = 1012, dname = 'R and D', location = 'Hsinchu';
-- 避免出錯讓後續程式無法繼續制執行，ignored可以讓已有主鍵的指令略過這筆資料
insert ignore into cmdev.dept values (1005, 'CCCC', '') ;

-- update 方式(記update set where)，當主鍵遇到衝突時，指定欄位增加
insert into travel values (7900,'BOSTON', 1) on duplicate key update counter = counter +1 ;

select * from cmdev.travel where empno = 7900 and location = 'BOSTON';
update travel set counter = counter + 1 where empno = 7900 and location = 'BOSTON';
-- 修改也可以使用ignore 
update ignore cmdev.dept set dname = 'UPDATE', location = 'Koashum' where deptno = 1011;
-- 主鍵沒有並不會有錯誤訊息 
update ignore cmdev.dept set dname = 'UPDATE', location = 'Koashum' where deptno = 5555;

-- 如果修改值與欄位格式不同會直接變0? 
update cmdev.emp set salary = salary + 100 where deptno = 99 order by salary;
update cmdev.emp set salary = 900 where empno = 7369 ;
update cmdev.emp set salary = salary + 5 where deptno = 10 order by salary ASC limit 3 ;

-- delete
delete from cmdev.emp where ?;
delete from cmdev.dept where location ='Hsinchu' ;

#26 使用dept資料表
-- 1. 新增deptno=33, dname='TW'的資料語法及是否可行?
-- 2. 新增deptno=30, dname='TW'的資料語法及是否可行? 為什麼?
-- 1. 如果是用INSERT INTO 的語法可以，本來沒資料
-- 2. 如果是用INSERT INTO 的語法不可以，本來有資料，重複primary key要使用replace into

#27 使用emp資料表
-- 1. 請練習新增3筆紀錄至emp資料表中。
insert into cmdev.emp (empno, ename, job, manager, hiredate, salary, comm, deptno) values (8000, 'Trump', 'PRESIDENT', 8000, '2025-05-15', 0, null, 99); 
insert into cmdev.emp values (8001, 'Asmongold', 'Streamer', 8001, '2025-05-15', 0, 20000, 80);
insert into cmdev.emp (empno, ename, job) values (8002, 'Sony', 'LOGO');

#28 使用travel資料表
-- 1. 假定員工7521分別出差3次，於月初，月中及月底至BOSTON出差。
-- 2. 請分別寫出update set及insert into ...on duplicate key update記錄更改出差次數。
insert into cmdev.emp (empno) values (7521, 'BOSTON', 3) on duplicate key update counter = counter +3;
update ignore cmdev.emp set counter = counter +3 where empno = 7521;


#29 使用dept資料表
-- 1. 如何插入資料以避免違反主鍵不能重複規則產生錯誤的方式。
-- 2. 例如要插入deptno=50的紀錄。
replace into cmdev.dept set deptno = 50, dname = 'R and D', location = 'Hsinchu';


#30 請修改dept資料表
-- 修改 deptno=30資料中 location 內容更改為'台北'
update ignore cmdev.dept set location = '台北' where deptno = 30;


-- 選擇題　C, D, A, A, D, B  
-- 練習1 直接執行Lab05.sql
-- 練習2 
DESC cmdev.myemp;
-- 練習3
insert into cmdev.myemp (id, firstname, lastname, salary, birthdate) 
values (1, 'Betty', 'Johnson', 1200, '1968-1-6'),(2, 'Sam', 'Johnson', 900, '1972-9-12'),
(3, 'Rose', 'Johnson', 1100, '1971-11-6');

-- 交易紀錄功能(INNODB Engine)，如沒有完成全部指令會啟動 交易紀錄功能 回復之前狀態
-- log 交易紀錄 Microsoft SQL 2024
-- 從begin 開始啟動交易紀錄功能，除非下達commit指令，可以使用rollback回復從執行begin後的變動
-- truncate 指令刪除是無法用rollback回復的 ，用於刪除一個表格中的所有紀錄
start transaction;
delete from cmdev.myemp
rollback;
begin;
delete from cmdev.dept where location = 'Hsinchu' order by deptno limit 1;
commit;
begin;
update cmdev.dept set dname = 'TAOYUAN';
rollback;
begin;
truncate table cmdev.myemp;
rollback;
