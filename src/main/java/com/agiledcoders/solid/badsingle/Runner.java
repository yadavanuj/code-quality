package com.agiledcoders.solid.badsingle;

import java.util.Collections;

public class Runner {
    public static void main(String[] args) {
        MessagingService service = new MessagingService(new EmailMessenger.EmailConfig(), new SMSMessenger.SMSConfig());
        Message message = Message.builder().text("Hello").build();
        service.send(message, Collections.singletonList(MessengerType.SMS));
    }
}
