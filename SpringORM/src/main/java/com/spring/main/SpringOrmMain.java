package com.spring.main;

import java.util.Arrays;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.spring.dbprop.DatabaseDrivenMessageSource;
import com.spring.model.MessageResource;
import com.spring.model.Product;
import com.spring.service.MessageService;
import com.spring.service.ProductService;



public class SpringOrmMain {
	
	public static void main(String[] args) {
		
		//Create Spring application context
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring.xml");
		
		//Get service from context. (service's dependency (ProductDAO) is autowired in ProductService)
		ProductService productService = ctx.getBean(ProductService.class);
		MessageService message = ctx.getBean(MessageService.class);
		MessageSource r=(MessageSource)ctx.getBean("propertiesMessageSource");
		//Do some data operation
		System.out.println("Reading Proprty "+r.getMessage("greeting", null,"D Greet",null));
		productService.add(new Product(1, "Bulb"));
		productService.add(new Product(2, "Dijone mustard"));
		
		message.add(new MessageResource(1,"Greeting","Hello Rajiv","us"));
		
		System.out.println("listAll: " + productService.listAll());
		System.out.println("listAll Messgae: " + message.listAll());
		//Test transaction rollback (duplicated key)
		
		try {
			productService.addAll(Arrays.asList(new Product(3, "Book"), new Product(4, "Soap"), new Product(1, "Computer")));
		} catch (DataAccessException dataAccessException) {
		}
		
		//Test element list after rollback
		System.out.println("listAll: " + productService.listAll());
		
		//////////// DB implementation
		
		DatabaseDrivenMessageSource DBmessage = ctx.getBean(DatabaseDrivenMessageSource.class);
		System.out.println("Reading From DB ="+ctx.getMessage("greeting", null,null));
		
		ctx.close();
		
	}
}
