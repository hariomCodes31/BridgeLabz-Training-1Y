package com.gla.interfacesabstraction.level5;

public class SerializationMain {

    public static void main(String[] args) {

        User user = new User("Hariom");

        if (user instanceof SerializableMarker) {
            System.out.println("User is marked for serialization.");
        }

        user.display();
    }
}