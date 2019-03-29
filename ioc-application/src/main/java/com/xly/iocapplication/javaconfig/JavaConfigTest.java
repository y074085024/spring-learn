package com.xly.iocapplication.javaconfig;

import com.xly.iocapplication.javaconfig.JavaConfig;
import com.xly.iocapplication.javaconfig.JavaConfigService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 这个示例演示使用javaconfig混合xml方式使用spring-ioc
 * @author yxl
 * @since 2019/3/29
 */
public class JavaConfigTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        JavaConfigService javaConfigService = (JavaConfigService) applicationContext.getBean("javaConfigService");
        javaConfigService.query();
    }
}
