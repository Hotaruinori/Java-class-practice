<!-- ************* EL13_Header.jsp ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>

<html>
  <head>
    <title>列出標頭資訊</title>
  </head>
  
  <body style="font-size:36px">    
    accept-encoding：${header["accept-encoding"]}<p>
    user-agent：${header["user-agent"]}<p>
    host：${header["host"]}<p>
    connection：${header["connection"]}<p>            
  </body>
</html>
