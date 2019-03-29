package com.xly.iocapplication.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 这个示例演示使用xml+注解方式使用spring-ioc
 * @author yxl
 * @since 2019/3/28
 */
public class TestAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-annotation.xml");
         AnnotationService annotationService = (AnnotationService) applicationContext.getBean("annotationService");
        annotationService.query();
    }
}
