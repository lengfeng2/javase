package com.szb.strategy.lambda_1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(10);
        students.add(new Student("zhangsan", 15, 67));
        students.add(new Student("lisi", 21, 99));
        students.add(new Student("wangwu", 18, 53));
        students.add(new Student("maxiaoliu", 22, 87));
        students.add(new Student("wanglaoliu", 12, 69));
        students.add(new Student("yuzhiboyou", 19, 77));
        //选出年龄大于18的学生
        findByAge(students);
        //选出分数大于77的学生
    }

    private static void findByAge(List<Student> students){
        ArrayList<Student> list = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge()>18) {
                list.add(student);
            }
        }
        printStudent(list);
    }

    //打印循环输出学生信息
    private static void printStudent(ArrayList<Student> list){
        list.forEach(System.out::println);
    }
}
