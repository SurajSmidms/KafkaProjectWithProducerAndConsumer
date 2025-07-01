package com.smidms.producer.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class WikiMediaProducer {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String msg){
        log.info("Sending message to topic : "+msg);
        kafkaTemplate.send("wikimedia-topic",msg);
    }

}
