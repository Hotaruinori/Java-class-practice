<!-- ************* usingG_c_fortokens.jsp ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
  <head>
    <title>c:forTokens</title>

  </head>
  <body>    
    <h2>
    <c:out value="原始字串： JavaServer Pages Standard Tag Library" />
    <p>
    <c:out value="解析字串：" />
    <c:forTokens var="theItem" items="JavaServer Pages Standard Tag Library" delims=" " >
    
        ${theItem} ${"-"}
    
    </c:forTokens>
    </h2> 
      
  </body>
</html>