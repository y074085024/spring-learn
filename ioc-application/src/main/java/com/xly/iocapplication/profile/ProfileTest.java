package com.xly.iocapplication.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 演示@Profile的用法，为两个bean加此注解表示spring只会将与profile匹配的bean添加到容器
 * @author yxl
 * @since 2019/3/29
 */
public class ProfileTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("dev");
        applicationContext.register(ProfileConfig.class);
        applicationContext.refresh();
        System.out.println(applicationContext.getBean(IService.class));
    }
}
