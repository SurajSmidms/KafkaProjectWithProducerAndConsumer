package com.smidms.producer.rest;

import com.smidms.producer.stream.WikiMediaStreamConsumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("api/v1/wikimedia")
public class WikiMediaController {

    private final WikiMediaStreamConsumer streamConsumer;

    public WikiMediaController(WikiMediaStreamConsumer streamConsumer) {
        this.streamConsumer = streamConsumer;
    }

    @GetMapping
    public void startPublishing(){
        streamConsumer.consumeStreamAndPublish();
    }

}
