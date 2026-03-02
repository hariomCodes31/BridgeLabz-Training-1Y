package com.gla.interfacesabstraction.level4;

public class CSVExporter implements DataExporter {

    @Override
    public void exportData() {
        System.out.println("Data exported as CSV.");
    }
}