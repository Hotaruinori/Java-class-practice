<%-- ************* implicit_response1.jsp ************* --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import= "java.util.*" %>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>response物件</title>
  </head>
  <body>
    <% Date now= new Date(); %>
    <% 
      response.addIntHeader("refresh", 5);

      out.print("<div style='font-size:24px;color:#00f'>網頁每5秒重整一次" + "</div>");

      out.print("<h1>現在時間: " + now + "</h1>");

   %>
  </body>
</html>