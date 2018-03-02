<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>



<!-- Head -->
<head>

    <style type="text/css">
        #container {
            min-width: 310px;
            max-width: 800px;
            height: 400px;
            margin: 0 auto
        }
    </style>

    <title>QING DAO WEBSITE</title>


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

<script src="code/highcharts.js"></script>
<script src="code/series-label.js"></script>
<script src="code/exporting.js"></script>




    <!-- Heading -->
    <h1>QING DAO WEATHER WEBSITE</h1>
    <!-- //Headng -->




    <div class="forecast-icon">
        <img src="images/forecast.png" alt="New York Weather Widget">
    </div>

<!-- <div style="float: left;width: 100%;height: 100%;position: absolute;opacity: 0.85">-->
<div style="width: 100%;height: 1000px;position: absolute;">
    <div class="today-weather">
        <h3 id="weather"></h3>
    </div>
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
            <div class="today-weather">
                <ul>
                    <li id="li_1">00:00 <span> 22°C</span></li>
                    <li id="li_2">02:00 <span> 24°C</span></li>
                    <li id="li_3">04:00 <span> 23°C</span></li>
                    <li id="li_4">06:00 <span> 20°C</span></li>
                    <li id="li_5">08:00 <span> 21°C</span></li>
                    <li id="li_6">10:00 <span> 25°C</span></li>
                    <li id="li_7">12:00 <span> 26°C</span></li>
                    <li id="li_8">14:00 <span> 27°C</span></li>
                    <li id="li_9">16:00 <span> 26°C</span></li>
                    <li id="li_10">18:00 <span> 24°C</span></li>
                    <li id="li_11">20:00 <span> 23°C</span></li>
                    <li id="li_12">22:00 <span> 21°C</span></li>
                </ul>
            </div>
            <script type="text/javascript">

            </script>
        </div>
        <!-- //Forecast -->
        <div class="clear"></div>
        <div id="container"></div>

    </div>
    <!-- //Container -->



    <div class="today-weather">
        <h3></h3>
    </div>






    <!-- Footer -->
    <div class="footer">

        <!-- Copyright -->
        <div class="copyright">
            <p> Qing Dao Weather Website. G_G_L. 2017-2018</p>
        </div>
        <!-- //Copyright -->

    </div>
    <!-- //Footer -->



    <!-- Custom-JavaScript-Files -->

    <!-- Time-JavaScript -->
    <script type="text/javascript">
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
</div>


<script type="text/javascript">

    Highcharts.chart('container', {

        title: {
            text: 'Temperature trend in this day'
        },

        subtitle: {
            text: 'Design and made by G_G_L'
        },
        xAxis:{
            title: {
                text: 'Time'
            },
            labels:{
                formatter:function(){
                    var arr = [];
                    arr[0]   = '00:00';
                    arr[1]  = '02:00';
                    arr[2] = '04:00';
                    arr[3] = '06:00';
                    arr[4] = '08:00';
                    arr[5] = '10:00';
                    arr[6] = '12:00';
                    arr[7] = '14:00';
                    arr[8] = '16:00';
                    arr[9] = '18:00';
                    arr[10] = '20:00';
                    arr[11] = '22:00';
                    return arr[this.value];
                }
            },
        },

        yAxis: {
            title: {
                text: 'Temperature'
            }
        },
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'middle'
        },

        plotOptions: {
            series: {
                label: {
                    connectorAllowed: false
                }
            }
        },

        series: [{
            name: 'Installation',
            data: [43934, 52503, 57177, 69658, 97031, 119931, 137133, 154175,43934, 52503, 57177,137133]
        }],

        responsive: {
            rules: [{
                condition: {
                    maxWidth: 500
                },
                chartOptions: {
                    legend: {
                        layout: 'horizontal',
                        align: 'center',
                        verticalAlign: 'bottom'
                    }
                }
            }]
        }

    });

    window.onload=function () {
        var weather=new Array();
        weather[0]='晴';
        weather[1]='多云';
        weather[2]='阴';
        weather[3]='雷阵雨';
        weather[4]='雨夹雪';
        weather[5]='小雨';
        weather[6]='中雨';
        weather[7]='大雨';
        weather[8]='暴雨';
        weather[9]='小雪';
        weather[10]='大雪';
        weather[11]='雾';
        weather[12]='霾';
        document.getElementById('weather').innerHTML=weather[0];
    }
</script>

<!-- <div style="width: 100%;height: 1000px;padding-top: 11%" >-->
<div style="float: left;width: 100%;height: 100%;position: absolute;opacity: 1;padding-top: 13%">
    <iframe src="http://domainforggl.xin:8080/music.html" width="100%" height="900px" align="center" scrolling="auto" frameborder="0" allowTransparency="true" />
</div>
<!--http://domainforggl.xin:8080/music.html-->
</body>
<!-- //Body -->




</html>