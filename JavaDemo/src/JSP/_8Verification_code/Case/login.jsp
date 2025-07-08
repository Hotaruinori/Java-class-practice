<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>認證碼輸入頁面</title>
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="0">
    <title></title>
  </head>
  
  <body>
    <form method="post" action="check.jsp" name="insImg">
      系統產生的認證碼：<img src="createImage.jsp" alt="Random_Number"/><br>
      請輸入認證碼：<input type="text" name="insrand" size="8" maxlength="4"/><br>
      <input type="submit" value="Submit">
    </form>
  </body>
 
</html>