package com.agiledcoders.day1.separation;

import java.util.Objects;

public class MessengerFactory {
    private SMSMessenger smsMessenger;
    private EmailMessenger emailMessenger;
    private WhatsappMessenger whatsappMessenger;

    // NOTE: No synchronization is done
    public Messenger getMessenger(MessengerType messengerType) {
        switch (messengerType) {
            case SMS: if (Objects.isNull(smsMessenger)) smsMessenger = new SMSMessenger();
                return smsMessenger;
            case Email: if (Objects.isNull(emailMessenger)) emailMessenger = new EmailMessenger();
                return emailMessenger;
            case Whatsapp: if (Objects.isNull(whatsappMessenger)) whatsappMessenger = new WhatsappMessenger();
                return whatsappMessenger;
            default: throw new IllegalStateException("Messenger type not supported");
        }
    }
}
