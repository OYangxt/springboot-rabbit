package com.neoway.springbootrabbit.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置队列，绑定交换机
 * @author 20190712713
 * @date 2019/10/15 16:25
 */
@Configuration
public class TopicRabbitConfig {

    final static String QUEUE_NAME_01 = "topic_message";
    final static String QUEUE_NAME_02 = "topic_messages";


    @Bean
    public Queue queueMessage() {

        return new Queue(TopicRabbitConfig.QUEUE_NAME_01);
    }

    @Bean
    public Queue queueMessages() {

        return new Queue(TopicRabbitConfig.QUEUE_NAME_02);
    }

    @Bean
    public TopicExchange exchange() {

        return new TopicExchange("topic_exchange");
    }

    @Bean
    public Binding bindExchangeQueue01(Queue queueMessage, TopicExchange topicExchange) {

        return BindingBuilder.bind(queueMessage).to(topicExchange).with("topic.message");
    }

    @Bean
    public Binding bindingExchangeQueue02(TopicExchange topicExchange, Queue queueMessages) {

        return BindingBuilder.bind(queueMessages).to(topicExchange).with("topic.#");
    }
}
