package com.gla.interfacesabstraction.level1;

public class PaymentMain {

    public static void main(String[] args) {

        Payment p1 = new UPI();
        Payment p2 = new CreditCard();

        p1.pay(1000);
        p2.pay(2500);
    }
}