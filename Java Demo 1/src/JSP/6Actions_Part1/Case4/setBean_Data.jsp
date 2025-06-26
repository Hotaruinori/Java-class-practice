<!-- ************* setBean_Data.jsp ************* -->
<%@ page contentType="text/html;charset=utf-8" %>
<html>
  <head>
    <title>setBean</title>
  </head>
  <body style='font-size:0.5cm'>
    <font size="6">設定Bean的屬性內容</font><p>

    <jsp:useBean id= "books" scope= "session" class= "com.ted.ValueBean" />
    <jsp:setProperty name= "books" property= "price" value= "500" />
    <jsp:setProperty name= "books" property= "quantity" value= "10" />

    <form method="post" action="getBean_Data.jsp">
      <input type="submit" value="取出Bean的屬性">
	</form>  
  </body>
</html>
