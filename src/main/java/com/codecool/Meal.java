package com.codecool;

public class Meal extends Food {
    
    protected String mealType;
    
    public Meal(String name, String mealType, String expDate) {
        
        super(name, expDate);
        this.mealType = mealType;
        
    }

}
