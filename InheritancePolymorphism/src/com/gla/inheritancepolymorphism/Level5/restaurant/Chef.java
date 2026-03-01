package com.gla.inheritancepolymorphism.Level5.restaurant;

public class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef is cooking food.");
    }
}