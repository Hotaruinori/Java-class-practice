<!-- ************* showDate.jsp ************* -->
<%@ page contentType="text/html;charset=utf-8" %>
<%@ page import="com.ted.LocalDateTimeBean"  %>

<html>
  <head>
    <title>showDate</title>
  </head>
  <body style='font-size:0.5cm'>
    <font size="6"><b>今天日期</b></font><p>


    <jsp:useBean id= "dateBean" scope= "session" class= "com.ted.LocalDateTimeBean" />
    <%
	request.setCharacterEncoding("utf-8");
    dateBean.setYear(); 
    dateBean.setMonth(); 
    dateBean.setDay(); 
    %>
	年：
    <jsp:getProperty name= "dateBean" property= "year" /><br>
	月：
    <jsp:getProperty name= "dateBean" property= "month" /><br>
	日：
    <jsp:getProperty name= "dateBean" property= "day" /><p>
    
	<font size="4"><b>今天日期<p>
    <%


    out.print("年：" + dateBean.getYear() + "<br>");
    out.print("月：" + dateBean.getMonth() + "<br>");
    out.print("日：" + dateBean.getDay());
    %>
	</b></font>
  </body> 
</html>
