package com.codecool;

public class Drink extends Food {
    
    protected String drinkType;
    
    public String getDrinkType() {
        return drinkType;
    }
    
    public Drink(String brand, String drinkType, String expDate)
    {
        super(brand, expDate);
        this.drinkType = drinkType;
    }

}
