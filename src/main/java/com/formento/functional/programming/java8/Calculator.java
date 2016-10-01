package com.formento.functional.programming.java8;

import java.util.function.BinaryOperator;

public class Calculator {

    private Calculator() {
    }

    public static Integer sum(Integer x, Integer y) {
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        return sum.apply(x, y);
    }

}
