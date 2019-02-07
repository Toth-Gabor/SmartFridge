package com.codecool;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Fridge
 */
public class Refrigerator implements Serializable {
    
    private String brand;
    private String color;
    private int temp;
    private Cooler cooler;
    private Freezer freezer;
    private FridgeDoor fridgeDoor;
    private FridgePlaceType fridgePlaceType;
    
    
    public Refrigerator(String brand, String color, int temp) {
        this.brand = brand;
        this.color = color;
        this.temp = temp;
        this.cooler = new Cooler();
        this.freezer = new Freezer();
        this.fridgeDoor = new FridgeDoor();
    }
    
    public enum FridgePlaceType{
        COOLER,FREEZER,FRIDGEDOOR
        
    }
    public enum CoolerPlaceType{
        SHELF,DRAWER
    }
    
    public void addFood(FridgePlaceType typePlace,CoolerPlaceType coolerPlaceType, int index, Food food) {
        
        List<String> choices = Arrays.asList("shelf", "drawer");
        if (typePlace == FridgePlaceType.COOLER) {

            if (coolerPlaceType == CoolerPlaceType.SHELF){
                try {
                    if (!cooler.getShelfByIndex(index).isFull()){
                        cooler.getShelfByIndex(index).foods.add(food);
                    }
                } catch (IndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            } else if (coolerPlaceType == CoolerPlaceType.DRAWER){
                try {
                    if (!cooler.getDrawerByIndex(index).isFull()){
                        cooler.getDrawerByIndex(index).foods.add(food);
                    }
                } catch (IndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            }
        } else if (typePlace == FridgePlaceType.FREEZER){
            if (!freezer.getDrawerByIndex(index).isFull()){
                freezer.getDrawerByIndex(index).foods.add(food);
            }
        } else if (typePlace == FridgePlaceType.FRIDGEDOOR){
    
            try {
                if (!cooler.getShelfByIndex(index).isFull()){
                    cooler.getShelfByIndex(index).foods.add(food);
                }
            } catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }
    }
    
    public void removeFood(int id){
    
        for (Shelf shelf : fridgeDoor.getShelfs()) {
            shelf.removeFoodById(id);
        }
        for (Shelf shelf : cooler.getShelfs()) {
            shelf.removeFoodById(id);
        }
        for (Drawer drawer : cooler.getDrawers()) {
            drawer.removeFoodById(id);
        }
        for (Drawer drawer : freezer.getDrawers()) {
            drawer.removeFoodById(id);
        }
    }
    
    public Cooler getCooler() {
        return this.cooler;
    }
    
    public Freezer getFreezer() {
        return this.freezer;
    }
    public FridgeDoor getFridgeDoor() {
        return this.fridgeDoor;
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public int getTemp() {
        return this.temp;
    }
    
    public void setTemp(int temp) {
        this.temp = temp;
    }
    
    
    
    public List<Food> listFoods(){
        
        List<Food> foodList = new ArrayList<>();
        
        for (Shelf shelf : fridgeDoor.getShelfs()) {
            if (!shelf.isEmpty()){
                for (Food food : shelf.foods) {
                    foodList.add(food);
                }
            }
        }
        for (Shelf shelf : cooler.getShelfs()) {
            if (!shelf.isEmpty()) {
                for (Food food : shelf.foods) {
                    foodList.add(food);
                }
            }
        }
        for (Drawer drawer : cooler.getDrawers()) {
            if (!drawer.isEmpty()) {
                for (Food food : drawer.foods) {
                    foodList.add(food);
                }
            }
        }
        for (Drawer drawer : freezer.getDrawers()) {
            if (!drawer.isEmpty()) {
                for (Food food : drawer.foods) {
                    foodList.add(food);
                }
            }
        }
        return foodList;
    }
    
    @Override
    public String toString() {
        
        String fridge = "The " + color + " " + brand + " 3000 smart fridge status:\n  " +
                        "Temperature: " + getTemp() + "\n\n" +fridgeDoor + cooler + freezer;
        return fridge;
    }
}
