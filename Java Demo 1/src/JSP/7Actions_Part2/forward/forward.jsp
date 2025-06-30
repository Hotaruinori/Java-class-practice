<!-- ************* forward.jsp ************* -->
<%@ page contentType="text/html; charset=utf-8" %>
<html>
  <head>
    <title>forward</title>
  </head>
  <body>
  <h2>程式:forward.jsp</h2>
  <% 
    // 取得傳入的參數      
    int rows = Integer.parseInt(request.getParameter("rows"));
    int cols = Integer.parseInt(request.getParameter("cols"));
	String spc = "&nbsp;&nbsp;";
    // 顯示計算結果
    for(int i = 1; i <= rows; i++){
        for(int j = 1; j <= cols; j++){
        	if(i*j<10)
        		out.print( i*j + spc + spc);
        	else
        		out.print( i*j + spc);	
      	}
      	out.print("<br>");
    }
  %>
  </body>
  
</html>