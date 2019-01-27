package com.codecool;

abstract class Food {

    protected String expDate;
    protected String name;
    
    public Food(String expDate, String name) {
        this.expDate = expDate;
        this.name = name;
    }
    
    public String getName()
    {
       return this.name; 
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getExpDate()
    {
        return this.expDate;
    }
    public void setExpDate(String expDate)
    {
        this.expDate = expDate;
    }

}
