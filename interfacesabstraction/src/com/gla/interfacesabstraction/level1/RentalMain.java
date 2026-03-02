package com.gla.interfacesabstraction.level1;

public class RentalMain {

    public static void main(String[] args) {

        Rentable r1 = new Car();
        Rentable r2 = new Bike();

        r1.rent();
        r1.returnVehicle();

        r2.rent();
        r2.returnVehicle();
    }
}