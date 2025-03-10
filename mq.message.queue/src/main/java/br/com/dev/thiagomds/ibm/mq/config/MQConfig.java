package br.com.dev.thiagomds.ibm.mq.config;

import com.ibm.mq.jms.MQConnectionFactory;
import com.ibm.msg.client.wmq.WMQConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.JMSException;

@Configuration
public class MQConfig {

    @Value("${ibm.mq.host}")
    private String host;

    @Value("${ibm.mq.port}")
    private int port;

    @Value("${ibm.mq.queue-manager}")
    private String queueManager;

    @Value("${ibm.mq.channel}")
    private String channel;

    @Value("${ibm.mq.user}")
    private String user;

    @Value("${ibm.mq.password}")
    private String password;

    // Define um bean para a fábrica de conexões do IBM MQ
    @Bean
    public MQConnectionFactory mqConnectionFactory() throws JMSException {
        MQConnectionFactory mqConnectionFactory = new MQConnectionFactory();
        mqConnectionFactory.setHostName(host); // Define o nome do host do IBM MQ
        mqConnectionFactory.setPort(port); // Define a porta do IBM MQ
        mqConnectionFactory.setQueueManager(queueManager); // Define o gerenciador de filas
        mqConnectionFactory.setChannel(channel); // Define o canal de conexão
        mqConnectionFactory.setTransportType(1); // Define o tipo de transporte (TCP/IP)

        // Configura as credenciais de autenticação
        mqConnectionFactory.setStringProperty(WMQConstants.USERID, user); // Define o ID do usuário
        mqConnectionFactory.setStringProperty(WMQConstants.PASSWORD, password); // Define a senha
        mqConnectionFactory.setBooleanProperty(WMQConstants.USER_AUTHENTICATION_MQCSP, true); // Habilita a autenticação do usuário

        return mqConnectionFactory;
    }
}