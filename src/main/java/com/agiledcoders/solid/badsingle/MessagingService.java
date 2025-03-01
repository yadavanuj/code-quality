package com.agiledcoders.solid.badsingle;

import java.util.List;

public class MessagingService {
    /**
     * MAINTAINING STATE
     */
    private final EmailMessenger emailMessenger;
    private final SMSMessenger smsMessenger;

    /**
     * INITIALIZATION
     */
    public MessagingService(EmailMessenger.EmailConfig emailConfig, SMSMessenger.SMSConfig smsConfig) {
        emailMessenger = new EmailMessenger(emailConfig);
        smsMessenger = new SMSMessenger(smsConfig);
    }

    /**
     * ACTUAL WORK
     */
    public void send(Message message, List<MessengerType> messengerTypes) {

        messengerTypes.forEach(messengerType -> {
            if (messengerType == MessengerType.Email) {
                emailMessenger.send(message);
            } else if (messengerType == MessengerType.SMS) {
                smsMessenger.send(message);
            } else {
                throw new IllegalArgumentException("Invalid messenger type.");
            }
        });

    }
}
