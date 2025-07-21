<!-- ************* using7_c_url_param.jsp ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
  <head>
    <title>c:param</title>
  </head>
  <body>
    <span style='text-align:center'>
      <a href=<c:url value="http://www.drmaster.com.tw/Bookinfo.asp" >  
                <c:param name="BookID" value="MP31821" />
              </c:url> >
        <h1>Python</h1>
      </a>
    </span> 
        
  </body>
</html>