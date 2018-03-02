package controller;

import domain.RegisterCheck;
import domain.Shuzu;
import entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/*@CrossOrigin("*")
@RequestMapping("/reg")*/
@Controller
public class RegController {
    @Autowired
    private RegisterCheck registerCheck;


    @RequestMapping(value = "/register")
    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW )//无用
    //@RequestParam不会为我们自动封装对象
    public String register(String none, String name, UserEntity userEntity, Shuzu shuzu, Model model){
        System.out.println(name);
        System.out.println(userEntity.getName());
        System.out.println(none);
        System.out.println(userEntity.getGender());
        for (int i:
             shuzu.getShuzu()) {
            System.out.println("000"+i);
        }


        //ModelAndView的简略用法
        model.addAttribute("user",userEntity);
        //返回一个字符串供spring解析得到页面，用法类似于struts
        if(registerCheck.checkAndSave(userEntity))
            return "succpage";
        return "failpage";
    }

}





