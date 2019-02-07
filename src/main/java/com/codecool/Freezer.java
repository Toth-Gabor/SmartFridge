package com.codecool;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Freezer implements Serializable {
    
    public static final int LIMIT = 3;
    
    protected List<Drawer> drawers;
    
    public Freezer() {
        this.drawers = new ArrayList<>();
        for (int i = 0; i < LIMIT; i++) {
            drawers.add(new Drawer());
        }
    }
    
    public List<Drawer> getDrawers() {
        return drawers;
    }
    
    public Drawer getDrawerByIndex(int index) {
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
