package com.stream.producer.config;

import com.stream.producer.dto.RiderLocation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;
import java.util.stream.Stream;

@Configuration
@Slf4j
public class StreamProducer {

    @Bean
    public Supplier<RiderLocation> sendRiderLocation(){
        return () -> {
            RiderLocation location=new RiderLocation("Rider-XyZ",16.7,88.2);
            log.info("Sending {}",location);
            return location;
        };
    }
}
