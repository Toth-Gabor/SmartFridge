package com.codecool;

/**
 * Freezer
 */
public class Freezer {
    
    protected int drawerLimit;
    protected Drawer[] drawers;
    protected FridgeDoor fridgeDoor;

    public Freezer() {
        
        this.drawerLimit = 3;
        for (int i = 0; i < drawerLimit; i++) 
        {
            drawers[i] = new Drawer(); 
        }
        this.fridgeDoor = new FridgeDoor();
        
    }
}