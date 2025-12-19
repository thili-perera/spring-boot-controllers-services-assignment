package com.springIdApplication.Depenci.Services;

import com.springIdApplication.Depenci.Interface.ICalculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculator {

    @Override
    public int add(int a, int b){
        return a+b;
    }

    @Override
    public int substract(int a, int b){
        return a-b;
    }

    @Override
    public int multiply(int a, int b){
        return a*b;
    }
}
