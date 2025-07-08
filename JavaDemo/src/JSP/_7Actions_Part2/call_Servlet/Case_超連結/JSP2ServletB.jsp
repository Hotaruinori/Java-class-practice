<%@ page contentType="text/html; charset=utf-8" %>

<html>
  <head> <title>JSP calling Servlet</title> </head>
  <body style="font-size:0.8cm">
    <!-- Forward processing to a servlet -->
    <%
      out.print("<a href='doMyServletB?user=Anna'>Call Servlet</a>");

      session.setAttribute("no", "12345");
    %>
        
  </body> 
</html>