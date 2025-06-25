<%@page contentType="text/html"%>
<%@page pageEncoding="utf-8"%>
<html>
  <head>
    <title>清單方塊</title>
  </head>
  <body>

    <% request.setCharacterEncoding("utf-8"); %>
    <h1>讀取資料</h1>
    <p><b>星座：</b>
    <%
      String constellation = request.getParameter("constellation");
      out.print(constellation);
    %></p>

  </body>
</html>