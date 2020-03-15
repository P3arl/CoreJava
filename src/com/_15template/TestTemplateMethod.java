package com._15template;

public class TestTemplateMethod {
    public static void main(String[] args) {
        DataProcessor excelFile = new ExcelFile();
        excelFile.readProcessAndSave();
        /*excelFile.readData();
        excelFile.processData();
        excelFile.saveData();*/

        DataProcessor textFile = new TextFile();
        textFile.readProcessAndSave();
        /*textFile.readData();
        textFile.processData();
        textFile.saveData();*/
    }
}
