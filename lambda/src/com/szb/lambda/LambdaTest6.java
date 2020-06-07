package com.szb.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 构造引用
 */
public class LambdaTest6 {
    public static void main(String[] args) {
        Supplier<Person> s1 = ()->new Person();
        s1.get();

        Supplier<Account> s2 = Account::new;
        s2.get();

        Consumer<Integer> c1 = Account::new;
        c1.accept(111);

        Consumer<String> c2 = Account::new;
        c2.accept("hehe");

        Function<String,Account> f1 = Account::new;
        f1.apply("jfiewjifew");
    }
}

class Person {
    public Person() {
        System.out.println("Person无参构造方法");
    }
}

class Account {
    public Account() {
        System.out.println("Account无参构造方法");
    }

    public Account(int num) {
        System.out.println("有参构造方法" + num);
    }

    public Account(String str) {
        System.out.println("有参构造方法" + str);
    }
}