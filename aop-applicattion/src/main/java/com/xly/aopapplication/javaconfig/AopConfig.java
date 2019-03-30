package com.xly.aopapplication.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author yxl
 * @since 2019/3/29
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy//支持@AspectJ的语法实现aop
public class AopConfig {
}
