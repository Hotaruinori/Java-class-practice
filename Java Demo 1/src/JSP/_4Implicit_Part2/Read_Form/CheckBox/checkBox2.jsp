<%@page contentType="text/html"%>
<%@page pageEncoding="utf-8"%>
<%@page import="java.util.*"%>

<html>
  <head>
    <title>核取方塊</title>
  </head>
  <body>
    <% request.setCharacterEncoding("utf-8"); %>
    <h1>讀取資料</h1>
    <p><b>愛好：</b>
    <% 
        String[] hobby = request.getParameterValues("hobby");
        String spc = "&nbsp;&nbsp;&nbsp;&nbsp;";
        if(hobby != null){
            for(int i = 0; i < hobby.length; i++){
            	if(i!=hobby.length-1)
                	out.print(hobby[i] + "==");
            	else
            		out.print(hobby[i]);
            }
        }
        out.print("<p>");
       
    %>
    <p><b>愛好：</b>
    <%
    	out.print(String.join( "==", hobby ));
    %>
  </body>
</html>