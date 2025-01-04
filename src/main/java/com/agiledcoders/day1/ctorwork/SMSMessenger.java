package com.agiledcoders.day1.ctorwork;

public class SMSMessenger implements Messenger {
    @Override
    public void send(Message message) {
        System.out.println("------ SMS ------");
        System.out.println(message.getText());
    }
}
