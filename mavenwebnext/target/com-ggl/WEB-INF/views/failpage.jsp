<%--
  Created by IntelliJ IDEA.
  User: 12515
  Date: 2017/12/5
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <title>注册失败</title>
</head>
<body>
<div class="text-center text-info">
    <p>注册失败</p>
    <p>用户名是：${user.name}</p>
    <p>手机号为：${user.phone}</p>
    <p>此用户名已存在，请尝试新的用户名</p>
</div>
</body>
</html>
