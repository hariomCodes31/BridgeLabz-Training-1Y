package com.gla.interfacesabstraction.level4;

public class ExportMain {

    public static void main(String[] args) {

        DataExporter exporter = new CSVExporter();

        exporter.exportData();
        exporter.logExport();
    }
}