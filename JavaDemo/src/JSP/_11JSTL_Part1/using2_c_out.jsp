<!-- ************* using_c_out2.jsp ************* -->
<%@ page contentType="text/html"%>
<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
  <head>
    <title>c:out</title>
  </head>
  
  <body>
    <h1>
	  <c:out value="c:out輸出文字 1" escapeXml="false" /><p>
	  <c:out value="c:out輸出文字 2" escapeXml="true" /><p>
	  <hr>
      <c:out value="&lt;輸出文字 3 &gt;" escapeXml="false" /><p>
      <c:out value="&lt;輸出文字 4 &gt;" escapeXml="true" /><p>
      <c:out value="&lt;輸出文字 4 &gt;" /><p>
      <hr>
      <c:out value="<font color=red>輸出文字 5</font>" escapeXml="false" /><br>   
      <c:out value="<font color=red>輸出文字 6</font>" escapeXml="true" /><br>
    </h1>	
  </body>
  
</html>