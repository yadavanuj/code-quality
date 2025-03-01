package com.agiledcoders.solid.badsingle;

public class EmailMessenger {
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
