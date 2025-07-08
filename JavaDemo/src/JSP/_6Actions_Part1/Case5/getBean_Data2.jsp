<!-- ************* getBean_Data2.jsp ************* -->
<%@ page contentType="text/html;charset=utf-8" %>
<%@page import="java.io.*,com.ted.ValueBean" %>

<html>
  <head>
    <title>getBean</title>
  </head>
  <body style='font-size:0.5cm'>
    <font size="6">取得Bean的屬性內容</font><p>
  
    <jsp:useBean id= "books" scope= "session" class= "com.ted.ValueBean" />
      books單價為：
    <jsp:getProperty name= "books" property= "price" /><br>
      books數量為：
    <jsp:getProperty name= "books" property= "quantity" /><br>
      books總價為：
    <jsp:getProperty name= "books" property= "total" /><br>
    <p></p>
    <%
	try 
	  {
        ObjectInputStream obj = new ObjectInputStream(
                                    new FileInputStream("books.dat"));

        ValueBean temp = (ValueBean) obj.readObject();
		
		System.out.println(temp.getPrice());
		System.out.println(temp.getQuantity());
		System.out.println(temp.getTotal());	
	
		obj.close();
	  }
	  catch (Exception e)
	  {
		System.err.println(e);
	  }      
    %>
  </body> 
</html>
