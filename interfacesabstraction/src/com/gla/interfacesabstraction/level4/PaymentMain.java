package com.gla.interfacesabstraction.level4;

public class PaymentMain {

    public static void main(String[] args) {

        PaymentGateway gateway = new Paytm();

        gateway.processPayment(2000);
        gateway.generateReceipt(2000);
    }
}