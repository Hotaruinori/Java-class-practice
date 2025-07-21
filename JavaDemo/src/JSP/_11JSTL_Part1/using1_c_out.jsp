<!-- ************* using1_c_out.jsp ************* -->
<%@ page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>c:out</title>
  </head>
  
  <body> 
    <h1>
      <c:out value="這是 C:OUT輸出的文字" /><p>
    
      <c:out value="<em>這是 C:OUT輸出的文字</em>" /><br>  
    </h1>        
  </body>
  
</html>
