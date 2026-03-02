package com.gla.interfacesabstraction.level2;

public class BackgroundJob {

    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Background job is running...");
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}