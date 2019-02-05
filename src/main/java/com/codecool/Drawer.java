package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Drawer {
    
    private int limit;
    protected List<Food> foods;
    private int buffer;
    
    public Drawer() {
        this.limit = 5;
        this.foods = new ArrayList<>();
    }
    
    public boolean isFull() {
        if (foods.size() == limit){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isEmpty(){
        if (foods.size() == 0){
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
    
    public void printDrawerContent(){ // törölni?
        for (Food food : foods) {
            System.out.println("Id: " + food.getId() + "Type: " + food.getType() + " name: " + food.getName()
                + " expdate: " + food.getExpDate());
        }
    }
    
    /*public void addFood(String type, String name, String expDate){
        
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
    }*/
    
    public void removeFoodById(int id){
        
        for (int i = 0; i < this.foods.size(); i++) {
            if (this.foods.get(i).getId() == id){
                buffer = i;
            }
        }
        this.foods.remove(buffer);
    }
    
    @Override
    public String toString() {
        if (isEmpty()){
            return "The drawer is empty!";
        } else {
            String result = "drawer: \n";
            for (Food food : foods) {
                result += food + "\n";
            }
            return result;
        }
    }
}
