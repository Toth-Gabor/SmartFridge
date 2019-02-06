package com.codecool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Drawer {
    
    private int limit;
    protected List<Food> foods;
    
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
    
    public void removeFoodById(int id){
        
        Iterator<Food> foodIterator = getFoods().iterator();
        while(foodIterator.hasNext()){
            if (foodIterator.next().getId() == id){
                foodIterator.remove();
            }
        }
    }
    
    @Override
    public String toString() {
        if (isEmpty()){
            return "This drawer is empty!";
        } else {
            String result = "drawer: \n";
            for (Food food : foods) {
                result += food + "\n";
            }
            return result;
        }
    }
}
