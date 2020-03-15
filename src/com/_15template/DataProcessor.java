package com._15template;

// Template Pattern: subclasses decide how to implement steps in algorithm
public abstract class DataProcessor {

    public void readProcessAndSave() {
        readData();
        processData();
        saveData();
    }
    public abstract void readData();
    public abstract void processData();
    public void saveData() {
        System.out.println("saving data");
    }
}
