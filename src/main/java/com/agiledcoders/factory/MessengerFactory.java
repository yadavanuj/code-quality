package com.agiledcoders.factory;

public class MessengerFactory {
    public Messenger getMessenger(MessengerType messengerType) {
        switch (messengerType) {
            case SMS: return new SMSMessenger();
            case Email: return new EmailMessenger();
            case Whatsapp: return new WhatsappMessenger();
            default: throw new IllegalStateException("Messenger type not supported");
        }
    }
}
