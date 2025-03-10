package br.com.dev.thiagomds.ibm.mq.domain;

public interface MessageConsumer {
    void receiveMessage(String message);
}
