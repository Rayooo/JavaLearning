<%--
  Created by IntelliJ IDEA.
  User: Ray
  Date: 2017/2/20
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息采集</title>
</head>
<body>

    <form method="post" action="user.action">
        用户名:<input type="text" name="userName">
        地址:<input type="text" name="address">
        电话:<input type="text" name="telephone">
        邮箱:<input type="text" name="email">
        <input type="submit" value="提交">
    </form>

</body>
</html>
