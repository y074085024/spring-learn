package com.xly.iocapplication.xml;

import com.xly.iocapplication.xml.AutowireService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * xmlaop+注解方式使用spring-ioc
 * @author yxl
 * @since 2019/3/29
 */
public class TestAutowire {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
        AutowireService autowireService = (AutowireService) applicationContext.getBean("autowireService");
        autowireService.query();
    }
}
