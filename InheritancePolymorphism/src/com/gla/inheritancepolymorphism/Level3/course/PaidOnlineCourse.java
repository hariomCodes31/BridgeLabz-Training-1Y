package com.gla.inheritancepolymorphism.Level3.course;

public class PaidOnlineCourse extends OnlineCourse {

    private double fee;
    private double discount; // percentage

    public PaidOnlineCourse(String courseName, int duration,
                            String platform, boolean isRecorded,
                            double fee, double discount) {

        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        double finalFee = fee - (fee * discount / 100);
        System.out.println("Original Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: " + finalFee);
        System.out.println("------------------------");
    }
}