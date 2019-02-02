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
            return "The fridge door is open.";
        } else {
            return "The fridge door is closed.";
        }
    }
    
    public List<Shelf> getShelfs() {
        return this.shelfs;
    }
    
    public Shelf getShelfByIndex(int index){
        return this.shelfs.get(index);
    }
    
    public void printFrigeDoorStatus(){
        
        System.out.println("Fridge door: \n");
        try {
            int count = 1;
    
            for (Shelf shelf : shelfs) {
        
                if(shelf.foods.size() > 0){
            
                    System.out.println(" " + count + ". shelf is contains:");
                    shelf.printShelfContent();
                    count++;
                    
                } else {
                    System.out.println(" " + count + ". shelf is empty.");
                    count++;
                }
            }
            System.out.println();
        }catch (NullPointerException e){
            e.getStackTrace();
        }
    }

}
