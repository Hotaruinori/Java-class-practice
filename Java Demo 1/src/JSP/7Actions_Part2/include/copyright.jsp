<!-- copyright.jsp -->
<%@ page contentType="text/html; charset=utf-8" %>
<html>
  <head>
    <title>copyright.jsp</title>
    <%! int visits = 0; %>
  </head>
  <body>
    <font size="5">
    <%  visits++; // 計數加1 %>
    <%= "JSP程式的訪客計數: " + visits %>
	</font>
  </body>
  
</html>