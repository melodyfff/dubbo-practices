package com.xinchen.annotation;

import com.xinchen.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 *
 * 基于注解实现
 *
 * @author xinchen
 * @version 1.0
 * @date 06/08/2019 11:00
 */
@DubboService
class AnnotationDemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "annotation: hello, " + name;
    }
}
