package com.shundalov.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "Alexandrr", groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }

}
