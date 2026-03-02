package com.gla.interfacesabstraction.level2;

import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        Function<String, Integer> getLength = str -> str.length();

        String message = "Game Of Thrones";

        int length = getLength.apply(message);

        System.out.println("Message: " + message);
        System.out.println("Length: " + length);
    }
}