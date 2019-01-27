package com.codecool;

public class Shelf
{
    protected int limit;
    protected Food[] foods;
    
    public Shelf() {
        this.limit = 5;
        this.foods = new Food[limit];
    }
    
    public int getLimit() {
        return limit;
    }
    
    public void setLimit(int limit) {
        this.limit = limit;
    }
    
    public Food[] getFoods() {
        return foods;
    }
}
