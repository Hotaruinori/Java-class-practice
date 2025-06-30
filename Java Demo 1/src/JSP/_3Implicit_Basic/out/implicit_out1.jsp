<%-- ************* implicit_out1.jsp ************* --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>out物件</title>
  </head>
  <body>
    <font size=6>
    <% 
      out.print("測試out.print印出");
	  out.write("測試out.write印出");    
      out.println("測試out.println印出");
	  
      out.print("測試out.print印出<br>"); 
      out.print("測試out.println印出<p>");
	  
    %>
    </font>
  </body>
  
</html>