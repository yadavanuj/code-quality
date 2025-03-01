package com.agiledcoders.solid.bettersingle;

public class SMSMessenger implements Messenger {
    private final SMSConfig config;

    public SMSMessenger(SMSConfig config) {
        this.config = config;
    }

    public void send(Message message) {
        System.out.println("------ SMS ------");
        System.out.println(message.getText());
    }

    public static class SMSConfig {

    }
}
