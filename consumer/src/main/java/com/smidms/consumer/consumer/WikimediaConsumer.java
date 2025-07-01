package com.smidms.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikimediaConsumer {

    @KafkaListener(topics = "wikimedia-topic",groupId = "myGroup")
    public void consumeMessage(String msg){
        log.info("Message : "+msg);

    }

}
