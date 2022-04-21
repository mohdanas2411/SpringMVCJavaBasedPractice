package com.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {



    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("login", "user", new User());
    }

    //load data from login form and set to User pojo
    @RequestMapping(value = "/userPage" , method = RequestMethod.POST)
    public ModelAndView showUser(@ModelAttribute("user") User user, BindingResult result, ModelAndView model) {

        if (result.hasErrors()){
            System.out.println("Error in biniding");
            model.setViewName("error");
            return model;
        }

        model.addObject("name",user.getName());
        model.addObject("email",user.getEmail());
        model.addObject("password",user.getPassword());
        model.setViewName("user");
        System.out.println(user.getEmail());
        return model;
    }
}
