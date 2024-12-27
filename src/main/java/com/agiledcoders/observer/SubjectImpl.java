package com.agiledcoders.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SubjectImpl implements Subject<String> {
    private final List<Observer<String>> observers = new ArrayList<>();

    @Override
    public void register(Observer<String> observer) {
        if (Objects.isNull(observer)) {
            throw new IllegalArgumentException("Observer must be non-null");
        }
        this.observers.add(observer);
    }

    @Override
    public void unregister(Observer<String> observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notify(String data) {
        this.observers.forEach(stringObserver -> stringObserver.update(data));
    }
}
