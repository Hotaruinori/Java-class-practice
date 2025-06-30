<!-- ************* implicit_request3.jsp ************* -->
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset=utf-8">
    <title>request物件</title>
  </head>
  <body style="font-size:24px;">
    <% 
      String ClientOpt = request.getHeader("user-agent");
      out.print("Client作業系統：<br>");
	  out.print( ClientOpt );
    %>

  </body>
</html>