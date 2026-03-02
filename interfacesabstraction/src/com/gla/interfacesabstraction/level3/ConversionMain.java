package com.gla.interfacesabstraction.level3;

public class ConversionMain {

    public static void main(String[] args) {

        double miles = UnitConversion.kmToMiles(10);
        double pounds = UnitConversion.kgToPounds(5);

        System.out.println("10 km = " + miles + " miles");
        System.out.println("5 kg = " + pounds + " pounds");
    }
}