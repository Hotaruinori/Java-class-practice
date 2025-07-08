package Part2.Unit25_JDBC.Type4_MariaDB_Rowset;
import java.sql.*;
import javax.sql.rowset.*;

public class MairaDB_RowSet
{
    public static void main(String[] args) throws SQLException 
    {
        //資料庫物件
        // JdbcRowSet rowset = null;
		CachedRowSet rowset = null;
		
        //驅動程式參數
        String sDriver = "org.mariadb.jdbc.Driver";
       
        String user     = "root";
        String password = "1234";
        String url      = "jdbc:mariadb://127.0.0.1:3306/mydb";
        String sql      = "select * from employee";
       
        try{   //載入 JDBC driver 
            
            Class.forName(sDriver);
        }
        catch(Exception e){
       
            System.out.println("無法載入驅動程式");
            return;
        }
       
       
        // rowset = RowSetProvider.newFactory().createJdbcRowSet();
        rowset = RowSetProvider.newFactory().createCachedRowSet();
       
        rowset.setUrl(url);
        rowset.setUsername(user);
        rowset.setPassword(password);
        rowset.setCommand(sql);
        rowset.execute();
       
        System.out.println("NUM"+'\t'+"NAME"+"\t\t"+"SEX"+'\t'+"BIRTH"+'\t'+'\t'
                               +"AGE"+'\t'+"ADDRESS");
        System.out.println("================================================"+
                              "==================================");                    
        while(rowset.next())
        {
            System.out.printf("%-8s",rowset.getString("NUM"));
            System.out.printf("%-10s",rowset.getString("NAME"));
            System.out.print("\t");
            System.out.print(rowset.getString("SEX"));
            System.out.print("\t");
            System.out.print(rowset.getDate("BIRTH"));             
            System.out.print("\t");
            System.out.print(rowset.getByte("AGE"));
            System.out.print("\t");
            System.out.println(rowset.getString("ADDRESS"));
        }
    }
}