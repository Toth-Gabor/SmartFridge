package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class FridgeDoor {
    
    protected List<Shelf> shelfs;
    protected int shelfLimit;
    protected boolean doorPosition;

    public FridgeDoor()
    {
        this.doorPosition = false;
        this.shelfLimit = 5;
        this.shelfs =  new ArrayList<>();
        
        for (int i = 0; i < shelfLimit; i++) {
            shelfs.add(new Shelf());
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
