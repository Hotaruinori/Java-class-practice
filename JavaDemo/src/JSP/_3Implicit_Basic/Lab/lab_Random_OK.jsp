<%@ page contentType="text/html; charset=utf-8" %>

<html>
  <meta charset="utf-8">
  <title>亂數顯示圖片</title>
  <body>
    <font size='6' color='red'>產生亂數值</font>
	
    <%
	  String msg="";
      int n;
	  msg=request.getParameter("begin");
	  
	  try{
		  
	    if(msg.equals("ok")){
	    	
          String path="picture/";		  
	      n=(int)(Math.random()*10);
	      path+=String.valueOf(n);
	      path+=".jpg";

	      out.print("<img src=" + path +"><br>"); 
   
        }	
      }
	  catch(Exception e){}	  
    %>
	
	<form method="post" action="lab_Random_OK.jsp">
	  <input type="hidden" name="begin" value="ok">
      <input type="submit" value="開始">	  
	</form>
  </body>
</html>
