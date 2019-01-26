package com.codecool;

/**
 * FridgeDoor
 */
public class FridgeDoor 
{
    protected Shelf[] shelfs;
    protected int shelfLimit;
    protected boolean doorPosition;

    public FridgeDoor()
    {
        this.doorPosition = false;
        this.shelfLimit = 5;
        for (int i = 0; i < shelfLimit; i++) 
        {
            shelfs[i] = new Shelf();
        }
    }
    public String getDoorPosition()
    {
        if (doorPosition) {
            return "The fridgedoor is open.";
        } else {
            return "The fridgedoor is closed.";
        }
    }

}