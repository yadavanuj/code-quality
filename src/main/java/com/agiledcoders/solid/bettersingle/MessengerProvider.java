package com.agiledcoders.solid.bettersingle;

import java.util.*;

public class MessengerProvider {
    private final EmailMessenger emailMessenger;
    private final SMSMessenger smsMessenger;
    private final WhatsappMessenger whatsappMessenger;

    private final Map<MessengerType, Messenger> messengerTypeMessengerMap = new HashMap<>();

    public MessengerProvider(ConfigProvider configProvider) {
        this.emailMessenger = new EmailMessenger(configProvider.getEmailConfig());
        this.smsMessenger = new SMSMessenger(configProvider.getSmsConfig());
        whatsappMessenger = new WhatsappMessenger();

        messengerTypeMessengerMap.put(MessengerType.Email, emailMessenger);
        messengerTypeMessengerMap.put(MessengerType.SMS, smsMessenger);
        messengerTypeMessengerMap.put(MessengerType.Whatsapp, whatsappMessenger);
    }

    public List<Messenger> getMessengers(Message message) {
        List<MessengerType> messengerTypes = getValidMessengers(message);
        List<Messenger> messengers = new ArrayList<>();
        messengerTypes.forEach(messengerType -> {
            Messenger messenger = messengerTypeMessengerMap.getOrDefault(messengerType, null);
            if (Objects.isNull(messenger)) {
                throw new IllegalStateException("Invalid messenger type(s)");
            }
            messengers.add(messenger);
        });

        return messengers;
    }

    private List<MessengerType> getValidMessengers(Message message) {
        List<MessengerType> types = new ArrayList<>();
        types.add(MessengerType.Email);
        types.add(MessengerType.SMS);
        types.add(MessengerType.Whatsapp);

        return types;
    }
}
