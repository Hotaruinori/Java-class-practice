-- Prepared Statements
-- 指派變數內容，電腦不關機都可以使用
set @myvalue = 1000;
select @myvalue;
-- 一邊指派一邊顯示
select @myvalue := 3000;
select @yourvalue := 3000;
-- 沒有指派會是空值
select @Y = 100;   -- 實際上是沒有寫進去的
select @Y ;
-- 一次多個變數
set @Y = 100, @X = 200;
select @Y := 100, @X := 200;  -- 同上並顯示

-- 使用變數
set @my_con1 = 'ASIA';
set @my_con2 = 'EUROPE';
select continent, name, gnp, population from world.country where continent in(@my_con1, @my_con2);
-- 使用變數2
select @max_gnp := MAX(GNP), @max_population := MAX(Population) from world.country;
select name, gnp, population from world.country where gnp = @max_gnp or population = @max_population;

-- Prepared Statement製作 與使用
prepare my_prep from 'select code, name, gnp from world.country where code = ?' ;                  -- 內部不用分號
set @my_code = 'TWN';
execute my_prep using @my_code;
-- 兩個變數
prepare my_prep_1 from 'select code, name, gnp from world.country where code = ? or code = ?';
set @my_code1 = 'TWN';
set @my_code2 = 'JPN';
execute my_prep_1 using @my_code1, @my_code2;

-- 刪除變數，兩個一樣功能，也可以關掉連線達到一樣效果
drop prepare my_prep;
deallocate prepare my_prep;

-- 多個變數
prepare insert_dept_data from 'insert into cmdev.dept values (?,?,?)';
set @V1 = 999, @V2 ='MIS' , @V3 = 'TAIWAN';
execute insert_dept_data using @V1, @V2, @V3;
-- 使用@not_exists 這是保留關鍵字
set @V1 = 1999, @V2 ='MIS' , @V3 = 'TAIWAN';
execute insert_dept_data using @V1, @V2, @not_exist;

-- Prepared Statement不可以指派資料庫






