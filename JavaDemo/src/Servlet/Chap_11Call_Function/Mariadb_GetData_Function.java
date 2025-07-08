package learn_Servlet.Chap_11Call_Function;
import java.sql.*;

public class Mariadb_GetData_Function{
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
       try{     
           Class.forName(sDriver);
       }
       catch(Exception e){
           System.out.println("無法載入驅動程式");
           return;
       }
               
       try{
           conn = DriverManager.getConnection(url, acc, pwd);
           stmt = conn.prepareCall("{? = call season(?) }");
       }
       catch(SQLException e){
           System.out.println(e.getMessage());
           return;
       }
       
       try{ 
           stmt.registerOutParameter(1, Types.CHAR);
           stmt.setInt(2,2);   
           stmt.execute();
           
           String returnValue=stmt.getString(1);
           System.out.println(returnValue);                  
       }
       catch(SQLException e){}
       
       try{

            stmt.close(); 
            conn.close(); 
       }
       catch( SQLException e ){}
    }
}