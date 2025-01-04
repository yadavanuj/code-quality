package com.agiledcoders.day1.separation;


public class Runner {
    public static void main(String[] args) {
        // Great for DI
        // Object construction and lookup
        MessengerFactory factory = new MessengerFactory();

        // Business Logic
        MessageService service = new MessageService(factory);
        Message message = Message.builder().text("Hello").build();
        service.send(message, MessengerType.Email);
        service.send(message, MessengerType.Email);
    }
}
