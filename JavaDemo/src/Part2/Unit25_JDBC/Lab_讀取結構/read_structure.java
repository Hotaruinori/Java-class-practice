

import java.sql.*;
import java.sql.ResultSet;

public class read_structure {
    public static void main(String[] args) {

        //驅動程式參數
        // String sDriver = "org.mariadb.jdbc.Driver";
        // String user     = "root";
        // String password = "1234";
        // String url      = "jdbc:mariadb://localhost:3306/mydb";
        String sDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
        String sCon = "jdbc:odbc:Sale";
        String sql      = "select * from Report";

        try {
            // 載入 JDBC driver
            Class.forName(sDriver);

            // 建立connection
            Connection conn = DriverManager.getConnection(sCon);
            
            //建立Statement物件
            Statement stmt = conn.createStatement();
            
            // 1. 檢查資料表是否存在
            stmt.execute(sql);
            // 2. 建立ResultSet 物件
            ResultSet R = stmt.getResultSet();
            // 3. 建立ResultMetaData物件
            ResultSetMetaData rdata = R.getMetaData();
            // 4. 解讀資料表結構
            int count = rdata.getColumnCount();
            for (int i=1; i<=count; i++) {
            System.out.print(rdata.getColumnLabel(i) + "\t");
            System.out.print(rdata.getColumnTypeName(i)+ "------\t");
            System.out.print(rdata.getColumnDisplaySize(i)+ "\r");
            }
            //5. 列印完整表格內容
            System.out.print(rdata.getColumnLabel(1) + "\t\t");
            for (int i=2; i<=count; i++) {
            	System.out.print(rdata.getColumnLabel(i) + "\t");
            }
            System.out.println();
            System.out.print("=======================================");
            System.out.println();
            ResultSet rs = stmt.executeQuery( sql );
            while(rs.next())
            {
                System.out.print(rs.getDate(1));
                System.out.print("\t");
                System.out.print(rs.getString(2));
                System.out.print("\t");
                System.out.print(rs.getString(3));
                System.out.print("\t");
                System.out.print(rs.getString(4));             
                System.out.print("\t");
                System.out.print(rs.getString(5));
                System.out.print("\t");
                System.out.print(rs.getInt(6));
                System.out.print("\t");
                System.out.print(rs.getInt(7));
                System.out.print("\t");
                System.out.println(rs.getInt(8));
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
        


    }


}
