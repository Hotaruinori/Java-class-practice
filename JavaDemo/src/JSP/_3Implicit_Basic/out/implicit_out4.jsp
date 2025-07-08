<%-- ************* implicit_out4.jsp ************* --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset=utf-8">
    <title>out物件</title>
  </head>
  <body>
    <font size=6>
    <% 
      int sizeValue;

      sizeValue= out.getBufferSize();
      out.print("預設BufferSize: " + sizeValue + "bytes<br>");

      sizeValue= out.getRemaining();
      out.print("1.目前BufferSize尚餘: " + sizeValue + "bytes<p>");
      out.print("2.目前BufferSize尚餘: " + out.getRemaining() + "bytes<p>");
      
      out.flush();
      sizeValue= out.getRemaining();
      out.print("3.經過flush, 目前BufferSize為: " + sizeValue + "bytes<p>");
    %>
  </body>
  
</html>