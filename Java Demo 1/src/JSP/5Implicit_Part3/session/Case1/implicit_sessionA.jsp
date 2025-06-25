<%-- ************* implicit_sessionA.jsp ************* --%>
<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>session物件</title>
  </head>
  <body>
    <font size="6"><b>第一張網頁</b></font><p>
    <% 
      request.setCharacterEncoding("utf-8");     
      String sessionID = session.getId();
      out.print("<h1>sessionID : " + sessionID + "</h1>");
    %>
    
	<form method="post" action="implicit_sessionB.jsp">
      <input type="submit" value="傳遞session_ID">
    </form>
  </body>
  
</html>