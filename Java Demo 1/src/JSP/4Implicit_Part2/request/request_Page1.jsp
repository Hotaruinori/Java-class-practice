<%-- ************* request_Page1.jsp ************* --%>
<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>request物件</title>
  </head>
  <body>
    <font size="6"><b>第一張網頁</b></font><p>
    <% 
      request.setCharacterEncoding("utf-8");     
      request.setAttribute("name","kuomulin");      
    %>
	  
	<form method="post" action="request_Page2.jsp">
      <input type="submit" value="傳遞name">
    </form>
  </body>
</html>