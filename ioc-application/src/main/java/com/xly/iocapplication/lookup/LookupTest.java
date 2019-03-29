package com.xly.iocapplication.lookup;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 演示@Lookup注解，解决单例bean引用原型bean的问题，还可以使用ApplicationContextAware
 * 用依赖拖拽的方式使用原型bean，但是这样会耦合spring-api
 * @author yxl
 * @since 2019/3/29
 */
public class LookupTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(LookupConfig.class);
        LookupService lookupService = (LookupService) applicationContext.getBean("lookupService");
        lookupService.query();
        lookupService.query();
    }
}
