package com.xly.iocapplication.configbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 演示基于javaconfig，@Bean添加bean到容器，该bean带有依赖
 * @author yxl
 * @since 2019/3/29
 */
public class ConfigBeanTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

    }
}
