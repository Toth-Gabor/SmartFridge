package com.codecool;

abstract class Food {
    
    protected String brand;
    
    public Food(String brand, String expDate) {
        this.brand = brand;
        this.expDate = expDate;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getExpDate() {
        return expDate;
    }
    
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    
    protected String expDate;
    


}
