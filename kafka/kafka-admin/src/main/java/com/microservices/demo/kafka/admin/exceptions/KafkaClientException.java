package com.microservices.demo.kafka.admin.exceptions;

/**
 * Exception class for kafka client error situations.
 */
public class KafkaClientException extends RuntimeException {
    public KafkaClientException() {
    }

    public KafkaClientException(String message) {
        super(message);
    }

    public KafkaClientException(String message, Throwable cause) {
        super(message, cause);
    }
}
