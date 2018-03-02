package com.manager.server.service;

import com.manager.server.mapper.WeatherMapper;
import com.manager.server.model.Weather;
import com.manager.server.model.WeatherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SelectWeather implements SelectWeatherInterface{
    @Autowired
    private WeatherMapper mapper;

    @Override
    public List<Weather> selectAll() {
        System.out.println("***service.SelectWeather*********************************");

        List<Weather> list = new ArrayList<Weather>();
        List<WeatherEntity> listEntity = mapper.selectAll();
        for (int i = 0; i < listEntity.size(); i++) {
            list.add(new Weather(listEntity.get(i)));
        }
        return list;
    }
}
