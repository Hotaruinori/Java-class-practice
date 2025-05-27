-- 關聯式資料庫 
create table if not exists Student(
	STU_NO char(3),
	STU_NAME varchar(10) NOT NULL,
    DEPT_NO char(3),
    Primary key(STU_NO)
);

create table if not exists Dept(
	DEPT_NO char(3),
	DEPT_NAME varchar(10),
    EMPLOYEE_NO char(3),
	Primary key(DEPT_NO)
);

create table if not exists Employee(
	EMPLOYEE_NO char(3),
    ID char(10),
    EMPLOYEE_NAME varchar(10) NOT NULL,
	EMPLOYEE_TEL varchar(10) default NULL,
    Primary Key(EMPLOYEE_NO)   -- 也可以加上,ID 變成複合式主鍵
);