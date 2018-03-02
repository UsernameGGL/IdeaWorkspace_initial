package com.example.demo.test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin
@Controller
public class ResBody {

    @RequestMapping("/")
    @ResponseBody
    public BikeType reBody(){
        BikeType bikeType=new BikeType();
        return bikeType;
    }
}
