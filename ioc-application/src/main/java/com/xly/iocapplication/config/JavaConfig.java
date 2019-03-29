package com.xly.iocapplication.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author yxl
 * @since 2019/3/29
 */
@Configuration
@ComponentScan("com.xly.iocapplication")
@ImportResource("classpath:spring-config.xml")
public class JavaConfig {
}
