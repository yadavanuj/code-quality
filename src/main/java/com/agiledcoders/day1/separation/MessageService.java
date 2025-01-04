package com.agiledcoders.day1.separation;

public class MessageService {
    private final MessengerFactory factory;
    public MessageService(MessengerFactory factory) {
        this.factory = factory;
    }

    public void send(Message message, MessengerType messengerType) {
        Messenger messenger = factory.getMessenger(messengerType);
        System.out.println(messenger.hashCode());
        messenger.send(message);
    }
}
