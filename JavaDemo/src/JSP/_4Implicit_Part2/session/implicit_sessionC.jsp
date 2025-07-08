<%-- ************* implicit_sessionC.jsp ************* --%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>session物件</title>
  </head>
  <body>
    <font size="6" color="red"><b>第三張網頁</b></font><p>
    <% 
      request.setCharacterEncoding("utf-8");
      //session = request.getSession();
      String sessionID = session.getId();
	  String name = (String)session.getAttribute("name");
      out.print("<h1>sessionID是 : " + sessionID + "</h1>");
      out.print("<h1>接收的參數是 : " + name + "</h1>");
    %>

  </body> 
</html>