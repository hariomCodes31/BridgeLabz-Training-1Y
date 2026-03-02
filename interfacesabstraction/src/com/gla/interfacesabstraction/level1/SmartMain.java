package com.gla.interfacesabstraction.level1;

public class SmartMain {

    public static void main(String[] args) {

        SmartDevice device1 = new Light();
        SmartDevice device2 = new AC();

        device1.turnOn();
        device1.turnOff();

        device2.turnOn();
        device2.turnOff();
    }
}