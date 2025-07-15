<%-- ************* EL01_setApplicationData.jsp ************* --%>
<%@page import="java.util.*" contentType="text/html" pageEncoding="utf-8"%>

<html>
  <head>
    <title>>設定 application 資料</title>
	<style>
	  a {
		  font-size:24px;
	  }
	</style>
  </head>
  <body>
    <%
      application.setAttribute("title","合力達專案經理") ; 
      session.setAttribute("name","kuomulin") ; 
    %>
    <h2>已完成設定共用變數</h2>
	
    <a href="EL02_UsingApplicationData.jsp">顯示已設定之 application 資料內容</a>
  </body>
</html>
