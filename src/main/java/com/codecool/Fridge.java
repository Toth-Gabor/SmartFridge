package com.codecool;

/**
 * Fridge
 */
public class Fridge {
    
    protected String brand;
    protected String color;
    protected int temp;
    protected Cooler cooler;
    protected Freezer freezer;
 
    
    public Fridge(String brand, String color, int temp) {
        this.brand = brand;
        this.color = color;
        this.temp = temp;
        this.cooler = new Cooler();
        this.freezer = new Freezer();
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
    
    public void printFridgeStaus()
    {
        System.out.println("The " + color + brand + " 3000 smart fridge status:\n");
        System.out.println("\tTemperature: " + getTemp());
        // fridgeDoor.getDoorPosition() hiányzik!!
        // fridgeLamp.fridgeLamp() hiányzik!!
    }
}