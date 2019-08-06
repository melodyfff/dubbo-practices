package com.xinchen.config;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xinchen.DemoService;
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

    @Reference
    private DemoService demoService;

    public String say(){
        return demoService.sayHello("world");
    }
}
