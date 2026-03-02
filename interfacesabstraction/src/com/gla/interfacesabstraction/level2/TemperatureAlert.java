package com.gla.interfacesabstraction.level2;

import java.util.function.Predicate;

public class TemperatureAlert {

    public static void main(String[] args) {

        // Alert if temperature > 40
        Predicate<Double> isHighTemp = temp -> temp > 40;

        double currentTemp = 45.5;

        if (isHighTemp.test(currentTemp)) {
            System.out.println("ALERT! High Temperature: " + currentTemp);
        } else {
            System.out.println("Temperature Normal: " + currentTemp);
        }
    }
}