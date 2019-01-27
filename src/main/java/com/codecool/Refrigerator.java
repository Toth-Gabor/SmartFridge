package com.codecool;

/**
 * Fridge
 */
public class Refrigerator {
    
    protected String brand;
    protected String color;
    protected int temp;
    protected Cooler cooler;
    protected Freezer freezer;
    
    public Refrigerator(String brand, String color, int temp) {
        this.brand = brand;
        this.color = color;
        this.temp = temp;
        this.cooler = new Cooler();
        this.freezer = new Freezer();
    }
    
    public Cooler getCooler() {
        return cooler;
    }
    
    public Freezer getFreezer() {
        return freezer;
    }
    
    @Override
    public String toString() {
        return "Refrigerator{" +
            "brand='" + brand + '\'' +
            ", color='" + color + '\'' +
            ", temp=" + temp +
            '}';
    }
    

    
    public String getBrand() {
        return this.brand;
    }
    
    public String getColor()
    {
        return this.color;
    }
    
    public int getTemp()
    {
        return this.temp;
    }
    
    public void setTemp(int temp) {
        this.temp = temp;
    }
    
    public void printFridgeStatus() {
        System.out.println("The " + color + " " + brand + " 3000 smart fridge status:\n");
        System.out.println("  Temperature: " + getTemp() + "\n");
        cooler.printCoolerStatus();
    }
}
