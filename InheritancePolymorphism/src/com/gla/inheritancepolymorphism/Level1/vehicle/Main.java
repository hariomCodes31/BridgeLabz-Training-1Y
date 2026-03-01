package com.gla.inheritancepolymorphism.Level1.vehicle;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car(180, "Petrol", 5),
                new Truck(120, "Diesel", 10.5),
                new Motorcycle(150, "Petrol", true)
        };

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}