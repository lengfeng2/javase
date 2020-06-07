package com.szb.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 *  lambda静态引用
 */
public class LambdaTest_3 {
    public static void main(String[] args) {
        //方式一：
        Supplier<String> s1 = ()->Fun.print();
        System.out.println(s1.get());
        //方式二
        Supplier<String> s2 = Fun::print;
        System.out.println(s2.get());

        Consumer<Integer> c1 = Fun::print2;
        c1.accept(123);

        Function<String,String> f1 = (str)->Fun.toUpperCase(str);
        System.out.println(f1.apply("aaa"));

        Function<String,String > f2 = Fun::toUpperCase;
        System.out.println(f2.apply("bbb"));

        BiFunction<String,String,Integer> b1 = Fun::getSize;
        System.out.println(b1.apply("fgewfewf", "nqwuidnwqid"));

    }
}

class Fun{
    public static String print(){
        System.out.println("print....");
        return "print";
    }

    public static void print2(Integer integer){
        System.out.println(integer);
    }

    public static String toUpperCase(String str){
        return str.toUpperCase();
    }

    public static Integer getSize(String a,String b){
        return a.length()+b.length();
    }

}
