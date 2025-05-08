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
-- 避免出錯讓後續程式無法繼續制執行
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
update cmdev.emp set salary = 'Hello' where deptno = 7369 ;
update cmdev.emp set salary = salary + 5 where deptno = 10 order by salary ASC limit 3 ;


