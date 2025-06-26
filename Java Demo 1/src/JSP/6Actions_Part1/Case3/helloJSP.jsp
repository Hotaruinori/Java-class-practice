<!-- ************* HelloJSP.jsp ************* -->
<%@ page contentType="text/html;charset=utf-8" %>

<html>
  <body>
    <jsp:useBean id="userInfo" scope="session" class="com.ted.UserInfoBean" />
    <p>從 servlet 傳入的 UserInfoBean.userName 是：
    <b>
      <jsp:getProperty name="userInfo" property="userName"/>
    </b>
  </body>
</html>
