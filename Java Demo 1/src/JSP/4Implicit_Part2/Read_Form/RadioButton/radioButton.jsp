<%@page contentType="text/html"%>
<%@page pageEncoding="utf-8"%>
<%@page import="java.util.*"%>

<html>
  <head>
    <title>核取方塊</title>
  </head>
  <body style="font-size:0.5cm">
    <% request.setCharacterEncoding("utf-8"); %>
    <h1>讀取資料</h1>
    <p><b>婚姻狀況：</b>
    <% 
        String marriage = request.getParameter("marriage");

        out.print(marriage);
       
    %>
 
  </body>
</html>