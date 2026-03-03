package com.example.simplewebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String Greet(){
        System.out.println("I'm here.");
        return "Welcome to Shri Shubham Marriage Bureau";
    }
    @RequestMapping("/about")
    public String about(){
    return"We don't make marriages, we build relations";
    }
}
