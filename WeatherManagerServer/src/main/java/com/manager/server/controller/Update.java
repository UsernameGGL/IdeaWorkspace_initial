package com.manager.server.controller;

import com.manager.server.model.Weather;
import com.manager.server.service.UpdateWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;

@Controller
@EnableAutoConfiguration
public class Update {
    @Autowired
    private UpdateWeather update;

    @RequestMapping(value = "/update")
    public String update (Weather entity){
        System.out.println("***controller.Update*********************************");
        if (update.updateByTime(entity)){
            return "successUpdate";
        }
        else {
            return "fail";
        }
    }

    @RequestMapping(value = "/testUpdate")
    public void test() {
        Weather entity = new Weather();
        entity.setTime(new Date(10,1,1));
        entity.setHumidity(30);
        entity.setWeather(5);
        this.update(entity);
    }
}
