package com.agiledcoders.day1.suboptimal;

public class Calculator {
    private final MathService service;

    public Calculator() {
        service = new MathService();
    }

    public int add(int x, int y) {
        return service.add(x, y);
    }
}
