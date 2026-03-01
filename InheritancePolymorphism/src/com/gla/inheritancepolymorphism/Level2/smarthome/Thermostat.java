package com.gla.inheritancepolymorphism.Level2.smarthome;

public class Thermostat extends Device {

    private double temperatureSetting;

    public Thermostat(String deviceId, boolean status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
        System.out.println("Device Type: Thermostat");
        System.out.println("------------------------");
    }
}