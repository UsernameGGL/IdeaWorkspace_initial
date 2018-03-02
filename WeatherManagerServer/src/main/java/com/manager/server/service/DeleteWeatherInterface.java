package com.manager.server.service;

import com.manager.server.model.Weather;

public interface DeleteWeatherInterface {
    boolean deleteByTime(Weather entity);
}
