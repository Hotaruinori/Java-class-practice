<%@page contentType="text/html"%>
<%@page pageEncoding="utf-8"%>

<html>
  <head>
    <title>include</title>
  </head>
  <body>
  	<% out.println("<h1>using include_file.txt 的內容:</h1>");%>	
    <%@ include file="2include_file.txt" %> 	
  </body> 
  
</html>