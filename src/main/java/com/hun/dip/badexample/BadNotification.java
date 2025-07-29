package com.hun.dip.badexample;

public class BadNotification {

    private final EmailService emailService;

    public BadNotification(EmailService emailService) {
        this.emailService = emailService; // 고수준 모듈에서 저수준 모듈인 EmailService 클래스를 직접 의존하고 있음.
    }

    public void notifyUser(String message) {
        emailService.sendEmail(message);
    }
}
