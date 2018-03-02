<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%--<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

    <!-- Style --> 
    <link rel="stylesheet" href="css/style.css" type="text/css" media="all" />

    <!-- Web-Fonts -->
    <link href='//fonts.googleapis.com/css?family=Oxygen:400,300,700' rel='stylesheet' type='text/css'>
    <link href='//fonts.googleapis.com/css?family=Open+Sans:400,600,700' rel='stylesheet' type='text/css'>
    <link href='//fonts.googleapis.com/css?family=Raleway:100,200' rel='stylesheet' type='text/css'>
    <!-- //Web-Fonts -->

</head>
<!-- Head -->



<!-- Body -->
<body onload="startTime()" >

<script src="code/highcharts.js"></script>
<script src="code/series-label.js"></script>
<script src="code/exporting.js"></script>




    <!-- Heading -->
    <h1>天气预报-青岛</h1>
    <!-- //Headng -->




    <div class="forecast-icon" id="icon">
        
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
                <h2>青岛市</h2>
                <h3>青岛</h3>
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
                            var month='${date.getMonth()}'
                            var daym='${date.getDate()}'
                            if(daym<10)
                                daym="0"+daym
                            var dayarray=new Array("周日","周一","周二","周三","周四","周五","周六")
                            var montharray=new Array("1月","2月","3月","4月","5月","6月","7月","8月","9月","10月","11月","12月")
                            document.write(""+dayarray[day]+", "+montharray[month]+" "+daym+", "+year+"")
                        </script>
                        <!-- //Date-JavaScript -->
                    </div>
                </div>
                <div class="temperature">
                    <p>${weather.getHumidity()}</p>
                </div>
                <div class="clear"></div>
            </div>

        </div>
        <!-- //City -->






 						<%-- <c:forEach items="${temp}" var="b">
					      	<li id="li_1">00:00 <span> ${b}°C</span></li>
					    </c:forEach> --%>
        <!-- Forecast -->
        <div class="forecast">
            <div class="today-weather">
                <ul>
                	<c:if test="${empty temp }">
    					<li id="li_0">没有天气数据</li>
  					</c:if>
  					<c:if test="${not empty temp }">
  						<li id="li_1">00:00 <span> ${temp[0]}°C</span></li>
	                    <li id="li_2">02:00 <span> ${temp[1]}°C</span></li>
	                    <li id="li_3">04:00 <span> ${temp[2]}°C</span></li>
	                    <li id="li_4">06:00 <span> ${temp[3]}°C</span></li>
	                    <li id="li_5">08:00 <span> ${temp[4]}°C</span></li>
	                    <li id="li_6">10:00 <span> ${temp[5]}°C</span></li>
	                    <li id="li_7">12:00 <span> ${temp[6]}°C</span></li>
	                    <li id="li_8">14:00 <span> ${temp[7]}°C</span></li>
	                    <li id="li_9">16:00 <span> ${temp[8]}°C</span></li>
	                    <li id="li_10">18:00 <span> ${temp[9]}°C</span></li>
	                    <li id="li_11">20:00 <span> ${temp[10]}°C</span></li>
	                    <li id="li_12">22:00 <span> ${temp[11]}°C</span></li>
  					</c:if>   
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
	var lowS=['${temp[0]}','${temp[1]}','${temp[2]}','${temp[3]}','${temp[4]}','${temp[5]}','${temp[6]}','${temp[7]}','${temp[8]}','${temp[9]}','${temp[10]}','${temp[11]}'];
	var low=[];
	for(var i in lowS){
		low[i]=parseInt(lowS[i]);
	}
	var highS=['${temp_h[0]}','${temp_h[1]}','${temp_h[2]}','${temp_h[3]}','${temp_h[4]}','${temp_h[5]}','${temp_h[6]}','${temp_h[7]}','${temp_h[8]}','${temp_h[9]}','${temp_h[10]}','${temp_h[11]}'];
	var high=[];
	for(var i in highS){
		high[i]=parseInt(highS[i]);
	}
	var DATA=[{
            name: '低温预测',
            data: low
        },
        {
            name: '高温预测',
            data: high
        }];

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

        series: DATA,

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
		var index='${weather.weather}';
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
        document.getElementById('weather').innerHTML=weather[index];
        
        var icon="http://domainforggl.xin:8080/icon/";
        if(index<10)
        	icon+="0"+index;
        else
        	icon+=index;
        icon+='.png';
        document.getElementById('icon').innerHTML='<img src="'+icon+'" alt="QINGDAO WEATHER">';
    }
</script>

<!-- <div style="width: 100%;height: 1000px;padding-top: 11%" >-->
<div style="float: left;width: 100%;height: 100%;position: absolute;opacity: 0.7;padding-top: 13.7%">
    <iframe src="http://domainforggl.xin:8080/music.html" width="100%" height="900px" align="center" scrolling="auto" frameborder="0" allowTransparency="true" />
</div>

</body>
<!-- //Body -->




</html>