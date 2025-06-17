package learn_Servlet.Chap_10Call_Procedure;
import java.sql.*;

public class Mariadb_GetRow_Procedure2{
    public static void main(String[] args){
       Connection conn = null;
       CallableStatement stmt = null;
       ResultSet rs = null;
       //參數
       String sDriver = "org.mariadb.jdbc.Driver";
      
       String url="jdbc:mariadb://localhost:3306/mydb";
       String acc="root";
       String pwd="1234";
       //載入JDBC driver
       try {     
           Class.forName(sDriver);
       }
       catch(Exception e){
           System.out.println("無法載入驅動程式");
           return;
       }
               
       try   {
           conn = DriverManager.getConnection(url, acc, pwd);
           stmt = conn.prepareCall("{call sum_n(?)}");  // 修正這裡，使用參數化呼叫
           stmt.setInt(1, 10);
       }
       catch(SQLException e){
       
           System.out.println(e.getMessage());
           return;
       }
       
       try{ 
               
           rs = stmt.executeQuery();
		   while(rs.next()){
            System.out.println("計算結果: " + rs.getInt(1));
           }
       }
       catch(SQLException e){}
       
       try{
        
             stmt.close(); 
             conn.close(); 
       }
       catch( SQLException e ){}
    }
}