package com.neoway.springbootrabbit.topic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * @author 20190712713
 * @date 2019/10/15 16:50
 */
@Slf4j
@Component
@RabbitListener(queues = "topic_messages")
public class Consumer2 {

    @RabbitHandler
    public void process(String message){

        System.out.println("消费者憨憨2消费了： " + message);
        log.info("憨憨2号消费了： " + message);
    }
}
