package com.gla.Constructor.Level1;

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized
    HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    // Copy Constructor
    HotelBooking(HotelBooking h) {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }

    void display() {
        System.out.println(guestName + " " + roomType + " " + nights);
    }
}