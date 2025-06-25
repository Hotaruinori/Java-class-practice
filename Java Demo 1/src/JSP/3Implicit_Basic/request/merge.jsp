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
      String msg="";
      out.print(msg);
      request.setCharacterEncoding("utf-8");
      if(request.getParameter("user")!= null)
	  {
          String user = request.getParameter("user");
          String pwd = request.getParameter("pwd");

          if(user.equals("kuomulin") && pwd.equals("1234"))
        	  msg="<h1>歡迎光臨 !</h1>"; 
          else
        	  response.sendRedirect("merge.jsp");       	  
              
          out.print(msg);
	  }
        
    %>
   
    <form method="post" action="merge.jsp">
      使用者名稱 <input type="text" name="user" size="20"><p>
      使用者密碼 <input type="password" name="pwd" size="20"><p>     
      
      <input type="submit" value="登入">
      <input type="reset" value="取消"> 
    </form> 
  </body> 
</html>