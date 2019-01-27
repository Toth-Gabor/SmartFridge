package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Cooler {
    
    protected String name;
    protected int drawerLimit;
    protected int shelfLimit;
    protected boolean fridgeLamp;
    protected List<Drawer> drawers;
    protected List<Shelf> shelfs;
    protected FridgeDoor fridgeDoor;
    
    
    public Cooler() {
    
        this.name = "Cooler";
        this.shelfLimit = 4;
        this.drawerLimit = 3;
        this.fridgeLamp = false;
        this.shelfs = new ArrayList<>();
        this.drawers = new ArrayList<>();
        
        try {
            for (int i = 0; i < drawerLimit; i++) {
                drawers.add(new Drawer());
            }
            for (int j = 0; j < shelfLimit; j++)
            {
                shelfs.add(new Shelf());
            }
            this.fridgeDoor = new FridgeDoor();
            
        } catch (NullPointerException e){
    
            e.printStackTrace();
        }
    }
    
    public String getName() {
        return name;
    }
    
    public int getDrawerLimit() {
        return drawerLimit;
    }
    
    public int getShelfLimit() {
        return shelfLimit;
    }
    
    
    public List<Drawer> getDrawers() {
        return drawers;
    }
    
    public List<Shelf> getShelfs() {
        return shelfs;
    }
    
    public FridgeDoor getFridgeDoor() {
        return fridgeDoor;
    }
    
    public void printCoolerStatus(){
        boolean isShelfEmpty = true;
        
        System.out.println(name + ":\n");
        try {
    
            int count = 1;
            
            for (Shelf shelf : shelfs) {
                
                if(!isShelfEmpty){
                    
                    for (Food food: shelf.foods) {
                        
                        if (food instanceof Food) {
                            
                            isShelfEmpty = false;
                            System.out.println(" " + count + ". " + food.getName() + " " + food.expDate);
                            count++;
            
                        }
                    }
                } else {
                    System.out.println(" " + count + ". shelf is empty.");
                    count++;
                }
            }
            boolean isDrawerEmpty = true;
            int index = 1;
            for (Drawer drawer : drawers) {
                
                if (!isDrawerEmpty){
                    
                    for (Food food : drawer.foods) {
        
                        if (food instanceof Food) {
                            
                            isDrawerEmpty = false;
                            System.out.println(" " + index + ". " + food.getName() + " " + food.expDate);
                            index++;
            
                        }
                    }
                }  else {
    
                    System.out.println(" " + index + ". drawer is empty.");
                    index++;
                }
                
            }
        } catch (NullPointerException e){
            System.out.println("anyád");
            e.getStackTrace();
        }
    }
}
