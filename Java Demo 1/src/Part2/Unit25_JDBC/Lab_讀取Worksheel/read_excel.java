package Part2.Unit25_JDBC.Lab_讀取Worksheel;
import java.sql.*;

public class read_excel {
    public static void main(String[] args) {
        try {
            // 1. 加載JDBC-ODBC驅動（JDK7中仍然可用）
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            
            // 2. 使用配置的ODBC數據源名稱
            String dsn = "excel"; // 與您配置的ODBC數據源名稱一致
            String url = "jdbc:odbc:" + dsn;
            
            // 3. 建立連接
            Connection conn = DriverManager.getConnection(url);
            
            // 4. 獲取所有工作表名稱
            DatabaseMetaData dbMeta = conn.getMetaData();
            ResultSet rsTables = dbMeta.getTables(null, null, "%", new String[]{"TABLE","SYSTEM TABLE"});
            
            System.out.println("可用的工作表:");
            while (rsTables.next()) {
                String tableName = rsTables.getString("TABLE_NAME");
                System.out.println(tableName); // 格式為 "Sheet1$"
            }
            
            // 5. 查詢特定工作表（使用上面顯示的正確名稱）
            String sheetName = "data$"; // 替換為您實際的工作表名稱
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM [" + sheetName + "]");
            
            // 6. 獲取並顯示數據
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            
            // 打印列名
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rsmd.getColumnName(i) + "\t");
            }
            System.out.println();
            
            // 打印數據
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
            
            // 7. 關閉連接
            conn.close();
        } catch (ClassNotFoundException e) {
            System.err.println("找不到JDBC-ODBC驅動: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL錯誤: " + e.getMessage());
        }
    }
}