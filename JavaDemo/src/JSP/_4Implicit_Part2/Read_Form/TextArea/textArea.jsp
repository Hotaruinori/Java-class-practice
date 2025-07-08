<%@page contentType="text/html"%>
<%@page pageEncoding="utf-8"%>

<html>
  <head>
    <title>文字區塊</title>
  </head>
  <body>
  
    <% request.setCharacterEncoding("utf-8"); %>
    <h1>讀取資料</h1> 
    <p><b>個人簡介：</b>
    <%
      String content = request.getParameter("textarea");
      out.print(content);
    %>
    <p>

  </body>
</html>