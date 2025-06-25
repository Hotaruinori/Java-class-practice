<!-- ************* implicit_request5.jsp ************* -->
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import = "java.util.*" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset=utf-8">
    <title>request物件</title>
  </head>
  <body style="font-size:24px;">
    <% 
      String item,value;

      Enumeration elements = request.getHeaderNames();
      while(elements.hasMoreElements()){
        
        item=(String)elements.nextElement();
        value = request.getHeader(item);
        out.println(item);
        out.println(value + "<p>");
      }   
    %>
     
  </body>
</html>