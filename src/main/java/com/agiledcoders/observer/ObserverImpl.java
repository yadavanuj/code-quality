package com.agiledcoders.observer;

public class ObserverImpl implements Observer<String> {
    private static int count;

    private final int id;

    public ObserverImpl() {
        id = count++;
    }

    @Override
    public void update(String data) {
        System.out.println("----------------------------------------");
        System.out.println("Observer Id: " + id + " received update.");
        System.out.println(data);
        System.out.println("----------------------------------------");
    }
}
