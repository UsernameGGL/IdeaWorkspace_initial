package com.manager.server.controller;

import com.manager.server.model.Weather;
import com.manager.server.service.DeleteWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;

@Controller
@EnableAutoConfiguration
public class Delete {
    @Autowired
    private DeleteWeather delete;

    @RequestMapping(value = "/delete")
    public String delete (Weather entity) {
        System.out.println("***controller.Delete*********************************");
        if (delete.deleteByTime(entity)) {
            return "successDelete";
        } else {
            return "fail";
        }
    }

    @RequestMapping(value = "/testDelete")
    public void select (){
        Weather entity = new Weather();
        entity.setTime(new Date(10,1,1));
        this.delete(entity);
    }
}
