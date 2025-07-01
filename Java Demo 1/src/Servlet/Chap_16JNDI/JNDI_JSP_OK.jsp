<!-- ************* JNDI_JSP_OK.jsp ************* -->
<!-- ******* 顯示 employee 資料表內容 ******* -->
<%@ page contentType="text/html;charset=utf-8" %>
<%@ page import= "java.sql.*" %>
<%@ page import= "java.io.*" %>
<%@ page import= "javax.naming.*" %>
<%@ page import= "javax.sql.DataSource" %>

<html>
  <head>   
    <title>Read table</title>
    <style>
      tr:hover{
         background-color:yellow;
         color:red;
         font-weight:bold;
      }
    </style>
  </head>
  <body>    
    <h1 style="color:blue"><b>employee</b></h1>

	<%
	  // 建立SQL指令
	  String sql = "select num,name,sex,birth,address from employee order by num";
	
      try{ 
    	InitialContext initContext = new InitialContext();
		Context context = (Context) initContext.lookup("java:comp/env");
		DataSource ds = (DataSource) context.lookup("jdbc/mariadb");
		// 取得資料庫連結物件和Statement物件
		Connection dbCon = ds.getConnection(); 
		Statement stmt = dbCon.createStatement(); 

		ResultSet rs = stmt.executeQuery(sql);
	  
		out.print("<table border='2' width='600'>");
		out.print("<caption align='center'style='font-size:0.8cm;color:red'><b>員工基本資料</b></caption>");
		while( rs.next() ) {
			out.print("<tr>");
			out.print("<td>"+rs.getString("num")+"</td>");
			out.print("<td>"+rs.getString("name")+"</td>");
			out.print("<td>"+rs.getString("sex")+"</td>");
			out.print("<td>"+rs.getDate("birth")+"</td>");
			out.print("<td>"+rs.getString("address")+"</td>");
			out.print("</tr>");
		}
		out.print("</table>");
	  
		stmt.close();   // 關閉Statement物件
		dbCon.close();  // 關閉連結
      }
      catch(Exception e) {
		out.print(e);   
	  }                      
    %>
  </body>
</html>