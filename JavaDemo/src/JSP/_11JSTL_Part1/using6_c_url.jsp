<!-- ************* using6_c_url.jsp ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
  <head>
    <title>c:url</title>
  </head>
  
  <body>  
    <span style='text-align:center'>
      <img src=<c:url value="theFile/Taiwan.png" /> >
      <p></p>
      <a href=<c:url value="https://tw.yahoo.com" /> target="new" >
        <h3>Yahoo</h3>
      </a>
    </span> 
      
  </body> 
</html>