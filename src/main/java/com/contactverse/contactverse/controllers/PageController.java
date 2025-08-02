package com.contactverse.contactverse.controllers;

import jakarta.servlet.ServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

//  about route

    @RequestMapping("/about")
    public String aboutPage() {
        System.out.println("About is loading");
        return "about";
    }

//     Services

    @RequestMapping("/services")
    public String servicePage() {
        System.out.println("Service page is loading");
        return "services";
    }
//contact
    @RequestMapping("/contact")
    public String contactPage() {
        System.out.println("Contact page is loading");
        return "contact";
    }
//login
    @RequestMapping("/login")
    public String loginPage() {
        System.out.println("Login page is loading");
        return "login";
    }

    @RequestMapping(value = "/register" )
    public String registerPage() {
        System.out.println("Register page is loading");
        return "register";
    }

    @RequestMapping(value="/do-register"  ,  method= RequestMethod.POST)
    public String processRegister() {
//        Fetch form data
//        validate data
//        save data to database
        // message rs
//
        return " redirect:/register" ;
    }
}
