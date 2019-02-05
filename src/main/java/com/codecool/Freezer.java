package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    
    protected int drawerLimit;
    protected List<Drawer> drawers;
    
    public Freezer() {
        
        this.drawerLimit = 4;
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
    
    public Drawer getDrawerByIndex(int index){
        return this.drawers.get(index);
    }
    
    public void printFreezerStatus(){
        
        System.out.println("Freezer: \n");
    
        int index = 1;
        for (Drawer drawer : drawers) {
        
            if (drawer.foods.size() > 0){
            
                System.out.println(" " + index + ". drawer contains:");
                drawer.printDrawerContent();
                index++;
                    
                    /*for (Food food : drawer.foods) {
    
                        System.out.println(" " + index + ". " + food.getBrand() + " " + food.getExpDate());
                        index++;
                    }*/
            }  else {
            
                System.out.println(" " + index + ". drawer is empty.");
                index++;
            }
        }
        System.out.println();
    }
    
    @Override
    public String toString() {
        
        int count = 1;
        String freezer = "Freezer: \n";
        for (Drawer drawer : drawers) {
            freezer += " " + count + ". " + drawer + "\n";
            count++;
        }
        return freezer + "\n";
    }
}
