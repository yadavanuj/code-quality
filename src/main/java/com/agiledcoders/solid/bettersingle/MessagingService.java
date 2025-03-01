package com.agiledcoders.solid.bettersingle;

import java.util.List;

public class MessagingService {
    private final MessengerProvider messengerProvider;

    public MessagingService(MessengerProvider messengerProvider) {
        this.messengerProvider = messengerProvider;
    }

    public void send(Message message) {
        List<Messenger> messengers = messengerProvider.getMessengers(message);
        messengers.forEach(messenger -> messenger.send(message));
    }
}
