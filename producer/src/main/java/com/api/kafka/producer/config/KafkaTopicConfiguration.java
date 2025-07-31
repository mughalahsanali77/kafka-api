package com.api.kafka.producer.config;

import com.api.kafka.producer.common.Constants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfiguration {

    @Bean
    public NewTopic newTopic() {
        return new NewTopic(Constants.TOPIC,Constants.PARTITION_NUM,Constants.REPLICATION_FACTOR);
    }
}
