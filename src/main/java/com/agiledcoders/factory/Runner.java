package com.agiledcoders.factory;

public class Runner {
    public static void main(String[] args) {
        MessengerFactory factory = new MessengerFactory();
        Message message = Message.builder().text("Hello").build();
        Messenger messenger = factory.getMessenger(MessengerType.SMS);
        messenger.send(message);
    }
}
