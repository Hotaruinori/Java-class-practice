<!-- ************* usingD_c_foreach.jsp ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
  <head>
    <title>c:forEach</title>
	<style>
	  body {
		font-size:30px;
	  }
	</style>
  </head>
  <body>
    <c:out value="<h3>列出1~10的整數</h3>" escapeXml="false" /><p>
    
    <c:forEach var="theItem" begin="1" end="10">

      ${theItem} ${","} 
 
    </c:forEach>
     
    <p>
    <c:out value="<h3>列出1~10的奇數</h3>" escapeXml="false" /><p>
    
    <c:forEach var="theItem" begin="1" end="10" step="2">
      
        ${theItem} ${","} 
    
    </c:forEach>
     
    </body>
</html>