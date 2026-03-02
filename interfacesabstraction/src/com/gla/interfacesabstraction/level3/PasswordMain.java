package com.gla.interfacesabstraction.level3;

public class PasswordMain {

    public static void main(String[] args) {

        String password = "Hello123";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}