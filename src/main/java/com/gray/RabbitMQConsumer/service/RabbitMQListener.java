package com.gray.RabbitMQConsumer.service;

import com.gray.RabbitMQConsumer.model.Employee;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


/*   Uncomment and use commented section in RabbitMQConfig to implement this setup


@Service
public class RabbitMQListener implements MessageListener {

    public void onMessage(Message message) {
        System.out.println("Consuming Message - " + new String(message.getBody()));


    }

}
*/

