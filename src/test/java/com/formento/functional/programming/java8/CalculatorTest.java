package com.formento.functional.programming.java8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void sum() throws Exception {
        assertEquals(Integer.valueOf(3), Calculator.sum(1, 2));
    }

}
