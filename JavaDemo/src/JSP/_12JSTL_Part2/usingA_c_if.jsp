<!-- ************* usingA_c_if.jsp ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
  <head>
    <title>c:if</title>
	<style>
	  body {
		font-size:30px;
	  }
	</style>
  </head>
  <body>
    <c:if test="${4>2}" var="result">
      <c:out value="${'4比2大'}" />
      <p>條件運算結果:<c:out value="${4>2}" /></p>
      <p>變數result的內容:<c:out value="${result}" /></p>     
    </c:if>
    <hr>
    <c:if test="${2<4}" var="result">
      <c:out value="${'2比4小'}" />    
    </c:if>   
    
  </body>
</html>
