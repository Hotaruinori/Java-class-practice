<!-- ************* action_Forward.jsp ************* -->
<%@ page contentType="text/html; charset=utf-8" %>
<html>
  <head>
    <title>action_forward</title>
  </head>
  
  <body>
    <font color="red" size="7">網頁將轉址至forward.jsp</font><p>
    <jsp:forward page="forward.jsp">
      <jsp:param name="cols" value="9" />
      <jsp:param name="rows" value="9" />
    </jsp:forward>
    <p></p>
    <font color="blue" size="5">今天的日期/時間:
    <%=new java.util.Date()%></font><br>
  </body>
</html>