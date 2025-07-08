package Part2.Unit25_JDBC.Type1_Access;
import java.sql.*;

public class Access_GetRow
{
    public static void main(String[] args)
    {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String sDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
        String sCon = "jdbc:odbc:nana";
        String sql = "SELECT num,name,birth,addr FROM employee";
        
        try   
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
            conn = DriverManager.getConnection(sCon);
            stmt = conn.createStatement();
        }
        catch(SQLException e)
        {
            System.out.println("與資料來源連結錯誤: " + sCon);
            System.out.println(e.getMessage());
            return;
        }
       
        try 
        { 
            rs = stmt.executeQuery( sql );
            while(rs.next())
            {
                System.out.print(rs.getString(1));
                System.out.print("\t");
                System.out.print(rs.getString(2));
                System.out.print("\t");
                System.out.print(rs.getDate(3));             
                System.out.print("\t");
                System.out.println(rs.getString(4));
            }
        }
        catch(SQLException e){}
        
        try 
        { 
            stmt.close(); 
            conn.close(); 
        }
        catch( SQLException e ) {}
    }
}
