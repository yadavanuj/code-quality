package com.agiledcoders.day1.better;

public class Calculator {
    private final MathService service;

    Calculator(MathService mathService) {
        service = mathService;
    }

    public Calculator() {
        this(new MathService());
    }

    public int add(int x, int y) {
        return service.add(x, y);
    }
}
