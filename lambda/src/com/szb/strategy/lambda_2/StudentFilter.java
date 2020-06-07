package com.szb.strategy.lambda_2;

import com.szb.strategy.lambda_1.Student;

public interface StudentFilter {
    boolean compare(Student student);
}
