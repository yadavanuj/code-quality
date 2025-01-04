package com.agiledcoders.day1.ctorwork;

public class WhatsappMessenger implements Messenger {
    @Override
    public void send(Message message) {
        System.out.println("------ Whatsapp ------");
        System.out.println(message.getText());
    }
}
