package com.springIdApplication.Depenci.Controller;

import com.springIdApplication.Depenci.Interface.ICalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final ICalculator _contextCalculator;

    public CalculatorController(ICalculator calculatorService){
        this._contextCalculator = calculatorService;
    }

    @GetMapping("/add")
    public int AddNumbers(@RequestParam int a, @RequestParam int b){
        return this._contextCalculator.add(a,b);
    }

    @GetMapping("/subtract")
    public int SubtractNumbers(@RequestParam int a, @RequestParam int b){
        return this._contextCalculator.substract(a,b);
    }

    @GetMapping("/multiply")
    public int MultiplyNumbers(@RequestParam int a, @RequestParam int b){
        return this._contextCalculator.multiply(a,b);
    }

}
