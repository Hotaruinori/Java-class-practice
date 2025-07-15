<!-- ************* EL06_Relation.jsp ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>

<html>
  <head>
	<title>EL 關係運算</title>
	<style>
	  table {
		font-size:1cm;  
	  }
	</style>
  </head>
  
  <body>
    
    <table border="3" style="table-layout:fixed; width:420px;text-align: center;">
      <tr>
        <th width="200px">運算式</th>
        <th width="200px">結果</th>
      </tr>
      <tr>
        <td>123==100</td>
        <td align="center">${123==100}</td>
      </tr>
      <tr>
        <td>123!=100</td>
        <td align="center">${123!=100}</td>
      </tr>
      <tr>
        <td>123>100</td>
        <td align="center">${123>100}</td>
      </tr>
      <tr>
        <td>123<100</td>
        <td align="center">${123<100}</td>        
      </tr>
      <tr>
        <td>123>=100</td>
        <td align="center">${123>=100}</td>
      </tr>
      <tr>
        <td>123<=100</td>
        <td align="center">${123<=100}</td>
      </tr>    
    </table>

  </body>
</html>
