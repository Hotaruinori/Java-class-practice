-- 關聯式資料庫 
create table if not exists Customer_Basic_sheet(
	CUSTOMER_ID char(5),
	CUSTOMER_NAME varchar(20) NOT NULL,
    CUSTOMER_ADDRESS varchar(50) NOT NULL,
    CUSTOMER_TEL char(10) NOT NULL,
    CUSTOMER_PERSON_IN_CHARGE varchar(8),
    CUSTOMER_PHOTO BLOB,
    Primary key(CUSTOMER_ID)
);

create table if not exists Product_Basic_sheet(
	PRODUCT_ID char(5) NOT NULL,
    PRODUCT_NAME varchar(30),
    PRODUCT_PRICE INT(7),
	PRODUCT_PHOTO BLOB,
    PRODUCT_TYPE_ID char(8),
    Primary key(PRODUCT_ID)
);

create table if not exists Product_Type_sheet(
	PRODUCT_TYPE_ID char(8) NOT NULL,
    PRODUCT_TYPE_NAME varchar(20) NOT NULL,
    Primary key(PRODUCT_TYPE_ID)
);

create table if not exists Employee_Basic_sheet(
	EMPLOYEE_ID char(8) NOT NULL,
    EMPLOYEE_NAME varchar(10) NOT NULL,
    EMPLOYEE_ADDRESS varchar(50),
    EMPLOYEE_TEL char(10),
    EMPLOYEE_PHOTO BLOB,
    EMPLOYEE_DEPT char(5),
    Primary key(EMPLOYEE_ID)
);

create table if not exists Derpartment_Basic_sheet(
	DEPARTMENT_ID char(5) NOT NULL,
    DEPARTMENT_NAME char(10) NOT NULL,
    DEPARTMEN_HEAD_ID char(8),
    Primary key(DEPARTMENT_ID)
);


SELECT 
    TABLE_NAME AS '表名',
    COLUMN_NAME AS '欄位名',
    COLUMN_TYPE AS '資料類型',
    CASE 
        WHEN COLUMN_KEY = 'PRI' THEN '是'
        ELSE NULL
    END AS '是否為主鍵',
    IS_NULLABLE AS '可為NULL',
    COLUMN_DEFAULT AS '預設值',
    COLUMN_COMMENT AS '備註'
FROM 
    INFORMATION_SCHEMA.COLUMNS
WHERE 
    TABLE_SCHEMA = 'company'
ORDER BY 
    TABLE_NAME, 
    ORDINAL_POSITION;