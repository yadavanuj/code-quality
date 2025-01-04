package com.agiledcoders.factory;

public class EmailMessenger implements Messenger {
    @Override
    public void send(Message message) {
        System.out.println("------ Email ------");
        System.out.println(message.getText());
    }
}
