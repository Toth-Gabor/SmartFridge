package com.codecool;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cooler implements Serializable {
    
    public static final int DRAWER_LIMIT = 2;
    public static final int SHELF_LIMIT = 3;
    
    protected boolean fridgeLamp;
    protected List<Drawer> drawers;
    protected List<Shelf> shelfs;
    
    
    public Cooler() {
        
        this.fridgeLamp = false;
        this.shelfs = new ArrayList<>();
        this.drawers = new ArrayList<>();
        
        try {
            for (int i = 0; i < DRAWER_LIMIT; i++) {
                drawers.add(new Drawer());
            }
            for (int j = 0; j < SHELF_LIMIT; j++) {
                shelfs.add(new Shelf());
            }
            
        } catch (NullPointerException e) {
            
            e.printStackTrace();
        }
    }
    
    public List<Drawer> getDrawers() {
        return this.drawers;
    }
    
    public List<Shelf> getShelfs() {
        return this.shelfs;
    }
    
    public Shelf getShelfByIndex(int index) {
        return this.shelfs.get(index);
    }
    
    public Drawer getDrawerByIndex(int index) {
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
        cooler += "\n";
        count = 1;
        for (Drawer drawer : drawers) {
            cooler += " " + count + ". " + drawer + "\n";
            count++;
        }
        return cooler += "\n";
    }
}
