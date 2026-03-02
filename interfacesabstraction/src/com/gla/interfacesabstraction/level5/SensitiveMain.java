package com.gla.interfacesabstraction.level5;

public class SensitiveMain {

    public static void main(String[] args) {

        BankDetail details = new BankDetail("1234567890");

        if (details instanceof SensitiveData) {
            System.out.println("This object contains sensitive data.");
        }

        details.display();
    }
}