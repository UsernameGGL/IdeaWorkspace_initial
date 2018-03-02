<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>



<!-- Head -->
<head>

    <title>Page for date choice</title>

    <!-- For-Mobile-Apps -->
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- //For-Mobile-Apps -->

    <!-- Style --> <link rel="stylesheet" href="css/style.css" type="text/css" media="all" />

    <!-- Web-Fonts -->
    <link href='//fonts.googleapis.com/css?family=Oxygen:400,300,700' rel='stylesheet' type='text/css'>
    <link href='//fonts.googleapis.com/css?family=Open+Sans:400,600,700' rel='stylesheet' type='text/css'>
    <link href='//fonts.googleapis.com/css?family=Raleway:100,200' rel='stylesheet' type='text/css'>
    <!-- //Web-Fonts -->



</head>
<!-- Head -->



<!-- Body -->
<body onload="startTime()">



<!-- Heading -->
<h1>QING DAO WEATHER WEBSITE</h1>
<!-- //Headng -->



<!-- Container -->
<div class="container">

    <!-- City -->
    <div class="city">
        <div class="title">
            <h2>Qing Dao City</h2>
            <h3>QING DAO</h3>
        </div>
        <div class="date-time">
            <div class="dmy">
                <div id="txt"></div>
                <div class="date">
                    <!-- Date-JavaScript -->
                    <script type="text/javascript">
                        var mydate=new Date()
                        var year=mydate.getYear()
                        if(year<1000)
                            year+=1900
                        var day=mydate.getDay()
                        var month=mydate.getMonth()
                        var daym=mydate.getDate()
                        if(daym<10)
                            daym="0"+daym
                        var dayarray=new Array("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
                        var montharray=new Array("January","February","March","April","May","June","July","August","September","October","November","December")
                        document.write(""+dayarray[day]+", "+montharray[month]+" "+daym+", "+year+"")
                    </script>
                    <!-- //Date-JavaScript -->
                </div>
            </div>
            <div class="temperature">
                <p>20°<span>C</span></p>
            </div>
            <div class="clear"></div>
        </div>
    </div>
    <!-- //City -->



    <!-- Forecast -->
    <div class="forecast">
        <form class="form-horizontal" action="" method="post"  style="padding-top: 60%;width: 250px;">
            <div class="col-sm-10">
                <input type="date" class="form-control">
            </div>\
            <div class="form-group" >
                <div class="col-sm-offset-2 col-sm-10" style="padding-left:0px;padding-top: 3%" >
                    <button type="submit" class="btn btn-default" style="width: 200px">查询</button>
                </div>
            </div>
        </form>
        <script type="text/javascript">

        </script>
    </div>
    <!-- //Forecast -->
    <div class="clear"></div>

</div>
<!-- //Container -->



<!-- Footer -->
<div class="footer">

    <!-- Copyright -->
    <div class="copyright">
        <p> Qing Dao Weather Website. G_G_L. 2017-2018 </p>
    </div>
    <!-- //Copyright -->

</div>
<!-- //Footer -->



<!-- Custom-JavaScript-Files -->

<!-- Time-JavaScript -->
<script>
    function startTime() {
        var today = new Date();
        var h = today.getHours();
        var m = today.getMinutes();
        var s = today.getSeconds();
        m = checkTime(m);
        s = checkTime(s);
        document.getElementById('txt').innerHTML =
            h + ":" + m + ":" + s;
        var t = setTimeout(startTime, 500);
    }
    function checkTime(i) {
        if (i < 10) {i = "0" + i}; // add zero in front of numbers < 10
        return i;
    }
</script>
<!-- //Time-JavaScript -->

<!-- //Custom-JavaScript-File-Links -->



</body>
<!-- //Body -->



</html>