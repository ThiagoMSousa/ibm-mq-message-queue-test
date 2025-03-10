package br.com.dev.thiagomds.ibm.mq.adapter;

import br.com.dev.thiagomds.ibm.mq.domain.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MQProducerAdapter implements MessageProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(String queueName, String message) {
        jmsTemplate.convertAndSend(queueName, message);
        System.out.println("*** MQ PRODUCER *** - Sent message: " + message);
    }



}