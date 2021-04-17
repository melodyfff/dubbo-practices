package com.xinchen;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * zookeeper服务提供
 *
 * @author xinchen
 * @version 1.0
 * @date 06/08/2019 10:09
 */
public class ZookeeperProvider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:zookeeper-provider.xml");

        context.start();

        System.in.read();
    }
}
