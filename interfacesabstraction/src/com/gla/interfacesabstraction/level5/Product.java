package com.gla.interfacesabstraction.level5;

public class Product implements Prototype {

    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public void showProduct() {
        System.out.println("Product: " + productName);
    }
}