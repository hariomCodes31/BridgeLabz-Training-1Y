package com.gla.inheritancepolymorphism.Level1.animal;


public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp Chirp");
    }
}