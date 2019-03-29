package com.xly.iocapplication.circularreference;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring中循环引用，可以研究一下gc的循环引用问题
 * @author yxl
 * @since 2019/3/29
 */
public class CircularReferenceTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(applicationContext.getBean("a"));
    }
}
