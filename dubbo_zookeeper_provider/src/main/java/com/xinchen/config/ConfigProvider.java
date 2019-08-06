package com.xinchen.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @author xinchen
 * @version 1.0
 * @date 06/08/2019 11:07
 */
public class ConfigProvider {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);

        context.start();

        System.in.read();
    }
}
