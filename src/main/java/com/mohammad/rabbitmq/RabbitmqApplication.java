package com.mohammad.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqApplication {
	
	// private final static String QUEUE_NAME = "hello";

	static Logger logger 
			= LoggerFactory.getLogger(RabbitmqApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqApplication.class, args);
	}

}
