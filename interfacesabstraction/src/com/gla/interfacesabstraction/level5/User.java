package com.gla.interfacesabstraction.level5;

public class User implements SerializableMarker {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("User: " + name);
    }
}