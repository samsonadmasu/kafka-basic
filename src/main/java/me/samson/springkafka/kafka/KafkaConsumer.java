package me.samson.springkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    //create a subscriber method to liesten

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics = "topic_demo", groupId = "myGroup")
    public void consume(String message){
        LOGGER.info(String.format("Message Received -> %s",message));
    }
}