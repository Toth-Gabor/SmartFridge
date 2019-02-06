package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Cooler {
    
    protected int drawerLimit;
    protected int shelfLimit;
    protected boolean fridgeLamp;
    protected List<Drawer> drawers;
    protected List<Shelf> shelfs;
    
    
    public Cooler() {
    
        this.shelfLimit = 4;
        this.drawerLimit = 2;
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
            
        } catch (NullPointerException e){
    
            e.printStackTrace();
        }
    }
    
    public int getDrawerLimit() {
        return drawerLimit;
    }
    
    public int getShelfLimit() {
        return shelfLimit;
    }
    
    
    public List<Drawer> getDrawers() {
        return this.drawers;
    }
    
    public List<Shelf> getShelfs() {
        return this.shelfs;
    }
    
    public Shelf getShelfByIndex(int index){
        return this.shelfs.get(index);
    }
    
    public Drawer getDrawerByIndex(int index){
        return this.drawers.get(index);
    }
    
    @Override
    public String toString() {
        
        int count = 1;
        String cooler = "Cooler:\n";
        for (Shelf shelf : shelfs) {
            cooler += " " + count + ". " + shelf + "\n";
            count++;
        }
        cooler+= "\n";
        count = 1;
        for (Drawer drawer : drawers) {
            cooler += " " + count + ". " + drawer + "\n";
            count++;
        }
        return cooler+= "\n";
    }
}
