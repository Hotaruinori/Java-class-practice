<%-- ************* page_isErrorPage.jsp ************* --%>
<%@ page isErrorPage="true" %>
<%@ page contentType="text/html; charset=utf-8" %>

<html>
  <body style="color:red;font-size:0.5cm">
    錯誤訊息：<% out.print(exception.getMessage()); %><p>	
	錯誤訊息：<%= exception.getMessage() %>
  </body>
</html>