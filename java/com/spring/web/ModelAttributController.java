package com.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;

@Controller
public class ModelAttributController {

    @GetMapping(value = "/render")
    public String renderDa(Model model){
        HashMap<String , String > map = new HashMap<>();
       // ModelAndView mv = new ModelAndView();
        map.put("name","Anas");
        String pass = "123456";
        map.put("password",pass);
//        mv.addObject("year","2022");
//        mv.addObject(map);
//        mv.setViewName("renderData");
        model.addAttribute("year","2021");
        model.mergeAttributes(map);
        return "renderData";
    }
}
