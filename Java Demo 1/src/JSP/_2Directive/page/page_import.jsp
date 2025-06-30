<%-- ************* page_import.jsp ************* --%>
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %>

<html>
  <meta charset="utf-8">
  <body>
    <h2>產生0~9的亂數:</h2>
    <%
	  Random rnd=new Random();
      int no=rnd.nextInt(10);
      out.print("<h1>" + no + "</h1>");
    %>
  </body>
</html>