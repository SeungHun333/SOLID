package com.hun.ocp;

public class NaverPay implements Payment{

    public void pay(int amount) {
        System.out.println("Paying " + amount + " with NaverPay");
    }
}
