package learn_Servlet.Chap_10Call_Procedure;
import java.sql.*;

public class Mariadb_GetRow_Procedure
{
    public static void main(String[] args)
    {
       Connection conn = null;
       CallableStatement stmt = null;
       ResultSet rs = null;
       //參數
       String sDriver = "org.mariadb.jdbc.Driver";
      
       String url="jdbc:mariadb://localhost:3306/mydb";
       String acc="root";
       String pwd="1234";
       
       try   //載入JDBC driver 
       {     
           Class.forName(sDriver);
       }
       catch(Exception e)
       {
           System.out.println("無法載入驅動程式");
           return;
       }
               
       try   
       {
           conn = DriverManager.getConnection(url, acc, pwd);
           stmt = conn.prepareCall("{ call getemployee() }");
       }
       catch(SQLException e){
       
           System.out.println(e.getMessage());
           return;
       }
       
       try{ 
               
           rs = stmt.executeQuery();
           System.out.println("NUM"+'\t'+"NAME"+"\t\t"+"ADDRESS");
                              
           System.out.println("================================================");
		   while(rs.next())
           {
              System.out.printf("%-8s",rs.getString("NUM"));
              System.out.printf("%-10s",rs.getString("NAME"));
              System.out.print("\t");
              System.out.println(rs.getString("ADDRESS"));
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