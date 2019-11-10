package com.neoway.springbootrabbit.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 20190712713
 * @date 2019/10/15 16:55
 */
@Component
public class TopicProducer {
    @Autowired
    AmqpTemplate rabbitTemplate;

    public void send1() {
        String context = "hi, i am message !";
        System.out.println("生产者1发出消息 : " + context);
        rabbitTemplate.convertAndSend("topic_exchange", "topic.message", context);
    }


    public void send2() {
        String context = "hi, i am messages !";
        System.out.println("生产者2发出消息 : " + context);
        rabbitTemplate.convertAndSend("topic_exchange", "topic.messages", context);
    }
}
