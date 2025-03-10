# IBM MQ Message Queue Application

![Java](https://img.shields.io/badge/Java-11-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.4-brightgreen)
![IBM MQ](https://img.shields.io/badge/IBM%20MQ-9.2.0-blue)
![Maven](https://img.shields.io/badge/Maven-3.6.3-red)

## Objetivo

Esta aplicação tem como objetivo testar o envio e recebimento de mensagens usando o IBM MQ, com implementações de consumidores e produtores. Ela demonstra como configurar e utilizar o IBM MQ com Spring Boot para enviar e receber mensagens de forma eficiente.

## Tecnologias Usadas

- **Java**: Linguagem de programação utilizada para desenvolver a aplicação.
- **Spring Boot**: Framework utilizado para simplificar a configuração e o desenvolvimento da aplicação.
- **IBM MQ**: Sistema de mensageria utilizado para enviar e receber mensagens.
- **Maven**: Ferramenta de gerenciamento de dependências e build da aplicação.

## Pré-requisitos

Antes de executar a aplicação, certifique-se de que os seguintes pré-requisitos estão atendidos:

1. **Java 11 ou superior**: A aplicação requer o JDK 11 ou superior.
2. **Maven**: Certifique-se de que o Maven está instalado e configurado no seu ambiente.
3. **IBM MQ**: O IBM MQ deve estar instalado e configurado corretamente. Certifique-se de que o servidor IBM MQ está em execução.
4. **Variáveis de Ambiente**: Defina as variáveis de ambiente necessárias para a configuração do IBM MQ. Crie um arquivo `mq.message.queue.env` na raiz do projeto com o seguinte conteúdo:

```dotenv
IBM_MQ_HOST=localhost
IBM_MQ_PORT=1414
IBM_MQ_QUEUE_MANAGER=QM1
IBM_MQ_CHANNEL=DEV.ADMIN.SVRCONN
IBM_MQ_USER=admin
IBM_MQ_PASSWORD=passw0rd
IBM_MQ_QUEUE_CONSUMER=DEV.QUEUE.1
IBM_MQ_QUEUE_PRODUCER=DEV.QUEUE.2