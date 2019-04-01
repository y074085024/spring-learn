package com.xly.aopapplication.xmlaop.service;

import org.springframework.stereotype.Service;

/**
 * @author yxl
 * @since 2019/3/31
 */
@Service
public class TestService {
    public void test(){
        System.out.println("TestService#test");
    }
}
