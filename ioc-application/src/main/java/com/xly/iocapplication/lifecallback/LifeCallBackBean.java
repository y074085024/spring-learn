package com.xly.iocapplication.lifecallback;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author yxl
 * @since 2019/3/29
 */
@Component
public class LifeCallBackBean implements InitializingBean,DisposableBean {
    public LifeCallBackBean(){
        System.out.println("LifeCallBackBean#constructor");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("postConstruct#init");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet#init");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("preDestroy#destroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean#destroy");
    }
}
