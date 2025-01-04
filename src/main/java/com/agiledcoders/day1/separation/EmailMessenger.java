package com.agiledcoders.day1.separation;

public class EmailMessenger implements Messenger {
    @Override
    public void send(Message message) {
        System.out.println("------ Email ------");
        System.out.println(message.getText());
    }
}
