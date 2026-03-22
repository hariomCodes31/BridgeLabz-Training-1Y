package com.gla.exceptionhandling;

public class NestedTry {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int index = 5;
        int divisor = 0;

        try {
            try {
                System.out.println(arr[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

            System.out.println(arr[1] / divisor);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}