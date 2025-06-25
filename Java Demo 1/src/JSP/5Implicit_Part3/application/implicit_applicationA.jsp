<%-- ************* implicit_applicationA.jsp ************* --%>
<%@ page language="java" contentType="text/html;charset=utf-8" %>
<%@ page pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset=utf-8">
    <title>application物件</title>
  </head>
  <body>
    <font style="font-size:0.8cm"><b>第一張網頁</b></font><p></p>
    <%     
      String name="kuomulin";
      application.setAttribute("app_data", name);

      out.println("<h1>以application傳遞資料</h1>");
    %>

    <form method="post" action="implicit_applicationB.jsp">
    <input type="submit" value="傳遞 name">
  </body> 
</html>