<%-- ************* main_file.jsp ************* --%>
<%@ page contentType="text/html; charset=utf-8" %>
<html>
  <head>
	<title>include_file</title>
  </head>
  <body>   
	<%
	  out.print("<h1 style='font-size:1.5cm;color:blue'>這是主檔案的輸出結果:</h1>");
	  out.print("<h1 style='font-size:1.5cm'>This is the original file output!</h1>");
	  out.print("<br>");
	%>
	<p>
	<%@ include file="myinclude.jsp" %><p>
	
  </body>
</html>