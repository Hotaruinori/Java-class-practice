<!-- ************* EL07_Logic.jsp ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>

<html>
  <head>
	<title>EL 邏輯運算</title>
  </head>
   
  <body style="font-size:1cm">   
    10<100 && 10>=100：${10<100 && 10>=100}<p>
    10>100 || 10<=100：${10>100 || 10<=100}<p>
    !(10>100)：${!(10>100)}<p>
  </body>
</html>
