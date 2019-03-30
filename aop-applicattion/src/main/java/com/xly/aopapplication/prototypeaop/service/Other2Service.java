package com.xly.aopapplication.prototypeaop.service;

import com.xly.aopapplication.prototypeaop.IService;
import org.springframework.stereotype.Service;

/**
 * @author yxl
 * @since 2019/3/30
 */
@Service
public class Other2Service implements IService {
    public void test(){
        System.out.println("Other2Service#test--hashcode="+this.hashCode());
    }
}
