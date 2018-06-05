package com.xinchen;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @date: Created In 2018/6/5 23:30
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"consumer.xml"}
        );

        DemoService demoService = (DemoService) context.getBean("demoService");

        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }
}
