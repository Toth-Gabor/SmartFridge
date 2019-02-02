package com.codecool;

abstract class Food {
    
    protected String brand;
    protected String name;
    protected String expDate;
    
    public Food(String brand, String name, String expDate) {
        
        this.brand = brand;
        this.name = name;
        this.expDate = expDate;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getExpDate() {
        return expDate;
    }
    
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    public String getBrand() {
        return this.brand;
    }

}
