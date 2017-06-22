package com.spring.rest.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class MyAppInitailizer implements WebApplicationInitializer{

    public void onStartup(ServletContext container) throws ServletException {
    	 
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(MyAppConfiguration.class);
        ctx.setServletContext(container);
 
        ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));
 
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/login");
        servlet.addMapping("/register");
        servlet.addMapping("/displaylist");
        servlet.addMapping("/call");
     //   servlet.addMapping("/hello.ds");
     //   servlet.addMapping("/");
    }
}
