<%-- ************* request_Page2.jsp ************* --%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>session物件</title>
  </head>
  <body>
    <font size="6" color="blue"><b>第二張網頁</b></font><p>
    <% 
      String name="";
      request.setCharacterEncoding("utf-8");     
           
      name=(String)request.getAttribute("name");      
      out.print("<h1>接收name是 : " + name + "</h1>");
    
    %>	
  </body>
</html>