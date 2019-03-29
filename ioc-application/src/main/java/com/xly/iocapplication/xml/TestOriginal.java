package com.xly.iocapplication.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 这个示例演示使用xml方式使用spring-ioc
 * @author yxl
 * @since 2019/3/28
 */
public class TestOriginal {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-original.xml");
        SetterService setterService = (SetterService) applicationContext.getBean("setterService");
        setterService.query();

        ConstructorService constructorService = (ConstructorService) applicationContext.getBean("constructorService");
        constructorService.query();
    }
}
