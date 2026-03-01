package com.gla.inheritancepolymorphism.Level1.animal;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("Rocky", 3),
                new Cat("Misty", 2),
                new Bird("Tweety", 1)
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
