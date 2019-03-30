package com.xly.aopapplication.prototypeaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author yxl
 * @since 2019/3/30
 */
@Configuration
@ComponentScan("com.xly.aopapplication.prototypeaop")
@EnableAspectJAutoProxy
public class PrototypeAopConfig {
}
