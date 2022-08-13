package com.farukkaradeniz.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = {"${rmq.queue.omer}"})
    public void receive(@Payload Message msg) {
        System.out.println("Message " + new String(msg.getBody()));
    }
}
