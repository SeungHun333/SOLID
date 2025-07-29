package com.hun.dip.goodexample;

public class SmsService implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS 전송: " + message);
    }
}
