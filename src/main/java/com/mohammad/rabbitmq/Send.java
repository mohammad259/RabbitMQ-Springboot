package com.mohammad.rabbitmq;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

@Profile("send")
public class Send {

    static Logger logger = LoggerFactory.getLogger(Send.class);
    
    private final static String QUEUE_NAME = "My world";
    
	public static void main(String[] args) 
	
            throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        String message = "Welcome to RabbitMQ";
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes("UTF-8"));
        logger.info("[!] Send '" + message + "'");
        channel.close();
        connection.close();

	}

}
