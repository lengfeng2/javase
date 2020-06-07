package com.szb.strategy.lambda_3;

import com.szb.strategy.lambda_1.Student;
import com.szb.strategy.lambda_2.StudentFilter;

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
        //选出年龄大于19的学生
//        findByFilter(students, new StudentFilter() {
//            @Override
//            public boolean compare(Student student) {
//                return student.getAge()>19;
//            }
//        });
        //选出分数大于77的学生
//        findByFilter(students,e->e.getScore()>77);

        //选出名字长度大于5的学生
        findByFilter(students,e->e.getName().length()>5);

    }


    private static void findByFilter(List<Student> students, StudentFilter filter){
        ArrayList<Student> list = new ArrayList<>(10);
        for (Student student : students) {
            if (filter.compare(student)){
                list.add(student);
            }
        }
        printStudent(list);
    }

    //循环输出打印学生信息
    private static void printStudent(ArrayList<Student> list){
        list.forEach(System.out::println);
    }
}
