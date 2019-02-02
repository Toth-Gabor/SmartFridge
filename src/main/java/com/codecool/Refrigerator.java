package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Fridge
 */
public class Refrigerator {
    
    protected String brand;
    protected String color;
    protected int temp;
    protected Cooler cooler;
    protected Freezer freezer;
    protected FridgeDoor fridgeDoor;
    protected FridgePlaceType fridgePlaceType;
    
    
    public Refrigerator(String brand, String color, int temp) {
        this.brand = brand;
        this.color = color;
        this.temp = temp;
        this.cooler = new Cooler();
        this.freezer = new Freezer();
        this.fridgeDoor = new FridgeDoor();
    }
    
    public enum FridgePlaceType{ // még nem sikerült jól használni! MENTOR MUST ASK!
        COOLER,FREEZER,FRIDGEDOOR
        
    }
    public boolean isFoodTypeValid(String foodType){
        
        List<String> foodtypes = Arrays.asList("drink", "meal");
        
        if (foodtypes.contains(foodType)){
            return true;
        } else {
            return false;
        }
        
    }
    
    public Food createFood (String foodType, String brand, String name, String expDate){
        
        if (isFoodTypeValid(foodType)){
            if (foodType.equals("drink")){
                return new Drink(brand, name, expDate);
            } else if (foodType.equals("meal")){
                return new Meal(brand, name, expDate);
            }
        } else {
            System.out.println("This food type is not exist!");
            
        }
        return null;
    }
    
    /**
    try - catch így jó?
    ötletek:
        esetleg switch-et használni az if-ek helyett?
     cél:
        enumot használni string helyett
     */
    
    public void addFood(String typePlace, int index, Food food) {
        
        List<String> choices = Arrays.asList("shelf", "drawer");
        if (typePlace.equals("COOLER")) {
            
            String choice = "";
            
            while (!choices.contains(choice)) {
                System.out.println("Type your choice: [shelf or drawer]");
                Scanner sc = new Scanner(System.in);
                choice = sc.nextLine().toLowerCase(); // ha elírná a user
            }
            if (choice.equals("shelf")){
                try {
                    cooler.getShelfByIndex(index).foods.add(food);
                } catch (IndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    cooler.getDraweByIndex(index).foods.add(food);
                } catch (IndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            }
            
            
        } else if (typePlace.equals("FREZEER")){
            try {
                freezer.getDraweByIndex(index).foods.add(food);
            } catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
            
            
        } else if (typePlace.equals("FRIDGEDOOR")){
            try {
                fridgeDoor.getShelfByIndex(index).foods.add(food);
            } catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
            
        }
    }
    
    public Cooler getCooler() {
        return cooler;
    }
    
    public Freezer getFreezer() {
        return freezer;
    }
    public FridgeDoor getFridgeDoor() {
        return fridgeDoor;
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
        fridgeDoor.printFrigeDoorStatus();
        cooler.printCoolerStatus();
        freezer.printFreezerStatus();
    }
    

    
    @Override
    public String toString() {
        return "Refrigerator{" +
            "brand='" + brand + '\'' +
            ", color='" + color + '\'' +
            ", temp=" + temp +
            '}';
    }
}
