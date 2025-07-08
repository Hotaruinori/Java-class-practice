<!-- ************* setBean_Data2.jsp ************* -->
<%@ page contentType="text/html;charset=utf-8" %>
<%@page import="java.io.*" %>

<html>
  <head>
    <title>setBean</title>
  </head>
  <body style='font-size:0.5cm'>
    <font size="6">設定Bean的屬性內容</font><p>

    <jsp:useBean id= "books" scope= "session" class= "com.ted.ValueBean" />
    <jsp:setProperty name= "books" property= "price" value= "500" />
    <jsp:setProperty name= "books" property= "quantity" value= "12" />
    <%
      try {		
        ObjectOutputStream obj = new ObjectOutputStream(
                                     new FileOutputStream("books.dat"));
	
		obj.writeObject(books);
		obj.close();
		System.out.println("寫入books.dat");
	  }
      catch (IOException ie){	
		System.out.println(ie);
	  }    
    %>
    <form method="post" action="getBean_Data2.jsp">
      <input type="submit" value="取出Bean的屬性">
	</form>  
  </body>
</html>
