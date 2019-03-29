package com.xly.iocapplication;

import com.xly.iocapplication.config.JavaConfig;
import com.xly.iocapplication.service.JavaConfigService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 这个示例演示使用javaconfig混合xml方式使用spring-ioc
 * @author yxl
 * @since 2019/3/29
 */
public class TestJavaConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        JavaConfigService javaConfigService = (JavaConfigService) applicationContext.getBean("javaConfigService");
        javaConfigService.query();
    }
}
