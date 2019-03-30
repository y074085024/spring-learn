package com.xly.aopapplication.customannotation;

import com.xly.aopapplication.customannotation.anno.Entity;

import java.lang.reflect.Field;

/**
 * @author yxl
 * @since 2019/3/29
 */
public class ORMUtil {
    private ORMUtil(){}
    public static String buildSelectSql(Object object){
        // select * from city'
        String sql = "select * from ";
        if (object.getClass().isAnnotationPresent(Entity.class)) {
            Entity entity = object.getClass().getAnnotation(Entity.class);
            sql+=entity.value()+" ";
        }

        return sql;
    }
}
