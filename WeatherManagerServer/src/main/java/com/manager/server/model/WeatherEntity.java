package com.manager.server.model;

import java.sql.Date;

public class WeatherEntity {
    private Date time;
    private int weather;
    private int humidity;
    private String mintemp;
    private String maxtemp;

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

    public String getMintemp() {
        return mintemp;
    }

    public void setMintemp(String mintemp) {
        this.mintemp = mintemp;
    }

    public String getMaxtemp() {
        return maxtemp;
    }

    public void setMaxtemp(String maxtemp) {
        this.maxtemp = maxtemp;
    }

    @Override
    public String toString() {
        String str = "";
        str += time.toString();
        str += String.format("%02d",weather);
        str += String.format("%03d",humidity);
        str += mintemp;
        str += maxtemp;
        return str;
    }
}
