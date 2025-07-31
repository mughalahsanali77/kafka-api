package com.api.kafka.producer.common;

public class Constants {
    private Constants() {}
    public static final String TOPIC = "digital-ride-payment-event";
    public static final Integer PARTITION_NUM = 3;
    public static final short REPLICATION_FACTOR = 1;
    public static final String SUCCESS_MESSAGE = "Message Sent Successfully";
    public static final String FAILURE_MESSAGE = "Failure";
}
