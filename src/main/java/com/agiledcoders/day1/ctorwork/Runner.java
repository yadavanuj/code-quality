package com.agiledcoders.day1.ctorwork;

public class Runner {
    public static void main(String[] args) {
        MessageService service = new MessageService(MessengerType.SMS);
        Message message = Message.builder().text("Hello").build();
        service.send(message);
    }
}
