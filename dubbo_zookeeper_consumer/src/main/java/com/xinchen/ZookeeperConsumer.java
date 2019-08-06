package com.xinchen;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * zookeeper消费者
 * @author xinchen
 * @version 1.0
 * @date 06/08/2019 10:22
 */
public class ZookeeperConsumer {

    static CountDownLatch latch = new CountDownLatch(1);

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:zookeeper-consumer.xml");

        DemoService demoService = context.getBean(DemoService.class);

        String hello = demoService.sayHello("world");

        System.out.println(hello);

        // 等待一分钟观察zookeeper中的变化
        latch.await(1, TimeUnit.MINUTES);
    }
}
