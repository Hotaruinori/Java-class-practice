<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
      <title>讀取基本資料</title>
    <style type="text/css">
      label {
        color:red;
        font-weight:bold;
      }
    </style>  
  </head>
  <body style="font-size:1cm;color:blue">
    <% 
      request.setCharacterEncoding("utf-8");

      String name = request.getParameter("field1");
      String gender = request.getParameter("field2");
      String marriage = request.getParameter("field3"); 
      String[] sport = request.getParameterValues("field4");
	  
      out.print("<label>姓名: </label>" + name + "<br>");
      out.print("<label>性別: </label>" + gender + "<br>");
      out.print("<label>婚姻: </label>" + marriage + "<br>");      
      out.print("<label>運動: </label>" + String.join("、",sport));     
    %>
  </body>
  
</html>