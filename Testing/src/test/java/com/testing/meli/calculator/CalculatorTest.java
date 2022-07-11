package com.testing.meli.calculator;

import com.testing.meli.utils.CreateCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;
    @BeforeEach
    public void setup(){
        calculator = CreateCalculator.create();
    }

    @Test
    @DisplayName("Validate params different of zero")
    void division_When_Param_Different_Zero(){
        Calculator calculator = new Calculator();
        double expected = CreateCalculator.create().getN1() / CreateCalculator.create().getN2();
        double res = calculator.division();
        assertEquals(expected, res);
    }

    @Test

    @DisplayName("Validate params different of zero")
    void division_When_Param_Equal_Zero(){
        Calculator calculator = new Calculator();
        double a = 4;
        double b = 0;
        double expected = 0;
        double res = calculator.division();
        assertEquals(expected, res);
    }
}
