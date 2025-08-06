package com.stream.producer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class RiderLocation {
    private String id;
    private Double latitude;
    private Double longitude;
}
