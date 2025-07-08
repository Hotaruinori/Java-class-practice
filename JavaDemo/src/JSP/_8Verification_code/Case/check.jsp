<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="0">
    <title>認證結果</title>
  </head>

  <body>
    <%
		String rnd = (String)session.getAttribute("rnd");
		String input = (String)request.getParameter("insrand");
   %>
    系統產生的認證碼： <%= rnd %><br>
    請輸入的認證碼： <%= input %><br>
   <br>
   <%
       try{
           if(rnd.equals(input))
               out.print("<font color='blue'>輸入相同, 認證成功！</font>"); 
           else
               out.print("<font color='red'>輸入不同, 認證失敗！</font>");
       }
       catch(Exception e){}
   %>
  </body>
  
</html>