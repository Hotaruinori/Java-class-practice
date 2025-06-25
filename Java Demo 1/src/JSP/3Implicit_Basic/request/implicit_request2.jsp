<!-- ************* request2.jsp ************* -->
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>request物件</title>
  </head>
  <body style="font-size:24px;">
    <% 
      Enumeration vars = request.getParameterNames();
      int nums = 0;

      out.print("<h1>取得所有欄位名稱:</h1>");
      while(vars.hasMoreElements())
      {
    	  nums++;
    	  out.print("&lt");
    	  out.print(vars.nextElement());
    	  out.print("&gt");
    	  out.print("&nbsp;&nbsp");
      }
      
	  out.print("<p>");
	  out.print("傳遞了" + nums + "個欄位");
    %>

  </body>
</html>