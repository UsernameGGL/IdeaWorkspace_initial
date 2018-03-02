package com.manager.server.service;

import com.manager.server.mapper.WeatherMapper;
import com.manager.server.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteWeather implements DeleteWeatherInterface {
    @Autowired
    private WeatherMapper mapper;

    @Override
    public boolean deleteByTime(Weather entity) {
        System.out.println("***service.DeleteWeather*********************************");

        if (mapper.deleteByTime(entity.getTime())) {
            System.out.println("deleteByTime successful");
            return true;
        }
        else {
            System.out.println("deleteByTime failed");
            return false;
        }
    }
}
