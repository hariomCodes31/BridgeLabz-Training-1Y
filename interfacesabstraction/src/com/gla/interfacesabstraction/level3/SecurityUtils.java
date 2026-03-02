package com.gla.interfacesabstraction.level3;

public interface SecurityUtils {

    static boolean isStrongPassword(String password) {

        if (password.length() < 8) return false;

        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasUpper = password.matches(".*[A-Z].*");

        return hasDigit && hasUpper;
    }
}