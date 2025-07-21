<!-- ************* using3_c_set.jsp ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
  <head>
    <title>c:set</title>
  </head>
  
  <body>    
    <c:set value="This is a book" var="myString"/>
	
	<h2>字串內容:</h2>
    <h1>${myString}</h1>

  </body>
</html>