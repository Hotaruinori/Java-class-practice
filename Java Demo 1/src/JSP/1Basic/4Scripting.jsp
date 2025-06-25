<%@page contentType="text/html"%>
<%@page pageEncoding="utf-8"%>

<html>
  <head>
    <meta charset="utf-8">
    <title>Scripting</title>
  </head>
  <body>   
    <% for(int i=0;i<10;i++){%>
	
		<font size = 5 >JSP動態網頁新技術 !! <br>
		
    <% }%>
	
	<p>
	
	<% 
	  for(int i=0;i<10;i++){
		  
		  out.print("<font size = 5 >JSP動態網頁新技術 !! <br>");
      }
	%>   
  </body>
  
</html>