<!-- ************* action_Include.jsp ************* -->
<%@ page contentType="text/html; charset=utf-8" %>
<html>
  <head>
    <title>action_Include</title>
  </head>
  <body>
    <h1>動作元素include</h1>
    <%  
      String file = "copyright.jsp";  // 指定引入的檔案     
    %>
    <h2>引入included.jsp(指定參數)</h2>
    <jsp:include page="included.jsp" flush="true">
      <jsp:param name="cols" value="6" />
      <jsp:param name="rows" value="4" />
    </jsp:include>
	
    <p></p>
	
    <h2>引入copyright.jsp(無參數)</h2>
    <jsp:include page="<%= file %>" flush="true"/>
  </body>
 
</html>