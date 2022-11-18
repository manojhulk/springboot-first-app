package com.fullstack.springbootfirstapp.Controller;

import com.fullstack.springbootfirstapp.model.Bookings;
import com.fullstack.springbootfirstapp.model.Cars;
import com.fullstack.springbootfirstapp.model.User;
import com.fullstack.springbootfirstapp.service.BookingsService;
import com.fullstack.springbootfirstapp.service.CarService;
import com.fullstack.springbootfirstapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Controller
public class WelcomeController {
    @Autowired
    BookingsService bookingsService;
    @Autowired
    UserService userService;
    @Autowired
    CarService carService;
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String userRegister(ModelMap map, @RequestParam String username, @RequestParam String user_mail, @RequestParam String pwd){
        User user=userService.getById(username);
        if(user.getPassword().equals(pwd) && user.getEmail().equals(user_mail) ){
            map.addAttribute("user_name",username);
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
    public ModelAndView carsAvailable(@RequestParam String start,@RequestParam String end,@RequestParam String model){
        ModelAndView md = new ModelAndView();
        LocalDate st_time=LocalDate.parse(start);
        LocalDate end_time=LocalDate.parse(end);
        List<Cars> cars=carService.getCars(st_time,end_time,model);
        md.addObject("model",model);
        if(!cars.isEmpty()){
            md.addObject("users",cars);
            md.setViewName("CarDetails");
            return md;
        }
        md.addObject("errorMsg","No Cars Available");
        return md;
    }
    @RequestMapping(value = "/filter",method = RequestMethod.POST)
    public ModelAndView carsAvailableFilter(@RequestParam int amount,@RequestParam String type,@RequestParam String model){
        ModelAndView md = new ModelAndView();
        List<Cars> cars=carService.getCarsByOrder(amount, type,model);
        md.addObject("users",cars);
        md.setViewName("CarDetails");
        return md;
    }
    @RequestMapping(value = "/booking",method = RequestMethod.GET)
    public String book(){
        return "booking";
    }
    @RequestMapping(value = "/booking",method = RequestMethod.POST)
    public String bookingConform(ModelMap mp,@RequestParam String uname,@RequestParam String veh,@RequestParam String stn,@RequestParam String rtn){
        String num= String.valueOf(Math.abs(LocalDateTime.now().hashCode()));
        String registerId = "FLY" + num;
        mp.addAttribute("bookId",registerId);
        LocalDate start=LocalDate.parse(stn);// start date parsing
        LocalDate end=LocalDate.parse(rtn);//Return date parsing
        bookingsService.saveData(registerId,uname,veh,start,end);
        carService.updateCar(veh,start,end);
        return "final";
    }
    @RequestMapping(value = "/details",method = RequestMethod.POST)
    public ModelAndView bookingDetails(@RequestParam String personId){
        ModelAndView move = new ModelAndView();
        Bookings bks=bookingsService.getByNum(personId);
        move.addObject("owner",bks);
        move.setViewName("details");
        return move;
    }
}
