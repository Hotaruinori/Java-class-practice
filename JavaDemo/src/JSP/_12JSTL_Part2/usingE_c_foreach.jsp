<!-- ************* usingE_c_foreach.jsp ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <head>
	<title>c_forEach_Items</title>
	<style>
	  body {
		font-size:30px;
	  }
	</style>
  </head>
  <body>
    <%
        String[] theArray = {"lily","lulu","nana","jojo","diana","anna"}; 
        request.setAttribute("itemObjects",theArray) ; 
    %>

    <c:out value="<h3>列出陣列物件的內容</h3>" escapeXml="false" /><p>
    
    <c:forEach items="${itemObjects}" var="item" begin="0" end="5">
      
        ${item } ${","}  
    
    </c:forEach>
    	
  </body>
</html>