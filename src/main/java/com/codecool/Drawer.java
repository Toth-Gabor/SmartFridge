package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Drawer {

    protected int limit;
    protected List<Food> foods;
    protected boolean isFull;
    
    public Drawer() {
        this.limit = 5;
        this.foods = new ArrayList<>();
        this.isFull = false;
    }
    
    public boolean isFull() { // használjam?
        if (foods.size() == limit){
            return true;
        } else {
            return false;
        }
    }
    
    public int getLimit() {
        return this.limit;
    }
    
    public void setLimit(int limit) {
        this.limit = limit;
    }
    
    public List<Food> getFoods() {
        return this.foods;
    }
    
    /**
     * ha több food tipust hozunk létre itt is bővíteni kell
     */
    public void printDrawerContent(){
        for (Food food : foods) {
            if (food instanceof Drink){
                System.out.println("  Brand: " + food.getBrand() + " name: " + food.getName()
                    + " expdate: " + food.getExpDate());
    
            } else if (food instanceof Meal){
                System.out.println("  Brand: " + food.getBrand() + " name: " + food.getName()
                    + " expdate: " + food.getExpDate());
            }
        }
    }
    
    
    
    public void addFood(String brand, String foodType, String name, String expDate){
        
        if (foods.size() < limit) {
            
            if (foodType.equals("meal")){
    
                foods.add(new Meal(brand, name, expDate));
    
            } else if (foodType.equals("drink")){
    
                foods.add(new Drink(brand, name, expDate));
    
            } else {
    
                System.out.println("Non exits food type!");
            }
        } else {
            
            System.out.println("This drawer is full! ");
        
        }
    }
    
    public void removeFoodByName(String name){ // NEM MŰKÖDIK!!!
        
        for (int i = 0; i < this.foods.size(); i++) {
            if (this.foods.get(i).equals(name)){
                this.foods.remove(i);
            }
        }
    }
}
