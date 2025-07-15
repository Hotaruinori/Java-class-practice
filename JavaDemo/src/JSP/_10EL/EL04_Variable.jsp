<!-- ************* EL04_Variable.jsp ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>

<html>
  <head>
    <title>使用 EL 變數</title>
  </head>
  <body style="font-size:32px">
    <%
      application.setAttribute("number1","200") ; 
      application.setAttribute("number2","400") ;      
    %>
    
      輸出常數100：${100}<p>
      輸出變數number1：${number1}<p>      
      輸出變數number2：${number2}<p>   
      輸出變數number1 + number2：${number1 + number2}<p> 
      輸出變數number1 + number2：${number1} + ${number2}<p>
      輸出變數number：${number}<p>	
    
      輸出字串number1：${'number1'}<p>  
      輸出字串number2：${'number2'}<p> 
	    
  </body>
</html>
