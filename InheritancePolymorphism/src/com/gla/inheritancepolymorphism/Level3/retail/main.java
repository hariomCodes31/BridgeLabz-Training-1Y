package com.gla.inheritancepolymorphism.Level3.retail;

public class main {

    public static void main(String[] args) {

        Order order = new DeliveredOrder(
                101,
                "01-03-2026",
                "TRK12345",
                "05-03-2026"
        );

        order.displayInfo();
        System.out.println("Status: " + order.getOrderStatus());
    }
}