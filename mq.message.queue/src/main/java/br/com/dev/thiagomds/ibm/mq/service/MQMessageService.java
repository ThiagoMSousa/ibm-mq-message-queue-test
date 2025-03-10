package br.com.dev.thiagomds.ibm.mq.service;

import br.com.dev.thiagomds.ibm.mq.domain.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MQMessageService {

    private final MessageProducer messageProducer;

    @Autowired
    public MQMessageService(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public void processMessage(String destinationQueue, String message) {
        messageProducer.sendMessage(destinationQueue, message);
    }
}