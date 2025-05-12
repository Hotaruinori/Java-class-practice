-- 建立新使用者並設定密碼
CREATE USER '新帳號'@'localhost' IDENTIFIED BY '強密碼';

-- 授予特定資料庫的所有權限
GRANT ALL PRIVILEGES ON 資料庫名稱.* TO '新帳號'@'localhost';

-- 刷新權限
FLUSH PRIVILEGES;