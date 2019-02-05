package com.codecool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Fridge
 */
public class Refrigerator {
    
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
    
    /*public Food createFood (String foodType, String name, String expDate){
        
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
    }*/
    
    
    public void addFood(FridgePlaceType typePlace, int index, Food food) {
        
        List<String> choices = Arrays.asList("shelf", "drawer");
        if (typePlace == FridgePlaceType.COOLER) {
            
            String choice = "";
            
            while (!choices.contains(choice)) {
                System.out.println("Type your choice: [shelf or drawer]");
                Scanner sc = new Scanner(System.in);
                choice = sc.nextLine().toLowerCase();
            }
            if (choice.equals("shelf")){
                try {
                    cooler.getShelfByIndex(index).foods.add(food);
                } catch (IndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    cooler.getDrawerByIndex(index).foods.add(food);
                } catch (IndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            }
        } else if (typePlace == FridgePlaceType.FREEZER){
            try {
                freezer.getDraweByIndex(index).foods.add(food);
            } catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        } else if (typePlace == FridgePlaceType.FRIDGEDOOR){
    
            try {
                fridgeDoor.getShelfByIndex(index).foods.add(food);
            } catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }
    }
    
    public void removeFood(int id){ //Tesztelni!
    
        for (Shelf shelf : fridgeDoor.getShelfs()) {
            shelf.removeFoodById(id);
            
            /*for (int i = 0; i < shelf.getFoods().size(); i++) {   // Beta verzió :)
                if (shelf.getFoods().get(i).getName().equals(name)) {
                    shelf.getFoods().remove(i);
                }
            }*/
        }
        for (Shelf shelf : cooler.getShelfs()) {
            shelf.removeFoodById(id);
            /*for (int i = 0; i < shelf.getFoods().size(); i++) {   // Beta verzió :)
                if (shelf.getFoods().get(i).getName().equals(name)) {
                    shelf.getFoods().remove(i);
                }
            }*/
        }
        for (Drawer drawer : cooler.getDrawers()) {
            drawer.removeFoodById(id);
            //drawer.removeFoodByName(name);
            /*for (int i = 0; i < drawer.getFoods().size(); i++) {   // Beta verzió :)
                if (drawer.getFoods().get(i).getName().equals(name)) {
                    drawer.getFoods().remove(i);
                }
            }*/
        }
        for (Drawer drawer : freezer.getDrawers()) {
            drawer.removeFoodById(id);
            //drawer.removeFoodByName(name);
            /*for (int i = 0; i < drawer.getFoods().size(); i++) {   // Beta verzió :)
                if (drawer.getFoods().get(i).getName().equals(name)) {
                    drawer.getFoods().remove(i);
                }
            }*/
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
    
    
    
    public List<Food> listFoods(){ //Tesztelni!
        
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
