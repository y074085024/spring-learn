package com.xly.iocapplication.circularreference;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author yxl
 * @since 2019/3/29
 */
@Component
public class A {
    @Resource
    private B b;
}
