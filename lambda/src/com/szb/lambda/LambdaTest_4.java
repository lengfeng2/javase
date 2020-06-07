package com.szb.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 实例对象引用
 */
public class LambdaTest_4 {
    public String put(){
        return "put...";
    }

    public void getSize(Integer size){
        System.out.println(size);
    }

    public String toUpperCase(String str){
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        Supplier<String> s1 = ()->new LambdaTest_4().put();
        Supplier<String> s2 = ()->{return new LambdaTest_4().put();};
        Supplier<String> s3 = new LambdaTest_4()::put;
        System.out.println(s1.get());
        System.out.println(s2.get());
        System.out.println(s3.get());

        LambdaTest_4 test = new LambdaTest_4();
        Consumer<Integer> c1 = (size)->test.getSize(size);
        c1.accept("jfiejgire".length());
        Consumer<Integer> c2 = test::getSize;
        c2.accept("fjieuwjfiew".length());

        Function<String,String> f1 = (str)->test.toUpperCase(str);
        Function<String,String> f2 = (str)->{return test.toUpperCase(str);};
        Function<String,String> f3 = test::toUpperCase;
        System.out.println(f1.apply("aaa"));
        System.out.println(f2.apply("aaa"));
        System.out.println(f3.apply("aaa"));


    }
}
