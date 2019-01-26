package com.codecool;

/**
 * Cooler
 */
public class Cooler {

    protected int drawerLimit;
    protected int shelfLimit;
    protected FridgeLamp fridgeLamp;
    protected Drawer[] drawers;
    protected Shelf[] shelfs;
    protected FridgeDoor fridgeDoor;

    public Cooler()
    {   
        this.shelfLimit = 4;
        this.drawerLimit = 3;
        this.fridgeLamp = new FridgeLamp();
        for (int i = 0; i < drawerLimit; i++) 
        {
            drawers[i] = new Drawer(); 
        }
        for (int i = 0; i < shelfLimit; i++) 
        {
            shelfs[i] = new Shelf();
        }
        this.fridgeDoor = new FridgeDoor();
    }
    // public Food[] getDrawerContentByIndex(int index)
    // {

    // }
}