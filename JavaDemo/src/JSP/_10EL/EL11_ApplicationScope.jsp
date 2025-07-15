<!-- ************* EL11_ApplicationScope.jsp ************* -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
  <head>
    <title>applicationScope 物件</title>
  </head>
  
  <body style="font-size:1cm">   
    <% application.setAttribute("my_name","ted");
       //取得參數值,方式1
       out.print("方式1: ");
       out.print(application.getAttribute("my_name")); 
	%>
	<p>
	<!--取得參數值,方式2-->
	方式2:
    ${applicationScope.my_name}
  </body>
</html>
