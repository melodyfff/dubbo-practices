package com.xinchen.annotation;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * https://github.com/apache/dubbo-samples/blob/master/dubbo-samples-annotation/README.md
 *
 * 基于注解实现dubbo
 *
 * @author xinchen
 * @version 1.0
 * @date 06/08/2019 11:04
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.xinchen.annotation")
@PropertySource("classpath:dubbo-provider.properties")
public class ProviderConfiguration {
}
