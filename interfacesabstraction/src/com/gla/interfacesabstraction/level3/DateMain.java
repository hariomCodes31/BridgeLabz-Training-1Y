package com.gla.interfacesabstraction.level3;

import java.time.LocalDate;

public class DateMain {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        String formatted = DateUtils.formatDate(today, "dd-MM-yyyy");

        System.out.println("Formatted Date: " + formatted);
    }
}