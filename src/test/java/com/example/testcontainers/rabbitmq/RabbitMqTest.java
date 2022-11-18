package com.example.testcontainers.rabbitmq;

import org.junit.Test;
import org.testcontainers.containers.RabbitMQContainer;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;


public class RabbitMqTest {

    /*
        Cria uma instancia do rabbit com uma exchange simples e neste computador não há nada configurado
        com relação ao rabbit
     */

    @Test
    public void shouldCreateRabbitWithExchange() throws IOException, InterruptedException {
        try (RabbitMQContainer container = new RabbitMQContainer(RabbitMQImages.RABBITMQ_IMAGE)) {
            container.withExchange("test-exchange", "direct");
            container.start();
            assertThat(container.execInContainer("rabbitmqctl", "list_exchanges").getStdout())
                    .containsPattern("test-exchange\\s+direct");
        }
    }

}
