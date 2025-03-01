package com.agiledcoders.solid.bettersingle;

public class EmailMessenger implements Messenger {
    private final EmailConfig config;
    public EmailMessenger(EmailConfig config) {
        this.config = config;
    }
    public void send(Message message) {
        System.out.println("------ Email ------");
        System.out.println(message.getText());
    }

    public static class EmailConfig {

    }
}
