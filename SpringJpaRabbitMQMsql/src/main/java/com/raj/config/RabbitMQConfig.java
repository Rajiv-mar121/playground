package com.raj.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RabbitMQConfig {
	
	@Value("${raj.rabbitmq.queue}")
	String queueName;
	
	@Value("${raj.rabbitmq.exchange}")
	String exchange;
	
	@Value("${raj.rabbitmq.routingkey}")
	private String routingKey;
	
	@Bean
	Queue queue()
	{
		return new Queue(queueName,false);
	}
	
	@Bean
	DirectExchange directExchange()
	{
		return new DirectExchange(exchange);
	}

	@Bean
	Binding binding(Queue queue,DirectExchange directExchang)
	{
		BindingBuilder.bind(queue).to(directExchang).with(routingKey);
		return null;
	}
	
	@Bean
	public MessageConverter jsonMessageConverter() {
		return new Jackson2JsonMessageConverter();
	}
	
	@Bean
	public AmqpTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
		final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(jsonMessageConverter());
		return rabbitTemplate;
	}
	
	@Bean(name="restTemplate")
	public RestTemplate restTemplate() {
	      return new RestTemplate();
	   }
}
