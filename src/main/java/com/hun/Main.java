package com.hun;

import com.hun.dip.goodexample.EmailService;
import com.hun.dip.goodexample.GoodNotification;
import com.hun.dip.goodexample.MessageService;
import com.hun.dip.goodexample.SmsService;
import com.hun.lsp.Bird;
import com.hun.lsp.Penguin;
import com.hun.ocp.CreditCard;
import com.hun.ocp.KakaoPay;
import com.hun.ocp.NaverPay;
import com.hun.ocp.PaymentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // OCP 예제
        PaymentService paymentService1 = new PaymentService(new CreditCard());
        paymentService1.pay(1000);

        PaymentService paymentService2 = new PaymentService(new KakaoPay());
        paymentService2.pay(1000);

        PaymentService paymentService3 = new PaymentService(new NaverPay());
        paymentService3.pay(1000);

        // LSP 예제
        Bird eagle = new Bird();
        eagle.fly();

        Bird penguin = new Penguin();
        penguin.fly();

        // DIP 예제
        MessageService service1 = new EmailService();
        MessageService service2 = new SmsService();
        GoodNotification notification1 = new GoodNotification(service1);
        GoodNotification notification2 = new GoodNotification(service2);

        notification1.notify("긴급 알림!");
        notification2.notify("긴급 알림!");
    }
}
