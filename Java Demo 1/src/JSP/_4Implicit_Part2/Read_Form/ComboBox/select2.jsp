<%@page contentType="text/html"%>
<%@page pageEncoding="utf-8"%>

  <head>
    <title>清單方塊</title>
  </head>
  <body>
  
    <% request.setCharacterEncoding("utf-8"); %>
    <h1>讀取資料</h1>
    <p><b>科目：</b>
    <%
        String[] subject = request.getParameterValues("book");
        if(subject != null){
            for(int i = 0; i < subject.length; i++){
                out.print(subject[i]);
            }
        }

     %>
     </p>

  </body>
</html>