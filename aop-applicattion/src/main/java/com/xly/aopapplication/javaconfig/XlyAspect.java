package com.xly.aopapplication.javaconfig;

import com.xly.aopapplication.javaconfig.service.DefaultService;
import com.xly.aopapplication.javaconfig.service.IService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 切面实现,具体切入点表达式例子参考官网
 * @author yxl
 * @since 2019/3/29
 */
@Component
@Aspect
public class XlyAspect {
    @Pointcut("execution(* com.xly.aopapplication.javaconfig.service.*.*(..))")
    public void pointCutExecution(){}

    @Pointcut("within(com.xly.aopapplication.javaconfig.service.*)")
    public void pointCutWithin(){}

    @Pointcut("args(int)")
    public void pointCutArgs(){}

    @Pointcut("@annotation(com.xly.aopapplication.javaconfig.anno.Xly)")
    public void pointCutAnnotation(){}

    @Pointcut("this(com.xly.aopapplication.javaconfig.service.AopService)")
    public void pointCutThis(){}

    @Pointcut("target(com.xly.aopapplication.javaconfig.service.AopService)")
    public void pointCutTarget(){}

    @Pointcut("@target(com.xly.aopapplication.javaconfig.anno.Xly)")
    public void pointCutAtTarget(){}

    /**
     * 前置通知
     */
    @Before("pointCutExecution() && this(iService)")
    public void before(JoinPoint joinPoint,IService iService){
        System.out.println(iService.getClass());
        System.out.println("joinPoint#this="+joinPoint.getThis().getClass());
        System.out.println("joinPoint#target="+joinPoint.getTarget().getClass());
        System.out.println("before");
    }

    /**
     * 后置通知
     */
//    @After("pointCutExecution() && !pointCutArgs()")
    public void after(){
        System.out.println("after");
    }

    /**
     * 环绕通知，应用场景：可以在执行连接点时改变传入的参数
     * @param pjp
     */
    @Around("pointCutExecution()")
    public void around(ProceedingJoinPoint pjp){
        System.out.println("around-before");
        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around-after");
    }

    @DeclareParents(value = "com.xly.aopapplication.javaconfig.service.*",defaultImpl =DefaultService.class)
    public static IService iService;
}
