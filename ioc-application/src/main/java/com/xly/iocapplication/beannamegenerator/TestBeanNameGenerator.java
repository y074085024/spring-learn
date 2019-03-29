package com.xly.iocapplication.beannamegenerator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 这个示例演示使用javaconfig混合xml方式使用spring-ioc
 * @author yxl
 * @since 2019/3/29
 */
public class TestBeanNameGenerator {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanNameGeneratorConfig.class);
        String[] beanNamesForType = applicationContext.getBeanNamesForType(TestBeanName.class);
        for (int i = 0; i < beanNamesForType.length; i++) {
            System.out.println("beanName="+beanNamesForType[i]);
        }
    }
}
