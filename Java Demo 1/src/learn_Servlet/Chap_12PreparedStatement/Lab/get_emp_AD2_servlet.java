import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmpList_byAge")
public class get_emp_AD2_servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html;charset=utf-8");
    	PrintWriter out = response.getWriter();
    	int num1 = Integer.parseInt(request.getParameter("age1"));
    	int num2 = Integer.parseInt(request.getParameter("age2"));
    	
    	
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
        
        sql="select * from employee where age >= ? and age <= ? order by num";
        try {  
       
            conn = DriverManager.getConnection(url,user,password);
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1,num1);
            stmt.setInt(2,num2);
 
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
            out.println("<html><head><title>員工資料</title></head><body>");
            out.println("<h2>員工資料列表</h2>");
            out.println("<table border='1'>");
            out.println("<tr><th>編號</th><th>姓名</th><th>性別</th><th>生日</th><th>年齡</th><th>地址</th></tr>");
                  
            while (rs.next())
            {	
            	out.println("<tr>");
                out.printf("<td>" + "%-10s",rs.getString("NUM")+ "</td>");

                out.printf("<td>" + "%-8s",rs.getString("NAME")+ "</td>");

                out.print("<td>" + rs.getString("SEX")+ "</td>");

                out.print("<td>" + rs.getDate("BIRTH")+ "</td>");             

                out.print("<td>" + rs.getByte("AGE")+ "</td>");

                out.println("<td>" + rs.getString("ADDRESS")+ "</td>");
                out.println("<tr>");
            }
        }
        catch(SQLException e){}
       
        try {
        
            stmt.close(); 
            conn.close(); 
        }
        catch( SQLException e ) {}
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doGet(request, response);
	}
}