package com.xly.aopapplication.xmlaop;

import com.xly.aopapplication.xmlaop.service.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用xml的方式演示spring支持的aop实现
 * @author yxl
 * @since 2019/3/31
 */
public class XmlAopTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        TestService testService = (TestService) applicationContext.getBean("testService");
        testService.test();
    }
}
