package com.xly.aopapplication.prototypeaop.service;

import com.xly.aopapplication.prototypeaop.IService;
import org.springframework.stereotype.Service;

/**
 * @author yxl
 * @since 2019/3/30
 */
@Service
public class Other1Service implements IService {
    @Override
    public void test(){
        System.out.println("Other1Service#test--hashcode="+this.hashCode());
    }
}
