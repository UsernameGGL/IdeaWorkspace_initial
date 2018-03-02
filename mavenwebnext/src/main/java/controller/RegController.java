package controller;

import domain.RegisterCheck;
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


    private String hhh;


    @RequestMapping(value = "/register")
    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW )//无用
    //@RequestParam不会为我们自动封装对象
    public String register(String none,String name,UserEntity userEntity, Model model){
        System.out.println(name);
        System.out.println(userEntity.getName());
        System.out.println(none);

        //ModelAndView的简略用法
        model.addAttribute("user",userEntity);
        //返回一个字符串供spring解析得到页面，用法类似于struts
        if(registerCheck.checkAndSave(userEntity))
            return "succpage";
        return "failpage";
    }

}







/* @RequestMapping(value = "/registe.do",method = RequestMethod.POST)
    public ModelAndView registe(@ModelAttribute("name") String username,
                          @ModelAttribute("password")String password,
                          @ModelAttribute("gender")String mail,
                          @ModelAttribute("phone")String phone){
        User user = new User();
        System.out.println(username+","+password+","+mail);
        user.setGender(mail);
        user.setPassword(password);
        user.setName(username);
        user.setPhone(phone);
        Map<String , String> map = new HashMap<String, String>();
        map.put("name",user.getName());
        map.put("phone",user.getPhone());
        map.put("password",user.getPassword());
       System.out.println(user.toString());
        System.out.println(user.getPassword()==null||user.getPhone()==null||user.getGender()==null||user.getName()==null||user.getPhone().length()!=11||user.getPassword().length()!=6);
        if(user.getPassword()==null||user.getPhone()==null||user.getGender()==null||user.getName()==null||user.getPhone().length()!=11||user.getPassword().length()!=6){
            ModelAndView modelAndView= new ModelAndView("failpage");
            modelAndView.addObject("user",map);
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("succpage");

        System.out.println(map.get("name")+"12");
        modelAndView.addObject("user",map);
        return modelAndView;
    }*/