<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2020/04/13
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>参数绑定(Bean)</title>
</head>
<body>
    <h3>参数绑定</h3>
<%--    <a href="param/testParam?username=hello&password=world">参数绑定</a>
    <form action="param/saveAccount" method="post">
        姓名：<input type="text" name="username"> <br>
        密码：<input type="text" name="password"> <br>
        金额：<input type="text" name="money"> <br>
        用户姓名：<input type="text" name="user.uname"> <br>
        用户年龄：<input type="text" name="user.age"> <br>
        <input type="submit" name="提交"> <br>
    </form>
--%>

    <%-- 自定义类型转换器 --%>
    <form action="param/saveUser" method="post">
        用户姓名：<input type="text" name="uname"> <br>
        用户年龄：<input type="text" name="age"> <br>
        用户生日：<input type="text" name="date"> <br>
        <input type="submit" name="提交"> <br>
    </form>

    <br>

<%-- 传递request，response参数 --%>
    <a href="param/testServlet">测试ServletAPI</a>
</body>
</html>
