package br.com.dev.thiagomds.ibm.mq.domain;

public interface MessageProducer {
    void sendMessage(String queueName, String message);
}
