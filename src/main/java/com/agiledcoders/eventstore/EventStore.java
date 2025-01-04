package com.agiledcoders.eventstore;

import java.util.*;

public class EventStore {
    private Map<String, List<EventHandler>> store = new HashMap<>();

    // NOTE: No synchronization
    public void subscribe(String eventName, EventHandler eventHandler) {
        if (Objects.isNull(eventHandler)) {
            throw new IllegalArgumentException("Must not be null");
        }
        List<EventHandler> handlers = store.get(eventName);
        if (Objects.isNull(handlers)) {
            handlers = new ArrayList<>();
        }
        handlers.add(eventHandler);
        store.put(eventName, handlers);
    }

    public void raise(String eventName, Object obj) {
        List<EventHandler> handlers = store.get(eventName);
        if (Objects.nonNull(handlers)) {
            handlers.forEach(eventHandler -> eventHandler.handle(eventName, obj));
        }
    }
}
