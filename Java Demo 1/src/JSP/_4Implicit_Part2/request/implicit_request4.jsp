<!-- ************* implicit_request4.jsp ************* -->
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset=utf-8">
    <title>request物件</title>
  </head>
  <body style="font-size:24px;">
    <% 
      String language = request.getHeader("accept-language");
      out.print("Client Language： " + language);
    %>

  </body> 
</html>