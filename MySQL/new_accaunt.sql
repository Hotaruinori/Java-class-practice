-- 建立新使用者並設定密碼
CREATE USER 'Hotaruinori'@'localhost' IDENTIFIED BY '12345678';

-- 授予特定資料庫的所有權限
GRANT ALL PRIVILEGES ON pesticide_db.* TO 'Hotaruinori'@'localhost';

-- 刷新權限
FLUSH PRIVILEGES;