<%--
  Created by IntelliJ IDEA.
  User: 12515
  Date: 2017/12/5
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>


<html>
<head>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <title>恭喜，注册成功！</title>
</head>
<body>
    <div class="text-center text-info">
        <p>恭喜！注册成功！</p>
        <p>用户名是：${user.name}</p>
        <p>手机号为：${user.phone}</p>
    </div>
</body>
</html>
