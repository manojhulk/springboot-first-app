package com.fullstack.springbootfirstapp.Controller;

import com.fullstack.springbootfirstapp.model.Cars;
import com.fullstack.springbootfirstapp.model.User;
import com.fullstack.springbootfirstapp.service.CarService;
import com.fullstack.springbootfirstapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;

@Controller
public class WelcomeController {
    @Autowired
    UserService userService;
    @Autowired
    CarService carService;
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String UserRegister(ModelMap map, @RequestParam String username, @RequestParam String user_mail, @RequestParam String pwd){
        User user=userService.getById(username);
        if(user.getPassword().equals(pwd) && user.getEmail().equals(user_mail) ){
            map.put("user_name",username);
            return "redirect:welcome";
        }
        map.put("errorMsg","Please provide correct credentials");
        return "login";
    }
    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    public String welcome(){
        return "welcome";
    }
    @RequestMapping(value = "/welcome",method = RequestMethod.POST)
    public ModelAndView carsAvailable(ModelAndView md,@RequestParam String start,@RequestParam String end,@RequestParam String model){
        LocalDate st_time=LocalDate.parse(start);
        LocalDate end_time=LocalDate.parse(end);
        List<Cars> cars=carService.getCars(st_time,end_time,model);
        md.addObject("CarsList",cars);
        md.setView(carsDetails);
        return md;
    }

}
