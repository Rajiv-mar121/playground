package com.spring.rest.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@Component
//@RequestMapping("/call")   ///hello.ds
public class MyAppController {

	@RequestMapping(value="/call" , method = RequestMethod.GET)
    public String sayHello(@RequestParam("name") String name, @RequestParam(value="name",
    		defaultValue="No Value") String name1,ModelMap model) throws Exception{
    	
    	System.out.println("Raj---> home rest page "+name+" --->"+name1);
    //	this.dbCheck();
        model.addAttribute("greeting"," " +name+" Hello World from Spring 4 MVC");
        return "success";
    }
	
	//http://www.journaldev.com/3358/spring-requestmapping-requestparam-pathvariable-example
	@RequestMapping(value="/login" , method = RequestMethod.GET)
	public void login(@RequestParam("loginName") String loginName)
	{
		System.out.println("Raj--->Login home rest page .."+loginName);
	}
	
	@RequestMapping(value="/register" , method = RequestMethod.GET)
	public void register(@RequestParam("register") String regis)
	{
		System.out.println("Raj--->Login home rest page .."+regis);
	}
}
