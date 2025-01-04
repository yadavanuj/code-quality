package com.agiledcoders.mockito;

public class Calculator {
    private MathService mathService;

    public Calculator(MathService mathService) {
        this.mathService = mathService;
    }

    public int add(int x, int y) {
        return mathService.add(x, y);
    }
}
