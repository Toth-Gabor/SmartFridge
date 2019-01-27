package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Drawer {

    protected int limit;
    protected List<Food> foods;
    
    public Drawer() {
        this.limit = 5;
        this.foods = new ArrayList<>();
    }
    
    public int getLimit() {
        return limit;
    }
    
    public void setLimit(int limit) {
        this.limit = limit;
    }
    
    
    public List<Food> getFoods() {
        return foods;
    }
    
    public void printDrawerContent(){
        for (Food food : foods) {
            if (food instanceof Drink){
                System.out.println("  Brand: " + food.getBrand() + " type: " + ((Drink) food).getDrinkType()
                    + " expdate: " + food.getExpDate());
    
            } else if (food instanceof Meal){
                System.out.println("  Brand: " + food.getBrand() + " type: " + ((Meal) food).getMealType()
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
}
