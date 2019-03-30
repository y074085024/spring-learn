package com.xly.aopapplication.javaconfig.service;

/**
 * @author yxl
 * @since 2019/3/29
 */
public class DefaultService implements IService {
    @Override
    public void logic1() {
        System.out.println("logic1#default IService impl");
    }

    @Override
    public void logic2(int id) {
        System.out.println("logic2#default IService impl");
    }
}
