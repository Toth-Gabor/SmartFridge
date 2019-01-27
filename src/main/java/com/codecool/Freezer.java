package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    
    protected int drawerLimit;
    protected List<Drawer> drawers;
    
    public Freezer() {
        
        this.drawerLimit = 3;
        this.drawers = new ArrayList<>();
        try {
            for (int i = 0; i < drawerLimit; i++) {
                drawers.add(new Drawer());
            }
        } catch (NullPointerException e){
            System.out.println("apád picsája");
    
            e.getStackTrace();
        }
    }
    
    public int getDrawerLimit() {
        return drawerLimit;
    }
    
    public List<Drawer> getDrawers() {
        return drawers;
    }
    
    public void printFreezerStatus(){
        
        System.out.println("Freezer: \n");
        boolean isDrawerEmpty = true;
        int index = 1;
        
        for (Drawer drawer : drawers) {
        
            if (!isDrawerEmpty){
            
                for (Food food : drawer.foods) {
                
                    if (food instanceof Food) {
                    
                        isDrawerEmpty = false;
                        System.out.println(" " + index + ". " + food.getBrand() + " " + food.expDate);
                        index++;
                    
                    }
                }
            }  else {
            
                System.out.println(" " + index + ". drawer is empty.");
                index++;
            }
        
        }
        System.out.println();
    }
}
