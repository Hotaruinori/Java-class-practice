-- CHAPTER 6
-- 要添加IF NOT EXISTS 才不會造成預期外的錯誤導致後續程式碼無法執行
CREATE DATABASE IF NOT EXISTS TESTDB;
CREATE DATABASE IF NOT EXISTS DB1 CHARACTER SET = big5 COLLATE big5_bin;
-- 顯示可以支援的字元集/編號 
SHOW CHARACTER SET;
SHOW COLLATION;
SHOW COLLATION LIKE 'latin1%';
-- 顯示資料庫 與其儲存位置
SHOW DATABASES;
SHOW VARIABLES LIKE '%DATADIR%';
-- 顯示範例資料庫創建語法
SHOW CREATE DATABASE CMDEV;
-- 顯示資料庫與相關細節
SELECT * FROM information_schema.schemata;
-- 刪除資料庫 要非常小心  不會再確認
DROP DATABASE IF EXISTS DB2;
-- 修改資料庫 也只能改字元集/編號  
ALTER DATABASE DB4 CHARACTER SET big5 COLLATE big5_chinese_ci;
ALTER DATABASE DB4 CHARACTER SET utf8mb4;
-- 使用系統資料庫取得所有資料庫的相關詳細資訊 
SELECT * FROM information_schema.schemata;
-- SELECT * FROM information_schema.tables;

-- CHAPTER 6
-- 練習#1
CREATE DATABASE mylab;
-- 練習#2
SHOW SCHEMAS; 
-- 練習#3
SELECT * FROM information_schema.schemata;