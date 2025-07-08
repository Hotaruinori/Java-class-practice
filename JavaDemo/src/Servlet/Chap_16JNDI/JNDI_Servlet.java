
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
public class JNDI_Servlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html;charset=utf-8");
	  PrintWriter out=response.getWriter();	       
      String sql= "select num,name,sex,birth,age,address from employee";	       
	  
      try{   
    	//1. 建立Initail Context 物件
        InitialContext initContext = new InitialContext();
        //2. 建立Context 物件
        Context context = (Context)initContext.lookup("java:comp/env");
        //3. 建立DataSource 物件
        DataSource ds = (DataSource)context.lookup("jdbc/mariadb");
        //4. 取得Connection 物件
		Connection connection = ds.getConnection();
		//5. 建立Statement 物件
		Statement statement = connection.createStatement();
		//6. 執行SQL子句
		ResultSet rs = statement.executeQuery(sql);
		
	      // 打印列名
//	      ResultSetMetaData rsmd = rs.getMetaData();
//	      int columnCount = rsmd.getColumnCount();
//	  
//	      for (int i = 1; i < columnCount; i++) {
//	          System.out.print(rsmd.getColumnName(i) + "\t");
//	      }
//	      System.out.print("\t");
//	      System.out.print(rsmd.getColumnName(5) + "\t");
//	      System.out.println("\r");
//	      System.out.println("======================================================");
//	      while(rs.next()){
//	          System.out.print(rs.getString(1));
//	          System.out.print("\t");
//	          System.out.print(rs.getString(2));
//	          System.out.print("\t");
//	          System.out.print(rs.getString(3));
//	          System.out.print("\t");
//	          System.out.print(rs.getDate(4));             
//	          System.out.print("\t"); 
//	          System.out.println(rs.getString(5));
//	      }
	      
	     
	      // 建立HTML表格開頭
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
          
	      connection.close();
	          
      }
      catch(Exception e){
          System.out.println("與資料來源連結錯誤");
          System.out.println(e.getMessage());
          return;
      }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}