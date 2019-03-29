package com.xly.iocapplication.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 演示javaconfig方式使用springioc
 * @author yxl
 * @since 2019/3/29
 */
@Configuration
@ComponentScan("com.xly.iocapplication.javaconfig")
@ImportResource("classpath:spring-config.xml")
public class JavaConfig {
}
