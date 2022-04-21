package com.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    @GetMapping("/home")
    public String showHome(@RequestParam String name, @RequestParam String password, Model model) {
        System.out.println(name);
        System.out.println(password);

        model.addAttribute("name",name);
        return "home";
    }

    @GetMapping("/form")
    public String showForm() {
        return "form";
    }


}
