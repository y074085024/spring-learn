package com.xly.aopapplication.javaconfig;

import com.xly.aopapplication.javaconfig.service.IService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.misc.ProxyGenerator;

import java.io.*;
import java.lang.reflect.Proxy;

/**
 * 基于javaconfig使用AspectJ语法使用aop
 * @author yxl
 * @since 2019/3/29
 */
public class AopTest {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        IService iService = (IService) applicationContext.getBean("aopService");
        iService.logic1();
        iService.logic2(1);

        // 演示spring中的Introductions
        IService intro = (IService) applicationContext.getBean("testService");
        System.out.println(intro.getClass());
        intro.logic1();

        // 生成动态代理的字节码文件
//        byte[] proxyServiceClazz = ProxyGenerator.generateProxyClass("ProxyService",new Class[]{IService.class});
//        FileOutputStream fileOutputStream = new FileOutputStream(new File("D:/ProxyService.class"));
//        fileOutputStream.write(proxyServiceClazz);
//        fileOutputStream.close();
    }
}
