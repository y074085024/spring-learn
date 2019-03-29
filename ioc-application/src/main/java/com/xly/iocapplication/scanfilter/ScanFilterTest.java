package com.xly.iocapplication.scanfilter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Primary;

/**
 * 演示基于javaconfig的扫描包过滤某些包的用法，xml方式也可以实现
 * @author yxl
 * @since 2019/3/29
 */
public class ScanFilterTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScanFilterConfig.class);
        System.out.println(applicationContext.getBean("filterService"));
    }
}
