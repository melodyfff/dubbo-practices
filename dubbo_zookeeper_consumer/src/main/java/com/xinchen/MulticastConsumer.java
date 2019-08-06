package com.xinchen;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * multicast广播式消费者
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @date: Created In 2018/6/5 23:30
 */
public class MulticastConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"multicast-consumer.xml"}
        );

        DemoService demoService = (DemoService) context.getBean("demoService");

        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }
}
