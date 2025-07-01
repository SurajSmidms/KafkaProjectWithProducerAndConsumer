package com.smidms.Kafka.Producer.consumer;

import com.smidms.Kafka.Producer.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "newTopic",groupId = "myGroup")
    public void consumeMessage(String msg){
        log.info("Message : "+msg);

    }

    @KafkaListener(topics = "newTopic",groupId = "myGroup")
    public void consumeJsonMessage(Student msg){
        log.info("Message : "+msg.toString());

    }

}
