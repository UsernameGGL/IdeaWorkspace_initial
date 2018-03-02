<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/base.css"/>
    <link rel="stylesheet" type="text/css" href="css/home.css"/>
</head>
<body>
<div class="">
    <!--在默认情况下form的enctype(编码方式)是application/x-www-form-urlencoded，而之前强制定义为了multipart/form-data，因为编码不同所以无法传递数据，引入multipartResolver编码解析器后可以了，但默认情况下不需要解码 -->
    <form class="registForm" method="post"
          name="reg" id="reg" action="/register.do">
        <ul class="login-items">
            <li class="clearfix">
                <input class="input" name="phone" id="phone" type="text" value=""
                       placeholder="手机号码（登录帐号）">
            </li>
            <li class="clearfix">
                <input class="input" type="text" value="" name="name" placeholder="姓名" id="name">
            </li>
            <li class="clearfix sex" >
                <input type="radio" checked="" name="gender" value="M" id="gender" />
                男&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="radio" name="gender" value="F"/>
                女
            </li>
            <li class="clearfix">
                <input id="password" class="input" type="password" name="password" value=""
                       placeholder="输入密码（六位字符）">
            </li>
            <li class="clearfix">
                <input  class="input" type="password" name="shuzu[0]" value=""
                       placeholder="shuzu0">
            </li>
            <li class="clearfix">
                <input class="input" type="password" name="shuzu[1]" value=""
                       placeholder="shuzu1">
            </li>
            <li class="clearfix">
                <input class="input" type="password" name="shuzu[2]" value=""
                       placeholder="shuzu1">
            </li>
            <li class="clearfix">
                <input class="input" type="password" name="shuzu[3]" value=""
                       placeholder="shuzu1">
            </li>
        </ul>
        <div class="login-button">
            <input type="submit" value="立即注册" class="fM"/>
        </div>
        <!---校验-->

    </form>
</div>
</body>
</html>
