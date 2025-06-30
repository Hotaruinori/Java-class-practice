<%@page contentType="text/html"%>
<%@page pageEncoding="utf-8"%>
<%@page import="java.util.*"%>

<html>
  <head><title>JSP Page</title></head>
  <body style='font-size:0.5cm'>

    <%
      Enumeration obj = request.getParameterNames();
      int count = 0;
      out.println("取得的欄位有：");

      while(obj.hasMoreElements())
	  {
	      count++;

          out.println("<");
          out.println(obj.nextElement());
          out.println(">");                
      }

      out.print("<p>共傳遞 " + count + " 個欄位資料");
    %>
  </body>
</html>