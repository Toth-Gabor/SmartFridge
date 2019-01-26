package com.codecool;
/**
 * Drink
 */
public class Drink extends Food 
{
    protected String drinkType;

    public Drink(String name, String drinkType, String expDate)
    {
        super(name, expDate);
        this.drinkType = drinkType;
    }

}