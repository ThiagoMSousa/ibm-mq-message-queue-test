package br.com.dev.thiagomds.ibm.mq.adapter;

import br.com.dev.thiagomds.ibm.mq.domain.MessageConsumer;
import br.com.dev.thiagomds.ibm.mq.service.MQMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MQConsumerAdapter implements MessageConsumer {

    @Value("${queue.ibm.mq.queue-producer}")
    private String queueProducer;

    @Autowired
    MQMessageService mqMessageService;

    @JmsListener(destination = "${queue.ibm.mq.queue-consumer}")
    public void receiveMessage(String message) {
        System.out.println("*** MQ CONSUMER *** - Received message: " + message);
        mqMessageService.processMessage(queueProducer, message);
    }
}