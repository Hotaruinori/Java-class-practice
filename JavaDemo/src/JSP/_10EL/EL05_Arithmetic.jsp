<!-- ************* EL05_Arithmetic.jsp ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>

<html>
  <head>
    <title>EL 算術運算</title>
	<style>
	  table {
		font-size:36px;  
	  }
	</style>
  </head>
  
  <body>
    <table border="1">
      <tr>
        <th width="200px">運算式</th>
        <th width="200px">結果</th>
      </tr>
      <tr>
        <td>\${6 + 4}</td>
        <td align="center">${6 + 4}</td>
      </tr>
      <tr>
        <td>\${6 - 4}</td>
        <td align="center">${6-4}</td>
      </tr>
      <tr>
        <td>\${6 * 4}</td>
        <td align="center">${6 * 4}</td>
      </tr>
      <tr>
        <td>\${6 / 4}</td>
        <td align="center">${6 / 4}</td>        
      </tr>
      <tr>
        <td>\${6 div 4}</td>
        <td align="center">${6 div 4}</td>
      </tr>
      <tr>
        <td>\${6 % 4}</td>
        <td align="center">${6 % 4}</td>
      </tr>
      <tr>
        <td>\${6 mod 4}</td>
        <td align="center">${6 mod 4}</td>
      </tr>
    </table>

  </body>
</html>
