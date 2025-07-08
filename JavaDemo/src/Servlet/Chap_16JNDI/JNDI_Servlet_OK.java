
import java.io.*;
import java.sql.*;

import javax.naming.*;
import javax.sql.DataSource;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/doJNDI")
public class JNDI_Servlet_OK extends HttpServlet {
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();	       
		String sql= "select num,name,sex,birth,address from employee order by num";	       
	  
		try{ 
    	  
			InitialContext initContext = new InitialContext();
			Context context = (Context)initContext.lookup("java:comp/env");
			DataSource ds = (DataSource)context.lookup("jdbc/mariadb");
			// 建立Connection物件和Statement物件
			Connection dbcon = ds.getConnection(); 
			Statement stmt = dbcon.createStatement(); 
			// 執行SQL子句
			ResultSet rs = stmt.executeQuery(sql);
			
			out.print("<h1 style=\"color:blue\"><b>employee</b></h1>");	  
			out.print("<table border='2' width='600'>");
			out.print("<caption style=font-size:24px;font-weight:bold" + " >員工基本資料</caption>");	    
			while( rs.next() ) { 
				
				out.print("<tr>");
				out.print("<td>"+rs.getString("num")+"</td>");
				out.print("<td>"+rs.getString("name")+"</td>");
				out.print("<td>"+(rs.getString("sex").equals("F") ? "女":"男")+"</td>");
				out.print("<td>"+rs.getDate("birth")+"</td>");
				out.print("<td>"+rs.getString("address")+"</td>");
				out.print("</tr>");
			}
			out.print("</table>");
	  
			stmt.close();   // 關閉Statement物件
			dbcon.close();  // 關閉連結
		}
		catch(Exception e) {out.print(e);}

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}