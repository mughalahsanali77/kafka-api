package com.api.kafka.consumer.listeners;

import com.api.kafka.consumer.common.Constants;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = Constants.TOPIC,groupId = Constants.GROUP_ID)
    public void listenMessage(String message){
        System.out.println("Message Recvd ->"+message);
    }
}
