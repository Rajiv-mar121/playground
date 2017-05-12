package com.websystique.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/hello.ds")   //hello.ds
public class HelloWorldController {
 
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
    	System.out.println("Raj---> home page");
        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
        return "success";
    }
 
    @RequestMapping(value = "/helloagain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
    	System.out.println("Raj---> hello again page");
        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
        return "welcome";
    }
 
}


/*Download the following jars and add it to your WEB-INF/lib directory:

jsp-api-2.0.jar
jstl-1.2.jar*/