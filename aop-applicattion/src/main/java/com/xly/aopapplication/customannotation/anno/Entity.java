package com.xly.aopapplication.customannotation.anno;

import java.lang.annotation.*;

/**
 * @author yxl
 * @since 2019/3/29
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Entity {
    String value();
}
