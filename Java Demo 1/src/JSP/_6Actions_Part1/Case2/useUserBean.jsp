<!-- ************* useUserBean.jsp ************* -->
<html>
  <head>
    <meta charset="UTF-8">
    <title>UseBean2</title>
  </head>
  
  <body style='font-size:1cm;color:blue'>
    <jsp:useBean id="obj" class="com.ted.User" />
    <jsp:setProperty name="obj" property="*" />

    Welcome,&nbsp;&nbsp;<jsp:getProperty name="obj" property="name" />
  </body>
</html> 
 