package com.xinchen;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @date: Created In 2018/6/5 23:30
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"provider.xml"}
        );
        context.start();
        System.in.read();
    }
}
