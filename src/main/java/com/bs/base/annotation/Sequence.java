package com.bs.base.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by xianyang on 2018/3/18.
 */
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Sequence {
    String name() default "";
    String tableName();
    String columnName();
    String combinColumnName() default "";
    String perfix() default "";
    int length() default 2;
}
