package com.xinchen.annotation;

import com.xinchen.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

/**
 *
 * 基于注解实现，接口对象实践动作
 *
 * @author xinchen
 * @version 1.0
 * @date 06/08/2019 11:18
 */
@Component("demoServiceAction")
public class DemoServiceAction {

    @DubboReference
    private DemoService demoService;

    public String say(){
        return demoService.sayHello("world");
    }
}
