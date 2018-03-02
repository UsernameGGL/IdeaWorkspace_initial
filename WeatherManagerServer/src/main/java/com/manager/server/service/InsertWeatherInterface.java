package com.manager.server.service;

import com.manager.server.model.Weather;

public interface InsertWeatherInterface {
    boolean insertToTable(Weather entity);
}
