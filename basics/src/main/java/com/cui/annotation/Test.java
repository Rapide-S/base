package com.cui.annotation;

import java.lang.reflect.Method;

/**
 * @Auther: Cui
 * @Date: 2021/7/15 22:05
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        Class cla = Test.class;
        Method method = cla.getMethod("main",String[].class);
        Hello hello = method.getAnnotation(Hello.class);
    }
}
