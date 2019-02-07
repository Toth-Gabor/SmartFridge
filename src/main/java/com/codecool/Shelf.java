package com.codecool;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shelf implements Serializable {
    public static final int LIMIT = 5;
    
    protected List<Food> foods;
    
    public Shelf() {
        this.foods = new ArrayList<>();
    }
    
    public boolean isFull() {
        return foods.size() == LIMIT;
    }
    
    public boolean isEmpty() {
        return foods.size() == 0;
    }
    
    public List<Food> getFoods() {
        return this.foods;
    }
    
    public void removeFoodById(int id) {
        
        Iterator<Food> foodIterator = getFoods().iterator();
        while (foodIterator.hasNext()) {
            if (foodIterator.next().getId() == id) {
                foodIterator.remove();
            }
        }
    }
    
    @Override
    public String toString() {
        if (isEmpty()) {
            return "This shelf is empty!";
        } else {
            String result = "shelf: \n";
            for (Food food : foods) {
                result += food + "\n";
            }
            return result;
        }
    }
}
