package com.manager.server.service;

import com.manager.server.model.Weather;

public interface UpdateWeatherInterface {
    boolean updateByTime(Weather entity);
}
