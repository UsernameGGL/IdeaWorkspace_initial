package com.manager.server.service;

import com.manager.server.mapper.WeatherMapper;
import com.manager.server.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertWeather implements InsertWeatherInterface {
    @Autowired
    private WeatherMapper mapper;

    @Override
    public boolean insertToTable(Weather entity) {
        System.out.println("***service.InsertWeather*********************************");

        if (mapper.insertToTable(entity.convertToWeatherEntity())) {
            System.out.println("insertToTable successful");
            return true;
        }
        else {
            System.out.println("insertToTable failed");
            return false;
        }
    }
}
