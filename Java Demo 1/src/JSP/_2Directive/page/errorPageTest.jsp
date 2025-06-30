<%-- ************* errorPageTest.jsp ************* --%>
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page errorPage="page_isErrorPage.jsp" %>

<html>
  <meta charset="utf-8">
  <body>
    <%
      if(true)
        throw new Exception("發生了JSP例外");
    %>
  </body>
</html>