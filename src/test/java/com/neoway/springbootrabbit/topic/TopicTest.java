package com.neoway.springbootrabbit.topic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 20190712713
 * @date 2019/10/15 17:06
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicTest {
    @Autowired
    private TopicProducer producer;

    @Test
    public void send1(){
        producer.send1();
    }

    @Test
    public void send2(){
        producer.send2();
    }
}
