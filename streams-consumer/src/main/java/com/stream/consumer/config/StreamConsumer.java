package com.stream.consumer.config;

import com.stream.consumer.dto.RiderLocation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class StreamConsumer {

    @Bean
    public Consumer<RiderLocation> processRiderLocation() {
        return location -> {
            log.info("Rider Location: {}", location);
        };
    }
}
