<!-- ************* request1.jsp ************* -->
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset=utf-8">
	<style>
	  h1 {
	     color:red;	  
	  }
	</style>
    <title>request物件</title>
  </head>
  <body>
    <% 
    request.setCharacterEncoding("utf-8");

    String user = request.getParameter("user");
    String pwd = request.getParameter("pwd");

    if(user.equals("kuomulin") && pwd.equals("1234"))
        out.print("<h1>歡迎光臨 !</h1>");
    else
        response.sendRedirect("inputData1.html");
   %>
  </body>  
</html>