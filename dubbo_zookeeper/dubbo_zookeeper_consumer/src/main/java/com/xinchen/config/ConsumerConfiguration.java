package com.xinchen.config;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * 基于注解实现的消费者配置
 * @author xinchen
 * @version 1.0
 * @date 06/08/2019 11:19
 */

@Configuration
@EnableDubbo(scanBasePackages = "com.xinchen.config")
@PropertySource("classpath:dubbo-consumer.properties")
@ComponentScan(value = "com.xinchen.config")
public class ConsumerConfiguration {
}
