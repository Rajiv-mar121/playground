package com.websystique.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.websystique.springmvc.repository.DataSourceConfiguration;
 
@Controller
@RequestMapping("/hello.ds")   //hello.ds
public class HelloWorldController {
	
	@Autowired
	DataSourceConfiguration ds;
	
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(@RequestParam("name") String name, @RequestParam(value="name",
    		defaultValue="No Value") String name1,ModelMap model) throws Exception{
    	
    	System.out.println("Raj---> home page "+name+" --->"+name1);
    	this.dbCheck();
        model.addAttribute("greeting"," " +name+" Hello World from Spring 4 MVC");
        return "success";
    }
 
    public void dbCheck() throws Exception
    {
    	//DataSource con=(DataSource)ds.dataSource().getConnection();
    	System.out.println("Raj--->DS: "+ds.dataSource().getConnection());
    	Connection co=ds.dataSource().getConnection();
    	
    	String query="select * from register";
    	Statement st=co.createStatement();
    	ResultSet rs=st.executeQuery(query);
 	
    	while(rs.next())
    	{
    		System.out.println(rs.getString(1));
    		System.out.println(rs.getInt(2));
    		System.out.println(rs.getString(3));
    	}
    }
    
    @RequestMapping(value = "/helloagain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
    	System.out.println("Raj---> hello again page");
        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
        return "welcome";
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(ModelMap model) {
    	System.out.println("Raj---> Register page");
        model.addAttribute("greeting", "Hello World Again, Register from Spring 4 MVC");
        return "welcome";
    }
 
}

/*3 way in which data can be passed.
 Query parameters
 Form parameters
 Path variables*/

//Example of query parameters
// @RequestParam("name") String name --> here name is coming from form index.jsp
// @RequestParam(value="name",defaultValue="No Value") --> you can use default value if name is not pass from form.











/*Download the following jars and add it to your WEB-INF/lib directory:

jsp-api-2.0.jar
jstl-1.2.jar*/