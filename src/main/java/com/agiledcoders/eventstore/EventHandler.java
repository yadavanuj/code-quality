package com.agiledcoders.eventstore;

public interface EventHandler {
    void handle(String eventName, Object obj);
}
