package com.gla.inheritancepolymorphism.Level5.vehicle;

public class ElectricVehicle extends Vehicle {

    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println("Electric vehicle is charging.");
    }
}