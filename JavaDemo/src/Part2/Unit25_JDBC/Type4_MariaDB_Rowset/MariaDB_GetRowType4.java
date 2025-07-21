
import java.sql.*;

public class MariaDB_GetRowType4
{
    public static void main(String[] args)
    {
    	//��Ʈw����
    	Connection conn = null;
    	Statement stmt = null;
    	ResultSet rs = null;
    	//�Ѽ�
    	String sDriver = "org.mariadb.jdbc.Driver";      
    	String url="jdbc:mariadb://localhost/mydb";
    	String acc="root";
    	String pwd="1234";
    	String sql = "SELECT * FROM employee";
    	//�ܼ�
    	String gender="";
       
	       try   //���JJDBC driver 
	       {     
	           Class.forName(sDriver);
	       }
	       catch(Exception e)
	       {
	           System.out.println("�L�k���J�X�ʵ{��");
	           return;
	       }
	        
	       try   
	       {     
	           Class.forName(sDriver);
	       }
	       catch(Exception e)
	       {
	           System.out.println("�L�k���J�X�ʵ{��");
	           return; //System.exit(0)
	       }
	       
	       try   
	       {
	           conn = DriverManager.getConnection(url,acc,pwd);
	           stmt = conn.createStatement();
	       }
	       catch(SQLException e) {
	       
	           System.out.println(e.getMessage());
	           return;
	       }
	       
	       try { 
	               
	           rs = stmt.executeQuery(sql);
	           System.out.println("NUM"+'\t'+"NAME"+'\t'+"SEX"+'\t'+"BIRTH"+'\t'+'\t'
	                               +"AGE"+'\t'+"ADDRESS");
	           for(int n=1; n<=68; n++) System.out.print("=");
	           System.out.println();
	           
	           while (rs.next())
	           {
	        	   System.out.printf("%-8s",rs.getString("NUM"));
	        	   System.out.printf("%-5s",rs.getString("NAME"));
	        	   System.out.print("\t");
	        	   gender=rs.getString("SEX").equals("M") ? "�k":"�k";
	        	   System.out.print(gender);
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
	       catch( SQLException e ){}
	    }
	}
