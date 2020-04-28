package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    @RequestMapping("/")
    public String homePage() {
    	System.out.println("TEst Controller");
      return "welcome";
    }
    
    @RequestMapping("/get")
    public String homeGetPage() {
    	System.out.println("TEst get Controller");
      return "welcome";
    }

}