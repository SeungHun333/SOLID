package com.hun.ocp;

public class KakaoPay implements Payment{

    public void pay(int amount) {
        System.out.println("Paying " + amount + " with KakaoPay");
    }
}
