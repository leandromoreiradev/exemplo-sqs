package com.javatechie.exemple_sqs_aws.controller;


import com.javatechie.exemple_sqs_aws.messages.MyMessage;
import com.javatechie.exemple_sqs_aws.producer.MyProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MyProducer myProducer;


    @PostMapping("/send")
    public void sendMessage(@RequestBody MyMessage myMessage) {
        myProducer.sendMessage(myMessage);
    }
}
