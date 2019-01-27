package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Freezer
 */
public class Freezer {
    
    protected String name;
    protected int drawerLimit;
    protected List<Drawer> drawers;
    protected FridgeDoor fridgeDoor;
    

    
    public Freezer() {
        
        this.name = "Freezer";
        this.drawerLimit = 3;
        this.drawers = new ArrayList<>();
        try {
            for (int i = 0; i < drawerLimit; i++) {
                drawers.add(new Drawer());
            }
            this.fridgeDoor = new FridgeDoor();
        } catch (NullPointerException e){
            System.out.println("apád picsája");
    
            e.getStackTrace();
        }
    }
    public String getName() {
        return name;
    }
    
    public int getDrawerLimit() {
        return drawerLimit;
    }
    
    public List<Drawer> getDrawers() {
        return drawers;
    }
    
    public FridgeDoor getFridgeDoor() {
        return fridgeDoor;
    }
    
    public void printFreezerStatus(){
        
        System.out.println(name + ":\n");
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
    }
}
