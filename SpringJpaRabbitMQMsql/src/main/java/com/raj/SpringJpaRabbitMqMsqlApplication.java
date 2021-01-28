package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.raj.domain.Employee;

@SpringBootApplication
public class SpringJpaRabbitMqMsqlApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringJpaRabbitMqMsqlApplication.class, args);
		RestTemplate restTemplate=(RestTemplate)ctx.getBean("restTemplate");
		ResponseEntity<Employee[]> reponse=restTemplate.getForEntity("http://localhost:8085/rabbitmq/list", Employee[].class);
	}
}


//C:\Program Files\RabbitMQ Server\rabbitmq_server-3.7.7\sbin>rabbitmq-server start
//localhost:15672
//http://javainuse.com/spring/spring-boot-rabbitmq-hello-world
// Make sure queue name and queue exchage is also present in rabbit MQ server
