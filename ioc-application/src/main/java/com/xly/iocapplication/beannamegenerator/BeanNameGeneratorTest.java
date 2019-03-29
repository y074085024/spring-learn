package com.xly.iocapplication.beannamegenerator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 演示beanName自定义方式
 * @author yxl
 * @since 2019/3/29
 */
public class BeanNameGeneratorTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanNameGeneratorConfig.class);
        String[] beanNamesForType = applicationContext.getBeanNamesForType(TestBeanName.class);
        for (int i = 0; i < beanNamesForType.length; i++) {
            System.out.println("beanName="+beanNamesForType[i]);
        }
    }
}
