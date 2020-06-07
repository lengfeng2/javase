package com.szb.annotation;

import java.lang.annotation.*;

@MyAnnotation()
public class MetaAnnotation {
    @MyAnnotation
    private void test(){

    }
}


/**
 * Target是用来声明当前自定义的注解适合用于什么地方：类、方法、变量、包……
 */
@Target({ElementType.METHOD,ElementType.TYPE})
//Retention表示当前注解适用于什么环境，是源码级别还是运行环境还是一般运行时
@Retention(RetentionPolicy.RUNTIME)
//表示当前注解是否显示在javadoc中
@Documented
//表示当前注解是否能被继承
@Inherited
@interface MyAnnotation{

    //定义方式看起来是方法，但是实际使用在注解填写的参数名称，默认名称是value;
    //可以添加默认值  default
    String[] likes() default {"a","b","c"};
    String name() default "zhangsan";
    int id() default 1;

}
