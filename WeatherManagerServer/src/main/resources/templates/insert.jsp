<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE html>
<head>
    <title>插入数据</title>

    <!-- Animate.css -->
    <link rel="stylesheet" href="css2/animate.css">
    <!-- Icomoon Icon Fonts-->
    <link rel="stylesheet" href="css2/icomoon.css">
    <!-- Bootstrap  -->
    <link rel="stylesheet" href="css2/bootstrap.css">
    <!-- Superfish -->
    <link rel="stylesheet" href="css2/superfish.css">

    <link rel="stylesheet" href="css2/style.css">
</head>
<body background="/images/insert.jpg">

<div style="margin: 0 auto">
    <form class="form-horizontal" action="/insert.do" method="post">
        <div class="form-group" style="padding: 40px 180px 10px;">
            <div class="col-sm-10">
                <input type="date" class="form-control" id="name" placeholder="时间"></div>
        </div>


        <div class="form-group" style="padding: 5px 180px 10px;">
            <div class="col-sm-10">
                <input type="text" class="form-control" placeholder="天气"></div>
        </div>

        <div class="form-group" style="padding: 5px 180px 10px;">
            <div class="col-sm-10">
                <input type="number" class="form-control" placeholder="湿度"></div>
        </div>

        <div class="form-inline">
            <div class="col-sm-10 form-group" style="padding: 5px 208px 10px;width: 28%">
                <input type="number" class="form-control" placeholder="00:00最低温度">
            </div>
            <div class="col-sm-10 form-group" style="padding: 5px 40px 10px;width: 17%">
                <input type="number" class="form-control" placeholder="00:00最高温度">
            </div>
            <div class="col-sm-10 form-group" style="padding: 5px 40px 10px;width: 17%">
                <input type="number" class="form-control" placeholder="02:00最低温度">
            </div>
            <div class="col-sm-10 form-group" style="padding: 5px 40px 10px;width: 15%">
                <input type="number" class="form-control" placeholder="02:00最高温度">
            </div>
        </div>

        <div class="form-inline">
            <div class="col-sm-10 form-group" style="padding: 5px 208px 10px;width: 28%">
                <input type="number" class="form-control" placeholder="04:00最低温度">
            </div>
            <div class="col-sm-10 form-group" style="padding: 5px 40px 10px;width: 17%">
                <input type="number" class="form-control" placeholder="04:00最高温度">
            </div>
            <div class="col-sm-10 form-group" style="padding: 5px 40px 10px;width: 17%">
                <input type="number" class="form-control" placeholder="06:00最低温度">
            </div>
            <div class="col-sm-10 form-group" style="padding: 5px 40px 10px;width: 15%">
                <input type="number" class="form-control" placeholder="06:00最高温度">
            </div>
        </div>

        <div class="form-inline">
            <div class="col-sm-10 form-group" style="padding: 5px 208px 10px;width: 28%">
                <input type="number" class="form-control" placeholder="08:00最低温度">
            </div>
            <div class="col-sm-10 form-group" style="padding: 5px 40px 10px;width: 17%">
                <input type="number" class="form-control" placeholder="08:00最高温度">
            </div>
            <div class="col-sm-10 form-group" style="padding: 5px 40px 10px;width: 17%">
                <input type="number" class="form-control" placeholder="10:00最低温度">
            </div>
            <div class="col-sm-10 form-group" style="padding: 5px 40px 10px;width: 15%">
                <input type="number" class="form-control" placeholder="10:00最高温度">
            </div>
        </div>

        <div class="form-inline">
            <div class="col-sm-10 form-group" style="padding: 5px 208px 10px;width: 28%">
                <input type="number" class="form-control" placeholder="12:00最低温度">
            </div>
            <div class="col-sm-10 form-group" style="padding: 5px 40px 10px;width: 17%">
                <input type="number" class="form-control" placeholder="12:00最高温度">
            </div>
            <div class="col-sm-10 form-group" style="padding: 5px 40px 10px;width: 17%">
                <input type="number" class="form-control" placeholder="14:00最低温度">
            </div>
            <div class="col-sm-10 form-group" style="padding: 5px 40px 10px;width: 15%">
                <input type="number" class="form-control" placeholder="14:00最高温度">
            </div>
        </div>

        <div class="form-inline">
            <div class="col-sm-10 form-group" style="padding: 5px 208px 10px;width: 28%">
                <input type="number" class="form-control" placeholder="16:00最低温度">
            </div>
            <div class="col-sm-10 form-group" style="padding: 5px 40px 10px;width: 17%">
                <input type="number" class="form-control" placeholder="16:00最高温度">
            </div>
            <div class="col-sm-10 form-group" style="padding: 5px 40px 10px;width: 17%">
                <input type="number" class="form-control" placeholder="18:00最低温度">
            </div>
            <div class="col-sm-10 form-group" style="padding: 5px 40px 10px;width: 15%">
                <input type="number" class="form-control" placeholder="18:00最高温度">
            </div>
        </div>

        <div class="form-inline">
            <div class="col-sm-10 form-group" style="padding: 5px 208px 10px;width: 28%">
                <input type="number" class="form-control" placeholder="20:00最低温度">
            </div>
            <div class="col-sm-10 form-group" style="padding: 5px 40px 10px;width: 17%">
                <input type="number" class="form-control" placeholder="20:00最高温度">
            </div>
            <div class="col-sm-10 form-group" style="padding: 5px 40px 10px;width: 17%">
                <input type="number" class="form-control" placeholder="22:00最低温度">
            </div>
            <div class="col-sm-10 form-group" style="padding: 5px 40px 10px;width: 15%">
                <input type="number" class="form-control" placeholder="22:00最高温度">
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10" style="padding-left:380px;">
                <button type="submit" class="btn btn-default">插入</button>
            </div>
        </div>
    </form>
</div>

</body>
</html>