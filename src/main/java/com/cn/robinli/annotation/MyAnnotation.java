package com.cn.robinli.annotation;

/**
 * 自定义注解
 * Created by robin.Li on 2020/1/1.
 */
public @interface MyAnnotation {
    String name();
    int value() default 0;
}
