package com.gla.interfacesabstraction.level5;

public class PrototypeMain {

    public static void main(String[] args) {

        Product p = new Product("Laptop");

        if (p instanceof Prototype) {
            System.out.println("Product supports cloning prototype behavior.");
        }

        p.showProduct();
    }
}