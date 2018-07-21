package com.raj.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.raj.domain.Employee;
import com.raj.repository.RabbitMQRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RabbitMQService {

	@Autowired
	public RabbitMQRepository rabbitMQRepository;
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@Value("${raj.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${raj.rabbitmq.routingkey}")
	private String routingkey;
	
	
	@Transactional
	public void saveEmp()
	{
		Employee emp=new Employee();
		emp.setEmpId("10");
		emp.setEmpName("Rajiv");
		rabbitMQRepository.save(emp);
		System.out.println("Emp saved "+emp);
	}
	
	@Transactional
	public void send(String empName,String  empId) {
		Employee emp=new Employee();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
	// Enable below line to save data into db
		
	//	rabbitMQRepository.save(emp);
		System.out.println("Rabbit Data Saved = " + emp);
		System.out.println("Property Values  = " + exchange +" <====>"+routingkey);
		//rabbitTemplate.convertAndSend(exchange, routingkey, emp);
		System.out.println("Send msg = " + emp);
		log.debug("Service class Logging ... yupiee ");
	    
	}
}
