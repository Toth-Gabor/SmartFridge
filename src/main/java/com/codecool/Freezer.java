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
    
    public Drawer getDrawerByIndex(int index){
        return this.drawers.get(index);
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
