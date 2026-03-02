package com.gla.interfacesabstraction.level4;

public class Paytm implements PaymentGateway {

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " processed via Paytm.");
    }
}