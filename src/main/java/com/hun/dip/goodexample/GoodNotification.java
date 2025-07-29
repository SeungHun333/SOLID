package com.hun.dip.goodexample;

public class GoodNotification {

    private final MessageService messageService;

    public GoodNotification(MessageService messageService) {
        this.messageService = messageService; // 직접 구현체에 의존하지 않고 interface에 의존하여 구현체가 바뀌어도 영향 없음.
    }

    public void notify(String message) {
        messageService.sendMessage(message);
    }
}
