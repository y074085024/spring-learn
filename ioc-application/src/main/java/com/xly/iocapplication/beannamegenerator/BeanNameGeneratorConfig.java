package com.xly.iocapplication.beannamegenerator;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 演示javaconfig方式使用springioc
 * @author yxl
 * @since 2019/3/29
 */
@Configuration
@ComponentScan(value = "com.xly.iocapplication.beannamegenerator",nameGenerator=MyBeanNameGenerator.class)
public class BeanNameGeneratorConfig {
}
