package com.raj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.raj.service.RabbitMQService;

/**
 * RabbitMQ controller to serve web request
 * @author Rajiv
 *
 */
@RestController
@RequestMapping("/rabbitmq")
public class RabbitMQController {
	
	@Autowired
	RabbitMQService rabbitMQService;
	
	@GetMapping("/test")
	public String test()
	{
		System.out.println(" Inside RabbitMQ");
		rabbitMQService.saveEmp();
		return "Inside RabbitMQ";
	}

	
	@GetMapping(value = "/producer")
	public String producer(@RequestParam("empName") String empName,@RequestParam("empId") String empId) {
		   final Logger LOGGER = LoggerFactory.getLogger(RabbitMQController.class);
		   LOGGER.debug(" Logging enabled ");
	System.out.println("Inside producer controller  --> 1");
	
	System.out.println("Inside producer controller ");
	rabbitMQService.send(empName,empId);

		return "Message sent to the RabbitMQ JavaInUse Successfully";
	}
}
