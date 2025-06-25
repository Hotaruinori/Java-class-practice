<%-- ************* implicit_session1.jsp ************* --%>
<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>session物件</title>
  </head>
  <body>
    <% 
      request.setCharacterEncoding("utf-8");
      session.setAttribute("str","Java Language");
	  session.setMaxInactiveInterval(5);
      out.print("<h1>參數 : " + session.getAttribute("str") + "</h1>");
    %>
	<form method="post" action="implicit_session2.jsp">
      <input type="submit" value="限時傳遞參數">
    </form>
  </body>

</html>