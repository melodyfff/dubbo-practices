package com.xinchen.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 *
 * 基于注解实现的消费者
 *
 * @author xinchen
 * @version 1.0
 * @date 06/08/2019 11:13
 */
public class ConfigConsumer {

    static CountDownLatch latch = new CountDownLatch(1);

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);

        context.start();


        DemoServiceAction demoServiceAction = context.getBean(DemoServiceAction.class);

        System.out.println(demoServiceAction.say());

        latch.await(10, TimeUnit.SECONDS);
    }
}
