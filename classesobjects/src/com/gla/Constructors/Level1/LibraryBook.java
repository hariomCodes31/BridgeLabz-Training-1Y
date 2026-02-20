package com.gla.Constructor.Level1;

class LibraryBook {
    String title;
    String author;
    double price;
    boolean availability;

    LibraryBook(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        availability = true;
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book not available.");
        }
    }
}