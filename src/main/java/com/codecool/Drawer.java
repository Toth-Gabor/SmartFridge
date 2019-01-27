package com.codecool;

import java.util.List;

public class Drawer {

    protected int limit;
    protected Food[] foods;
    
    public Drawer() {
        this.limit = 5;
        this.foods = new Food[limit];
    }
    
    public int getLimit() {
        return limit;
    }
    
    public void setLimit(int limit) {
        this.limit = limit;
    }
    
    

}
