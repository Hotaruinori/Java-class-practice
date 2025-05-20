// MySQLConnector.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnector {
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:8888/pesticide_db";
    private static final String USER = "Hotaruinori";
    private static final String PASS = "12345678";

    public static ResultSet executeQuery(String query) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 連接資料庫
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // 執行查詢
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}