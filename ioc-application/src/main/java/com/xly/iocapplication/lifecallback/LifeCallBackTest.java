package com.xly.iocapplication.lifecallback;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring容器中bean生命周期中回调（钩子）演示，
 * 可以使用实现接口和加注解的方式添加回调方法
 * 顺序 Construct>@PostConstruct>afterPropertiesSet>@PreDestroy>destroy
 * @author yxl
 * @since 2019/3/29
 */
public class LifeCallBackTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(LifeCallBackConfig.class);
        applicationContext.close();
    }
}
