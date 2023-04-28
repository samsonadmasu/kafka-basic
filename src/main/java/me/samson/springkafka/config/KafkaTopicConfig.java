package me.samson.springkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    //create kafka topic
    @Bean
    public NewTopic javaTopicCreate() {
        return TopicBuilder.name("topic_demo")
                .build();
    }

    @Bean
    public NewTopic javaTopicJsonCreate() {
        return TopicBuilder.name("topic_demo_json")
                .build();
    }
}
