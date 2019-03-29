package com.xly.iocapplication.lookup;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
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
