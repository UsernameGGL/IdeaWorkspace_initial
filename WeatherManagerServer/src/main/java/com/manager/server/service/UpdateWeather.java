package com.manager.server.service;

import com.manager.server.mapper.WeatherMapper;
import com.manager.server.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateWeather implements UpdateWeatherInterface {
    @Autowired
    private WeatherMapper mapper;

    @Override
    public boolean updateByTime(Weather entity) {
        System.out.println("***service.UpdateWeather*********************************");

        if (mapper.updateByTime(entity.convertToWeatherEntity())){
            System.out.println("updateByTime successful");
            return true;
        }
        else {
            System.out.println("updateByTime failed");
            return false;
        }
    }
}
