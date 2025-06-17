package com.contactverse.contactverse.controllers;

import jakarta.servlet.ServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model, ServletRequest servletRequest){
        System.out.println("home page hamdler");
        model.addAttribute("name" ,"Substring Tech ");
        model.addAttribute("age" ,18);
        model.addAttribute("GithubRepo","https://github.com/monudhakad1/contactverse");
        return "HomePage";
    }
}
