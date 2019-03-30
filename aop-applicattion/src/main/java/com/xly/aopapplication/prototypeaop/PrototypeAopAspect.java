package com.xly.aopapplication.prototypeaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author yxl
 * @since 2019/3/30
 */
@Aspect("pertarget(pointcut())")
@Component
@Scope("prototype")
public class PrototypeAopAspect {
    @Pointcut("execution(* com.xly.aopapplication.prototypeaop.service.*.*(..))")
    public void pointcut(){}
    @Pointcut("this(com.xly.aopapplication.prototypeaop.IService)")
    public void test(){}

    @Before("test()")
    public void before(){
        System.out.println("before="+this.hashCode());
    }
}
