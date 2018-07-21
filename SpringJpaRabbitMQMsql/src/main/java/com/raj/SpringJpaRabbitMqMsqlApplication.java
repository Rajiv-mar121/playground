package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaRabbitMqMsqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaRabbitMqMsqlApplication.class, args);
	}
}


//C:\Program Files\RabbitMQ Server\rabbitmq_server-3.7.7\sbin>rabbitmq-server start
//localhost:15672
//http://javainuse.com/spring/spring-boot-rabbitmq-hello-world
// Make sure queue name and queue exchage is also present in rabbit MQ server
