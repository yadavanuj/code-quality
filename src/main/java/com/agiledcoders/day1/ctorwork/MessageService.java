package com.agiledcoders.day1.ctorwork;

public class MessageService {
    private Messenger messenger;
    public MessageService(MessengerType messengerType) {
        switch (messengerType) {
            case SMS: messenger = new SMSMessenger();
            break;
            case Email: messenger = new EmailMessenger();
            break;
            case Whatsapp: messenger = new WhatsappMessenger();
            break;
            default: throw new IllegalStateException("Messenger type not supported");
        }
    }

    public void send(Message message) {
        messenger.send(message);
    }
}
