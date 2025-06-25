<%-- ************* page1.jsp ************* --%>
<%@ page language="java" contentType="text/html;charset=utf-8" %>
<%@ page pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset=utf-8">
    <title>application_vs_session物件</title>
  </head>
  <body>
    <font style="font-size:0.8cm"><b>第一張網頁</b></font><p></p>
    <%     
      String name="kuomulin";
      application.setAttribute("app_data", name);
	  session.setAttribute("sess_data", name);
	  
      out.println("<h1>以application資料" + application.getAttribute("app_data") + "</h1>");
	  out.println("<h1>以session資料" + session.getAttribute("sess_data") + "</h1>");
    %>	
  </body>  
</html>