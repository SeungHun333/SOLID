package com.hun.ocp;

public class CreditCard implements Payment{

    public void pay(int amount) {
        System.out.println("Paying " + amount + " with credit card");
    }
}
