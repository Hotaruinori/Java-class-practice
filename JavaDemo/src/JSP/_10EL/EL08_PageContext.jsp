<!-- ************* EL08_PageContext.jsp ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>

<html>
  <head>
	<title>pageContext 物件</title>
  </head>
  
  <body style="font-size:1cm">
    請求URL:${pageContext.request.requestURL}<p>
    
    通訊協定：${pageContext.request.protocol}<p>
       
    session ID：${pageContext.session.id}<p> 
 
  </body>
</html>
