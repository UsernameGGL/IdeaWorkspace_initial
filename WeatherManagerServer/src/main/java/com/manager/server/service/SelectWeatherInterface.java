package com.manager.server.service;

import com.manager.server.model.Weather;

import java.util.List;

public interface SelectWeatherInterface {
    List<Weather> selectAll();
}
