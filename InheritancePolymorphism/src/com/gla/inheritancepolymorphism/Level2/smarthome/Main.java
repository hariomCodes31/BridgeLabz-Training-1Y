package com.gla.inheritancepolymorphism.Level2.smarthome;

public class Main {

    public static void main(String[] args) {

        Device device = new Thermostat("T101", true, 24.5);

        device.displayStatus();
    }
}