<!-- ************* usingC_c_choose.jsp ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
  <head>
    <title>c:choose</title>
	<style>
	  body {
		font-size:30px;
		color:red;
	  }
	</style>
  </head>
  
  <body>
	<c:set value="5" var="num" scope="application"/>
	
    <c:choose>
      <c:when test="${num >= 3}">
        ${"變數num >= 3"}     
      </c:when>
      <c:when test="${num >= 2}">
        ${"變數num >=2 且 <3"}     
      </c:when>	  
      <c:otherwise>
        ${"變數num < 2"}                
      </c:otherwise>    
    </c:choose>
  </body>
</html>