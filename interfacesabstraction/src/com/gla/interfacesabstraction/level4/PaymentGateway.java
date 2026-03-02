package com.gla.interfacesabstraction.level4;

public interface PaymentGateway {

    void processPayment(double amount);

    default void generateReceipt(double amount) {
        System.out.println("Receipt Generated for ₹" + amount);
    }
}