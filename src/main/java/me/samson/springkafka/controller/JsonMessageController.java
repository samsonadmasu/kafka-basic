package me.samson.springkafka.controller;

import me.samson.springkafka.kafka.JsonKafkaProducer;
import me.samson.springkafka.kafka.KafkaProducer;
import me.samson.springkafka.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

   private JsonKafkaProducer jsonKafkaProducer;
   private KafkaProducer kafkaProducer;

    public JsonMessageController(JsonKafkaProducer jsonKafkaProducer, KafkaProducer kafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> stringPublish(@PathVariable("message") String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("string message is sended");
    }

    @PostMapping("/jsonPublish")
    public ResponseEntity<String> jsonPublish(@RequestBody User user){
        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json Meesage is sended");
    }
}
