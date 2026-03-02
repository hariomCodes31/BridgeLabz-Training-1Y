package com.gla.interfacesabstraction.level4;

public class CarDashboard implements VehicleDashboard {

    @Override
    public void showSpeed(int speed) {
        System.out.println("Current Speed: " + speed + " km/h");
    }
}