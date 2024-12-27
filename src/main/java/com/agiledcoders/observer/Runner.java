package com.agiledcoders.observer;

public class Runner {
    public static void main(String[] args) {
        Observer<String> first = new ObserverImpl();
        Observer<String> second = new ObserverImpl();

        Subject<String> subject = new SubjectImpl();

        subject.register(first);
        subject.register(second);

        subject.notify("First iteration");

        subject.unregister(first);
        subject.notify("Second iteration");
    }
}
