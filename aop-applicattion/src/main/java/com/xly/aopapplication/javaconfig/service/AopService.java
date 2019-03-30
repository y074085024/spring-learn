package com.xly.aopapplication.javaconfig.service;

import com.xly.aopapplication.javaconfig.anno.Xly;
import org.springframework.stereotype.Service;

/**
 * @author yxl
 * @since 2019/3/29
 */
@Service
@Xly
public class AopService implements IService{

    public void logic1(){
        System.out.println("logic1");
    }
    @Xly
    public void logic2(int id){
        System.out.println("logic2");
    }
}
