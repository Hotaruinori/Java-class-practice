<!-- ************* using4_c_remove.jsp ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
  <head>
	<title>c:remove</title>
	<style>
	  td {
		font-size:1cm;
        color:blue;
	  }	
	</style>
  </head>
  
  <body>   
    <c:set value="lily_lulu_nana_jojo"  var="myString" />
       
    <table border="1" width="520">
      <tr>
	    <td>字串內容:</td>
        <td>${myString}</td>
      </tr>
    </table>
   
    <c:remove var="myString" />
    <h2>執行 remove 之後</h2>
    <table border="1" width="520">
      <tr>
	    <td width="100">字串內容:</td>
        <td width="180">${myString}</td>
      </tr>
    </table>	
  </body>
  
</html>