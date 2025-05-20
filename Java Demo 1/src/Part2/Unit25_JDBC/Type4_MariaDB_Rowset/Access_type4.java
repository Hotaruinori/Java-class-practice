package Part2.Unit25_JDBC.Type4_MariaDB_Rowset;
import java.sql.*;

public class Access_type4 {
    public static void main(String[] args) {
    	
    	String sql = "SELECT \r\n"
    			+ "    num, \r\n"
    			+ "    name, \r\n"
    			+ "    CASE sex \r\n"
    			+ "        WHEN 'M' THEN '男'\r\n"
    			+ "        WHEN 'F' THEN '女'\r\n"
    			+ "    END AS sex,\r\n"
    			+ "    birth,\r\n"
    			+ "    address\r\n"
    			+ "FROM employee;";
        try {
            // 加載JDBC-ODBC驅動（JDK8後需先事先下載JDBC Driver jar檔案，可放置自訂位置後在專案中指定）
            // forname的參數 MariaDB:org.mariadb.jdbc.Driver;
            // forname的參數 MySQL:com.mysql.jdbc.Driver;
            // forname的參數 MySQL:com.mysql.cj.jdbc.Driver;
            // forname的參數 Access:com.microsoft.jdbc.sqlserver.SQLServerDriver;
            // forname的參數 SQLite:org.sqlite.JDBC;
            Class.forName("org.mariadb.jdbc.Driver");
             
           
            // 建立Connection物件，直接連接本地ip的資料庫
            //  url>> MariaDB:jdbc:mariadb://ip/資料庫 ； MySQL：jdbc:mysql://ip/資料庫
            // DriverManager.getConnection(url, username, password);
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/mydb", "root", "1234");
            
            //建立Statement物件 、ResultSet物件
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery( sql );
            
            // 打印列名
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
        
            for (int i = 1; i < columnCount; i++) {
                System.out.print(rsmd.getColumnName(i) + "\t");
            }
            System.out.print("\t");
            System.out.print(rsmd.getColumnName(5) + "\t");
            System.out.println("\r");
            System.out.println("======================================================");
            while(rs.next())
            {
                System.out.print(rs.getString(1));
                System.out.print("\t");
                System.out.print(rs.getString(2));
                System.out.print("\t");
                System.out.print(rs.getString(3));
                System.out.print("\t");
                System.out.print(rs.getDate(4));             
                System.out.print("\t"); 
                System.out.println(rs.getString(5));
            }

            
            // 關閉連接
            conn.close();
        } catch (ClassNotFoundException e) {
            System.err.println("找不到JDBC-ODBC驅動: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL錯誤: " + e.getMessage());
        }
    }
}