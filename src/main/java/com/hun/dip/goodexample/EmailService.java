package com.hun.dip.goodexample;

public class EmailService implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("Email 전송: " + message);
    }
}
