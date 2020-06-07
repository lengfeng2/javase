package com.szb.stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    //通过数组创建
    private static void gen1() {
        String[] strs = {"a", "b", "c", "d"};
        Stream<String> stream = Stream.of(strs);
        stream.forEach(System.out::println);
    }

    //通过集合创建
    private static void gen2() {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5");
        list.stream().forEach(System.out::println);
    }

    //通过generate来创建
    private static void gen3() {
        Stream<Integer> generate = Stream.generate(() -> 1);
        generate.limit(1).forEach(System.out::println);
    }

    //通过iterator创建
    private static void gen4() {
        Stream<Integer> iterate = Stream.iterate(1, x -> x + 1);
        iterate.limit(10).forEach(System.out::println);
    }

    //其他方式
    private static void gen5() {
        String str = "jfiewfwe";
        IntStream chars = str.chars();
        chars.forEach(System.out::println);
    }


    public static void main(String[] args) {
//        gen1();
//        gen2();
//        gen3();
//        gen4();
//        gen5();


        //中间操作
        Arrays.asList(1, 2, 3, 4, 5, 6).stream().filter(x -> x % 2 == 0).forEach(System.out::println);
        //求出集合所有偶数之和
        int sum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
        System.out.println(sum);
        //求出集合最大值
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Optional<Integer> max = list.stream().max(Comparator.comparingInt(a -> a));
        System.out.println(max.get());
        //求出集合的最小值
        System.out.println(list.stream().min(Comparator.comparingInt(a -> a)).get());

        Optional<Integer> any = list.stream().filter(x -> x % 2 == 0).findAny();
        System.out.println(any.get());

        Optional<Integer> first = list.stream().filter(x -> x % 2 == 0).findFirst();
        System.out.println(first.get());

        Stream<Integer> stream = list.stream().filter(i -> {
            System.out.println("运行代码");
            return i % 2 == 0;
        });
        System.out.println(stream.findFirst().get());

        System.out.println("--------------");
        //求集合的最大值和最小值，不用min和max方法
        Optional<Integer> minNumber = list.stream().sorted().findFirst();
        System.out.println(minNumber.get());
        Optional<Integer> maxNumber = list.stream().sorted((a, b) -> b - a).findFirst();
        System.out.println(maxNumber.get());

        System.out.println("------------");
        Arrays.asList("java", "C#", "python", "scala", "javascript").stream().sorted().forEach(System.out::println);
        System.out.println("------------");
        Stream.of("java", "C#", "python", "scala", "javascript").sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

        //想将集合中的元素进行过滤同时返回一个集合对象
        System.out.println("------------");
        list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);

        //去重操作
        System.out.println("------------");
        Arrays.asList(1, 2, 3, 3, 2, 2, 5, 6, 6, 6, 7, 4, 1).stream().distinct().sorted().collect(Collectors.toList()).forEach(System.out::println);

        //去重操作方式二
        System.out.println("------------");
        Arrays.asList(1, 2, 3, 3, 2, 2, 5, 6, 6, 6, 7, 4, 1).stream().collect(Collectors.toSet()).forEach(System.out::println);

        //打印20-30数的集合
        System.out.println("------------");
        Stream.iterate(1, x -> x + 1).limit(50).skip(20).limit(10).forEach(System.out::println);

        //求和并且简化写法
        System.out.println("------------");
        String str = "11,22,33,44,55";
        System.out.println(Stream.of(str.split(",")).mapToInt(x -> Integer.valueOf(x)).sum());
        System.out.println(Stream.of(str.split(",")).mapToInt(Integer::valueOf).sum());
        System.out.println(Stream.of(str.split(",")).map(x -> Integer.valueOf(x)).mapToInt(x -> x).sum());
        System.out.println(Stream.of(str.split(",")).map(Integer::valueOf).mapToInt(x -> x).sum());

        //创建自定义一组对象
        System.out.println("------------");
        String str2 = "java,scala,python";
        Stream.of(str2.split(",")).map(x -> new Person(x)).forEach(System.out::println);
        System.out.println("------------");
        Stream.of(str2.split(",")).map(Person::new).forEach(System.out::println);
        System.out.println("------------");
        Stream.of(str2.split(",")).map(x -> Person.build(x)).forEach(System.out::println);
        System.out.println("------------");
        Stream.of(str2.split(",")).map(Person::build).forEach(System.out::println);

        //将str中的每一个数打印出来，并求和
        System.out.println("------------");
        System.out.println(Stream.of(str.split(",")).peek(System.out::println).mapToInt(Integer::valueOf).sum());

        //是否满足条件
        System.out.println(list.stream().allMatch(x -> x % 2 == 0));
        //只要一个满足条件
        System.out.println(list.stream().anyMatch(x -> x % 2 == 0));



    }

}
