<!-- ************* usingF_c_foreach.jsp ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
  <head>
	<title>c:forEach_Items</title>
	<style>
	  body {
		font-size:24px;
	  }
	</style>
  </head>
  <body>
    <%
      String[] ary = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"}; 
      //Integer[] ary = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	  //int[] ary = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	  request.setAttribute("itemObjects",ary) ; 
    %>
    <c:out value="<h3>列出1~15的奇數</h3>" escapeXml="false" /><p>
    
    <c:forEach items="${itemObjects}" var="theItemObj" varStatus="status" begin="0"  end="15"  step="2" >
      
      ${theItemObj} -->
        索引值：${status.index}　
        個數：${status.count}　
        第一筆：${status.first}　
        最末筆：${status.last}
        <br>
    
     </c:forEach>

    </body>
</html>