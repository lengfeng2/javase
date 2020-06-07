package com.szb.lambda;

public class LambdaTest {
    public static void main(String[] args) {
        TeacherDao td1 = (Teacher teacher)->{return 1;};
        TeacherDao td2 = teacher->{return 2;};
        TeacherDao td3 = teacher -> 3;

        //输出
        System.out.println(td1.get(new Teacher()));
        System.out.println(td2.get(new Teacher()));
        System.out.println(td3.get(new Teacher()));
    }
}
