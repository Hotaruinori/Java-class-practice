<%@page contentType="text/html"%>
<%@page pageEncoding="utf-8"%>

<html>
  <head><title>文字方塊</title></head>
  <body style='font-size:24px'>

    <%request.setCharacterEncoding("utf-8");%>
    <%
      String name = request.getParameter("name");
      String email = request.getParameter("email");
      String tel = request.getParameter("tel");
    %>

    個人資料如下:<p>
    姓名：<%= name%><br>
    E-mail：<%= email%><br>
    電話：<%= tel%>

  </body>
</html>