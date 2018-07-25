package com.raj.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.raj.domain.Employee;
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
	
	//,produces=MediaType.APPLICATION_JSON_VALUE ,  ,consumes=MediaType.APPLICATION_JSON_VALUE ,@RequestBody Employee emp
	@PostMapping(value="/post",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> post(@RequestBody Employee emp)
	{
		System.out.println(" Inside RabbitMQ");
	//	rabbitMQService.saveEmp();
		Employee e1=new Employee();
		e1.setEmpId("1002");
		e1.setEmpName("Rocky");
		System.out.println(" Emp Data "+emp.getEmpName());
		List<Employee> li=new ArrayList<Employee>();
		li.add(e1);
		return li;
	}

}
