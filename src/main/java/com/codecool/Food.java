package com.codecool;

import java.io.Serializable;

public class Food implements Serializable {
    
    private static int num = 1;
    private int id = 0;
    private String type;
    private String name;
    private String expDate;
    
    public Food(String type, String name, String expDate) {
        this.id = num;
        this.type = type;
        this.name = name;
        this.expDate = expDate;
        num++;
        
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }
    
    
    public int getId() {
        System.out.println(id);
        return this.id;
    }
    
    public String getType() {
        return this.type;
    }
    
    public String getExpDate() {
        return this.expDate;
    }
    
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    
    @Override
    public String toString() {
        return "  Food Id: " + id +
            ". type: " + type +
            ". name: " + name +
            ". expDate: " + expDate;
    }
}
