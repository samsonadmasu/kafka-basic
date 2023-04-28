package me.samson.springkafka.kafka;

import me.samson.springkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "topic_demo_json", groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("jon log data -> %s",user.toString()));
    }
}
