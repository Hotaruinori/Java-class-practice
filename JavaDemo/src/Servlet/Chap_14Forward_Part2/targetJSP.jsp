<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Forward</title>
  </head>
  
  <body>
    <%
      String str1=(String)request.getAttribute("arg");
      String str2=(String)request.getParameter("arg");
      out.print("<h1 style='color:#f00'>取得屬性內容: "+ str1 +"</h1>");
      out.print("<h1 style='color:#00f'>取得參數內容: "+ str2 +"</h1>");
    %>
  </body>
  
</html>