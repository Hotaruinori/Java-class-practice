<%-- ************* page2.jsp ************* --%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset=utf-8">
    <title>application物件</title>
  </head>
  <body>
   <font style="font-size:0.8cm"><b>第二張網頁</b></font><p></p>
    <% 
      String data1=(String)application.getAttribute("app_data"); 
 
      String data2=(String)session.getAttribute("sess_data");
     	  
    %>
    <font style="font-size:1cm;color:red">
      application資訊內容為： <%= data1 %>
	  <p></p>
	  session資訊內容為： <%= data2 %>
    </font>
  </body>
</html>