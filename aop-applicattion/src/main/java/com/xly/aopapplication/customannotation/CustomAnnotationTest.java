package com.xly.aopapplication.customannotation;

/**
 * 自定义注解演示
 * @author yxl
 * @since 2019/3/29
 */
public class CustomAnnotationTest {
    public static void main(String[] args) {
        City city = new City();
        System.out.println(ORMUtil.buildSelectSql(city));
    }
}
