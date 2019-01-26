package com.codecool;

/**
 * FridgeLamp
 */
public class FridgeLamp 
{
    protected boolean light;
    
    public FridgeLamp()
    {
        this.light = false;
    }
    // meghívná valahogy a getDoorPosition()!
    public void setFridgeLamp(boolean getDoorPosition)
    { 
        this.light = getDoorPosition;
    }
    public String getLampStatus()
    {
        if (light) 
        {
            return "The lamp is on.";
        } else {
            return "the lamp is off";
        }
    }
}