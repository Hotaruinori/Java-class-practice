<%@ page contentType="text/html; charset=utf-8" %>

<html>
  <head>
    <title>JSP calling Servlet</title>
  </head>
  <body>
    <!-- processing to a servlet -->   
    <jsp:forward page="/doServletA">
    	<jsp:param name="empid" value="54321" />
    	<jsp:param name="user" value="Lily" />
    </jsp:forward>    
  </body>
</html>