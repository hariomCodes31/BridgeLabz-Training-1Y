package com.gla.Constructor.Level1;
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;

    CarRental(String c, String m, int d, double cost) {
        customerName = c;
        carModel = m;
        rentalDays = d;
        costPerDay = cost;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car: " + carModel);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}