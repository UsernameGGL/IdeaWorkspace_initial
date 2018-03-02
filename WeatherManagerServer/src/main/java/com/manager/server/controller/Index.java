package com.manager.server.controller;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin
@Controller
@EnableAutoConfiguration
public class Index {
    @RequestMapping(value = "/")
    @ResponseBody
    public String index(){
        System.out.println("-------123253---");
        return "innnn";
    }
}
