<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
  </head>
  <body>
    <%
      String str=(String)session.getAttribute("data");
      
      out.print("<h1>取得屬性內容:"+ str +"</h1>");
      
    %>
  </body>
 
</html>