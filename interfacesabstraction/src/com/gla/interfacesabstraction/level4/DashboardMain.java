package com.gla.interfacesabstraction.level4;

public class DashboardMain {

    public static void main(String[] args) {

        VehicleDashboard dashboard = new CarDashboard();

        dashboard.showSpeed(80);
        dashboard.showFuelLevel(60);
    }
}