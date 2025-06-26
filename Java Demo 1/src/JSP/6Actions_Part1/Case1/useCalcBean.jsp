<!-- ************* useCalcBean.jsp ************* -->
<%@ page contentType="text/html;charset=utf-8" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>UseBean</title>
  </head>
  
  <body style='font-size:1cm'>
    <jsp:useBean id="obj" class="com.ted.Calc"/>

    <%
      int m=obj.cube(5);
      out.print("cube of 5 is " + m);
    %>
  </body>
</html>
 