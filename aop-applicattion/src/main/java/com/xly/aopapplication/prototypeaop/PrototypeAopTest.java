package com.xly.aopapplication.prototypeaop;

import com.xly.aopapplication.prototypeaop.service.Other1Service;
import com.xly.aopapplication.prototypeaop.service.Other2Service;
import com.xly.aopapplication.prototypeaop.service2.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 原型模式的切面测试，即可以根据业务需求对每个被增强的对象分别使用不同的切面
 * @author yxl
 * @since 2019/3/30
 */
public class PrototypeAopTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PrototypeAopConfig.class);
        IService testService1 = (IService) applicationContext.getBean("testService");
        testService1.test();
        IService testService2 = (IService) applicationContext.getBean("testService");
        testService2.test();
        IService other1Service = (IService) applicationContext.getBean("other1Service");
        other1Service.test();
        IService other2Service = (IService) applicationContext.getBean("other2Service");
        other2Service.test();
    }
}
