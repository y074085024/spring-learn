package com.xly.aopapplication.customannotation;

import com.xly.aopapplication.customannotation.anno.Entity;

/**
 * @author yxl
 * @since 2019/3/29
 */
@Entity("city")
public class City {
    private int id;
    private String name;
}
