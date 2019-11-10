package com.neoway.springbootrabbit.topic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author 20190712713
 * @date 2019/10/15 16:48
 */
@Component
@RabbitListener(queues = "topic_message")
@Slf4j
public class Consumer1 {

    @RabbitHandler
    public void process(String messsage) {

        System.out.println("消费者憨憨1消费了消息: " + messsage);

        log.info("憨憨1号消费了： " + messsage);
    }
}
