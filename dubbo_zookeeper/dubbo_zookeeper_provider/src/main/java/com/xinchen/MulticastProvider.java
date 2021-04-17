package com.xinchen;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * multicast广播式服务提供
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @date: Created In 2018/6/5 23:30
 */
public class MulticastProvider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"multicast-provider.xml"}
        );
        context.start();

        System.in.read();
    }
}
