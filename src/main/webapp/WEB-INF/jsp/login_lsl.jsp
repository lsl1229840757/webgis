<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>lsl登录页面</title>
</head>
<body>
    这是一个登录界面
    <form action="${pageContext.request.contextPath}/login/login_lsl.action" method="post">
        用户名:<input type="text" name="username" id="username"><br>
        密码:<input type="password" name="password" id="password"><br>
        <input value="提交" type="submit"><br>
        <input value="重置" type="reset"><br>
    </form>
</body>
</html>
