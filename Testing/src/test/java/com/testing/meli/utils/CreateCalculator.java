package com.testing.meli.utils;

import com.testing.meli.calculator.Calculator;
import lombok.Data;

@Data
public class CreateCalculator {
    private static double n1 = 4, n2 = 2;

    public static  Calculator create(){
        return new Calculator(n1, n2);
    }

    public static  Calculator createWithZero(){
        return new Calculator(n1, 0);
    }
}
