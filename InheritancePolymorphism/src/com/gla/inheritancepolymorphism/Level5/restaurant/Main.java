package com.gla.inheritancepolymorphism.Level5.restaurant;

public class Main {

    public static void main(String[] args) {

        Worker[] workers = {
                new Chef("Raj", 101),
                new Waiter("Amit", 102)
        };

        for (Worker w : workers) {
            ((Person) w).displayDetails();
            w.performDuties();
            System.out.println("--------------------");
        }
    }
}