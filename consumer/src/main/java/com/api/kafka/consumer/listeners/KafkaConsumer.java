package com.api.kafka.consumer.listeners;

import com.api.kafka.consumer.common.Constants;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumer {

    @KafkaListener(topics = Constants.TOPIC,groupId = Constants.GROUP_ID)
    public void listenMessage(String message){
        System.out.println("Message Recvd ->"+message);
    }
}
