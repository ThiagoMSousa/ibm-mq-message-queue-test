package br.com.dev.thiagomds.ibm.mq.config;

import com.ibm.mq.jms.MQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.ConnectionFactory;

@EnableJms
@Configuration
public class JMSConfig {

    @Bean
    public JmsTemplate jmsTemplate(MQConnectionFactory mqConnectionFactory) {
        System.out.println("Criando o bean JmsTemplate...");
        return new JmsTemplate(mqConnectionFactory); // Use a MQConnectionFactory
    }

    // Define um bean para o DefaultJmsListenerContainerFactory, que usa a fábrica de conexões
    @Bean
    public DefaultJmsListenerContainerFactory jmsListenerContainerFactory(ConnectionFactory connectionFactory) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory); // Configura a fábrica de conexões
        factory.setConcurrency("1-1"); // Define a concorrência (número de consumidores)
        return factory;
    }

}
