package com.xly.iocapplication;

import com.xly.iocapplication.service.ConstructorService;
import com.xly.iocapplication.service.SetterService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yxl
 * @since 2019/3/28
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        SetterService setterService = (SetterService) applicationContext.getBean("setterService");
        setterService.query();

        ConstructorService constructorService = (ConstructorService) applicationContext.getBean("constructorService");
        constructorService.query();
    }
}
