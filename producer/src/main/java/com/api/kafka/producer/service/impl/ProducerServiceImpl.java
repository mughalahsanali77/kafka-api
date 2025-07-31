package com.api.kafka.producer.service.impl;

import com.api.kafka.producer.common.Constants;
import com.api.kafka.producer.service.ProducerService;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public ProducerServiceImpl(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public String sendMessage(String message) {
        kafkaTemplate.send(Constants.TOPIC, message);
        return Constants.SUCCESS_MESSAGE;
    }
}
