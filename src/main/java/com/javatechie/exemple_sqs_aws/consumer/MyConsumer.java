package com.javatechie.exemple_sqs_aws.consumer;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyConsumer {

    private static final Logger logger = LoggerFactory.getLogger(MyConsumer.class);

    @SqsListener("javatechie-queue")
    public void listen(MyMessage message) {
        logger.info("🎉 MENSAGEM RECEBIDA: {}", message.content());
        System.out.println("==========================================");
        System.out.println("🎉 MENSAGEM RECEBIDA DA AWS");
        System.out.println("Conteúdo: " + message.content());
        System.out.println("==========================================");
    }
}


