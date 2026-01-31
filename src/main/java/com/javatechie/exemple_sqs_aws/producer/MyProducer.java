package com.javatechie.exemple_sqs_aws.producer;

import com.javatechie.exemple_sqs_aws.messages.MyMessage;
import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyProducer {

    private static final String SQS = "javatechie-queue";

    @Autowired
    private SqsTemplate sqsTemplate;


    public void sendMessage(MyMessage myMessage) {
        sqsTemplate.send(SQS, myMessage);

    }
}
