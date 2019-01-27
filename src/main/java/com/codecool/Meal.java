package com.codecool;

public class Meal extends Food {
    
    protected String mealType;
    
    public Meal(String brand, String mealType, String expDate) {
        
        super(brand, expDate);
        this.mealType = mealType;
        
    }
    
    public String getMealType() {
        return mealType;
    }
}
