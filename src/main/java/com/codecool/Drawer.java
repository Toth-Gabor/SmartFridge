package com.codecool;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Drawer implements Serializable {
    
    public static final int LIMIT = 5;
    
    protected List<Food> foods;
    
    public Drawer() {
        this.foods = new ArrayList<>();
    }
    
    public boolean isFull() {
        if (foods.size() == LIMIT){
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
