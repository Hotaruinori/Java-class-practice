<!-- ************* usingB_c_if.jsp ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
  <head>
    <title>c:if 標籤</title>
    <style>
	  body {
		font-size:30px;
		color:red;
	  }
	</style>
  </head>
  <body>   
    <c:if test="${4>2}" var="result" />    
    
    <c:if test="${result==true}">
      <c:out value="${'4比2大'}" />   
    </c:if>
    
  </body>
</html>
