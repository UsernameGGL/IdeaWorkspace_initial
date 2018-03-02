package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@CrossOrigin
@Controller
public class ResBody {

    @RequestMapping(value = "/resBody")
    @ResponseBody
    public String resBody(){
        return "success";
    }
}
