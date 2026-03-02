package com.gla.interfacesabstraction.level4;

public interface VehicleDashboard {

    void showSpeed(int speed);

    default void showFuelLevel(int fuel) {
        System.out.println("Fuel Level: " + fuel + "%");
    }
}