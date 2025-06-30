<%-- ************* implicit_sessionB.jsp ************* --%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>session物件</title>
  </head>
  <body>
    <font size="6" color="blue"><b>第二張網頁</b></font><p>
    <% 
      request.setCharacterEncoding("utf-8");
      String sessionID = session.getId();
      out.print("<h1>接收sessionID是 : " + sessionID + "</h1>");
      session.setAttribute("name","Anna");
	  out.print("<h5>附帶參數 : " + session.getAttribute("name") + "</h5>");
    %>
	
	<form method="post" action="implicit_sessionC.jsp">
      <input type="submit" value="再傳遞">
    </form>
  </body>
  
</html>