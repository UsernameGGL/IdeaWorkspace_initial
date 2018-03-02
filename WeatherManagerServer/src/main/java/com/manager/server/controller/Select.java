package com.manager.server.controller;

import com.manager.server.model.Weather;
import com.manager.server.service.SelectWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Controller
@EnableAutoConfiguration
public class Select {
    @Autowired
    private SelectWeather select;

    @RequestMapping(value = "/select")
    public String select (Model model){
        System.out.println("***controller.Select*********************************");
        List<Weather> result = select.selectAll();
        if (result.isEmpty()){
            System.out.println("---result.isEmpty()-----------------------------");
            return "fail";
        }
        else {
            model.addAttribute("entity", result);
            System.out.println("---result.size--"+result.size()+"--------------------");
            return "list";
        }
    }

    @RequestMapping(value = "/testSelect")
    public void select (){
        Weather start = new Weather();
        Weather end= new Weather();
        start.setTime(new Date(1,1,1));
        end.setTime(new Date(20,1,1));
        this.select(null);
    }
}
