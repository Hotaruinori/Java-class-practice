<%@ page contentType="text/html;charset=utf-8" %>
<%@ page import="java.util.*" %>

<html>
  <meta charset="utf-8">
  <title>亂數顯示圖片</title>
  <body>
    <font size='6' color='red'>產生亂數值</font>
	
    <%
	  //Insert code here
	String beginParam = request.getParameter("begin");
    boolean isclicked = "ok".equals(beginParam); // 避免 NullPointerException
    
    
    if(isclicked){
		 Random rnd=new Random();
	     int no = rnd.nextInt(10);
	     String imgPath = "picture/" + no + ".jpg"; 
    
    %>
   <span>
    <img src="<%= imgPath %>" alt="隨機圖片"></span>
    
    <%
    }
    %>
	
	<form method="post" action="lab_Random.jsp">
	  <input type="hidden" name="begin" value="ok">
      <input type="submit" value="開始">	  
	</form>
  </body>
</html>
