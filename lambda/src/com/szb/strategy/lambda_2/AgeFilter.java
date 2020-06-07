package com.szb.strategy.lambda_2;

import com.szb.strategy.lambda_1.Student;

public class AgeFilter implements StudentFilter {
    @Override
    public boolean compare(Student student) {
        return student.getAge()>18;
    }
}
