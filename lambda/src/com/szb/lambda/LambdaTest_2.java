package com.szb.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaTest_2 {
    public static void main(String[] args) {
        Function<String,Integer> f1 = (str)->{return str.length();};
        System.out.println(f1.apply("hfuewhfw"));

        Supplier<String> s1 = ()->"mashibing.com";
        Supplier<String> s2 = ()->{return "hello world";};

        System.out.println(s1.get());
        System.out.println(s2.get());

        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("jfiejwifjiqjewqineqw");



        System.out.println("------------");

        BiFunction<String,String,Integer> bf = (a,b)->a.length()+b.length();
        Integer apply = bf.apply("fgewggqwqewewq", "gergregergregreger");
        System.out.println(apply);

    }
}
