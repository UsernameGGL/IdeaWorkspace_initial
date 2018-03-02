package entity;

import java.sql.Date;

public class WeatherEntity {
    private Date time;
    private Integer weather;
    private Integer humidity;
    private String mintemp;
    private String maxtemp;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }


    public Integer getWeather() {
        return weather;
    }

    public void setWeather(Integer weather) {
        this.weather = weather;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WeatherEntity that = (WeatherEntity) o;

        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (weather != null ? !weather.equals(that.weather) : that.weather != null) return false;
        if (humidity != null ? !humidity.equals(that.humidity) : that.humidity != null) return false;
        if (mintemp != null ? !mintemp.equals(that.mintemp) : that.mintemp != null) return false;
        if (maxtemp != null ? !maxtemp.equals(that.maxtemp) : that.maxtemp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = time != null ? time.hashCode() : 0;
        result = 31 * result + (weather != null ? weather.hashCode() : 0);
        result = 31 * result + (humidity != null ? humidity.hashCode() : 0);
        result = 31 * result + (mintemp != null ? mintemp.hashCode() : 0);
        result = 31 * result + (maxtemp != null ? maxtemp.hashCode() : 0);
        return result;
    }
}
