package com.example.demo_kafka_producer.controller;

import com.example.demo_kafka_producer.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

@RestController
public class KafkaController {
    @Autowired
    KafkaProducerService kafkaProducerService;

    @RequestMapping(path = "send",method = RequestMethod.GET)
    public ResponseEntity<?> send(){
        return new ResponseEntity(kafkaProducerService.sendMessage("bach test gui kafka"), HttpStatus.OK);
    }
}
