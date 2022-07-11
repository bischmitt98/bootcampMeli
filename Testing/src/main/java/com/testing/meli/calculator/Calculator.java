package com.testing.meli.calculator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calculator {
    private double n1, n2;

    public double division(){
        if(n2 == 0){
            return 0;
        }else{
            return n1/n2;
        }
    }
}
