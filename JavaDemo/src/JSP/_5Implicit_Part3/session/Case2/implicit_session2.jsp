<%-- ************* implicit_session2.jsp ************* --%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>session物件</title>
  </head>
  <body>
    <font size="6" color="#f0f"><b>第二張網頁</b></font><p>
    <% 
      request.setCharacterEncoding("utf-8");
      //session = request.getSession();
      out.print("<h1>接收的參數內容是 : " + session.getAttribute("str") + "</h1>");
    %>
	
  </body> 
</html>