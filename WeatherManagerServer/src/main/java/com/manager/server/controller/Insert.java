package com.manager.server.controller;

import com.manager.server.model.Weather;
import com.manager.server.service.InsertWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;

@Controller
@EnableAutoConfiguration
public class Insert {
    @Autowired
    private InsertWeather insert;

    @RequestMapping(value = "/insert")
    public String insert (Weather entity){
        System.out.println("***controller.Insert*********************************");
        if (insert.insertToTable(entity)){
            return "successInsert";
        }
        else {
            return "fail";
        }
    }

    @RequestMapping(value = "/testInsert")
    public void test(){
        Weather entity = new Weather();
        entity.setTime(new Date(10,1,1));
        entity.setHumidity(20);
        entity.setWeather(5);
        this.insert(entity);
    }
}
