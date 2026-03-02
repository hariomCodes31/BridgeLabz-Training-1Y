package com.gla.interfacesabstraction.level4;

public interface DataExporter {

    void exportData();

    default void logExport() {
        System.out.println("Export logged successfully.");
    }
}