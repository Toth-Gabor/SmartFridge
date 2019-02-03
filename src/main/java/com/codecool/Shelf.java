package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Shelf
{
    protected int limit;
    protected List<Food> foods;
    protected boolean isFull;
    
    public Shelf() {
        this.limit = 5;
        this.foods = new ArrayList<>();
    }
    
    public boolean isFull() {  // használjam?
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
     * ha több food tipust hozunk létre itt is bővíteni kell!
     */
    public void printShelfContent(){
        for (Food food : foods) {
            if (food instanceof Drink){
                System.out.println("  Brand: " + ((Drink) food).getBrand() + " name: " + food.getName()
                    + " expdate: " + food.getExpDate());
                
            } else if (food instanceof Meal){
                System.out.println("  Brand: " + ((Meal) food).getBrand() + " name: " + food.getName()
                    + " expdate: " + food.getExpDate());
            }
            
        }
    }
    

}
