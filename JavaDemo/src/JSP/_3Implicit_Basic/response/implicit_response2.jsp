<%-- ************* implicit_response2.jsp ************* --%>
<%@ page language="java" contentType="text/html; charset=utf-8" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>response物件</title>
  </head>
  <body>
    <% 
      String encode, type;

      encode= response.getCharacterEncoding();
      out.print("<h1>本例回應訊息編碼為: " + encode + "</h1>");

      type= response.getContentType();
      out.print("<h1>本例回應文件格式為: " + type + "</h1>");
   %>
  </body>
</html>