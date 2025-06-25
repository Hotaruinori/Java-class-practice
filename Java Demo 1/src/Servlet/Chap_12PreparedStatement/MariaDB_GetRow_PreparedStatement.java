package learn_Servlet.Chap_12PreparedStatement;
import java.sql.*;

public class MariaDB_GetRow_PreparedStatement{
    public static void main(String[] args){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql;
        
        //參數      
        String sDriver = "org.mariadb.jdbc.Driver";
        String user     = "root";
        String password = "1234";
        String url      = "jdbc:mariadb://localhost:3306/mydb";
        try {  
            
            Class.forName(sDriver);
        }
        catch(Exception e){
        
            System.out.println("無法載入驅動程式");
            return;
        }
        
        sql="select * from employee where num >= ? and age >= ? order by num";
        try {  
       
            conn = DriverManager.getConnection(url,user,password);
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,"000010");
            stmt.setInt(2,35);
 
        }
        catch(SQLException e){
       
            System.out.println("與資料來源連結錯誤: ");
            System.out.println(e.getMessage());
            if (conn != null){
                try { conn.close(); }
                catch( SQLException e2 ) {}
            }
            return;
        }
       
        try {
        
            rs = stmt.executeQuery();
            
            System.out.println("NUM       NAME          SEX     BIRTH           AGE     ADDRESS");
            System.out.println("================================================"+
                              "=================================");                    
            while (rs.next())
            {
                System.out.printf("%-10s",rs.getString("NUM"));
                //System.out.print("\t");
                System.out.printf("%-8s",rs.getString("NAME"));
                System.out.print("\t");
                System.out.print(rs.getString("SEX"));
                System.out.print("\t");
                System.out.print(rs.getDate("BIRTH"));             
                System.out.print("\t");
                System.out.print(rs.getByte("AGE"));
                System.out.print("\t");
                System.out.println(rs.getString("ADDRESS"));
            }
        }
        catch(SQLException e){}
       
        try {
        
            stmt.close(); 
            conn.close(); 
        }
        catch( SQLException e ) {}
    }
    
}