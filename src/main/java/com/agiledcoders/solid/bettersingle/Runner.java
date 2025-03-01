package com.agiledcoders.solid.bettersingle;

public class Runner {
    public static void main(String[] args) {
        ConfigProvider configProvider = new ConfigProvider();
        MessengerProvider messengerProvider = new MessengerProvider(configProvider);
        MessagingService service = new MessagingService(messengerProvider);
        Message message = Message.builder().text("Better Hello").build();
        service.send(message);
    }
}
