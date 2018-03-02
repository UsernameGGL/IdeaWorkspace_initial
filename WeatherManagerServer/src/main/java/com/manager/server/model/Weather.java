package com.manager.server.model;

import java.sql.Date;

public class Weather {
    private Date time;
    private int weather;
    private int humidity;
    private Temperature mintemp;
    private Temperature maxtemp;

    /** 无参数的构造方法。*/
    public Weather(){
        time = new Date(2017,11,11);
        weather = 0;
        humidity = 0;
        mintemp = new Temperature();
        maxtemp = new Temperature();
    }

    /** 利用WeatherEntity的实例来创建Weather实例。
     * @param entity
     */
    public Weather(WeatherEntity entity) {
        time = entity.getTime();
        weather = entity.getWeather();
        humidity = entity.getHumidity();
        mintemp = new Temperature(convertToInt(entity.getMintemp()));
        maxtemp = new Temperature(convertToInt(entity.getMaxtemp()));
    }

    /** 将Weather对象转化成WeatherEntity对象
     * @return
     */
    public WeatherEntity convertToWeatherEntity() {
        WeatherEntity entity = new WeatherEntity();

        entity.setTime(time);
        entity.setWeather(weather);
        entity.setHumidity(humidity);
        entity.setMintemp(mintemp.toString());
        entity.setMaxtemp(maxtemp.toString());

        return entity;
    }

    /** 将WeatherEntity中表示温度的字符串转换成int型数组。
     * @param str
     * @return
     */
    private int[] convertToInt(String str){
        int[] intArray = new int[12];
        for(int i=0;i<12;i++)
            intArray[i] = Integer.parseInt(str.substring(i*3, (i+1)*3));
        return intArray;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getWeather() {
        return weather;
    }

    public void setWeather(int weather) {
        this.weather = weather;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public Temperature getMintemp() {
        return mintemp;
    }

    public void setMintemp(Temperature mintemp) {
        this.mintemp = mintemp;
    }

    public Temperature getMaxtemp() {
        return maxtemp;
    }

    public void setMaxtemp(Temperature maxtemp) {
        this.maxtemp = maxtemp;
    }
}
