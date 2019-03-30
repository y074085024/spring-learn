package com.xly.aopapplication.prototypeaop.service2;

import com.xly.aopapplication.prototypeaop.IService;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author yxl
 * @since 2019/3/30
 */
@Service
//@Scope("prototype")
public class TestService implements IService {
    public void test(){
        System.out.println("TestService#test--hashcode="+this.hashCode());
    }
}
