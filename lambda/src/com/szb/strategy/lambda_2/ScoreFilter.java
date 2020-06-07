package com.szb.strategy.lambda_2;

import com.szb.strategy.lambda_1.Student;

public class ScoreFilter implements StudentFilter {
    @Override
    public boolean compare(Student student) {
        return student.getScore()>77;
    }
}
