package com.szb.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * 对象方法引用
 */
public class LambdaTest_5 {
    public static void main(String[] args) {
        Consumer<Too> c1 = (Too too) -> new Too().foo();
        c1.accept(new Too());
        Consumer<Too> c2 = (Too too) -> new Too2().foo();
        c2.accept(new Too());
        Consumer<Too2> c3 = Too2::foo;
        c3.accept(new Too2());
        Consumer<Too> c4 = Too::foo;
        c4.accept(new Too());

        BiConsumer<Too2,String> b1 = (too2,str)->new Too2().show(str);
        b1.accept(new Too2(),"aaa");
        System.out.println("--------------");
        BiConsumer<Too2,String> b2 = Too2::show;
        b2.accept(new Too2(),"bbbb");

        //三个参数返回的写法
        BiFunction<Exec,String,Integer> bf1 = (e,s)->new Exec().exec(s);
        System.out.println(bf1.apply(new Exec(), "aaa"));
        BiFunction<Exec,String,Integer> bf2 = Exec::exec;
        System.out.println(bf2.apply(new Exec(), "bbb"));
    }
}

class Exec{
    public int exec(String str){
        return 1;
    }
}

class Too {
    public Integer Fun() {
        return 1;
    }

    public void foo() {
        System.out.println("foo...");
    }
}

class Too2 {
    public Integer Fun() {
        return 1;
    }

    public void foo() {
        System.out.println("foo...2");
    }

    public void show(String str) {
        System.out.println("foo" + str);
    }
}