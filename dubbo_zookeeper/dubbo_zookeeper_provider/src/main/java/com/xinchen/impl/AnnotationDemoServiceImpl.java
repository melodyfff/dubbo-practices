package com.xinchen.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xinchen.DemoService;

/**
 *
 * 基于注解实现
 *
 * @author xinchen
 * @version 1.0
 * @date 06/08/2019 11:00
 */
@Service
public class AnnotationDemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "annotation: hello, " + name;
    }
}
