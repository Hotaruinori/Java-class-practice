<!-- ************* Lab ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
  <head>
    <title>c:forTokens 標籤</title>
	<style>
	  body {
		font-size:24px;
	  }
	</style>
  </head>
  <body>    
    <c:out value="原始字串： JavaServer Pages Standard Tag Library" />
    <p>
    <c:out value="解析字串：" />
    <c:forTokens var="theItem" items="JavaServer Pages Standard Tag Library" delims=" " varStatus="status">
    
      ${theItem} 
      <c:if test="${status.last}" var="yes" />
	  <c:if test="${yes==false}">
	    <c:out value="${'-'}" />
	  </c:if>  
    </c:forTokens> 
  </body>
  
</html>