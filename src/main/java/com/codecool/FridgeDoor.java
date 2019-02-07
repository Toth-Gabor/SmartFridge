package com.codecool;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FridgeDoor implements Serializable {

    public static final int LIMIT = 3;
    
    protected List<Shelf> shelfs;
    protected boolean doorPosition;

    public FridgeDoor()
    {
        this.doorPosition = false;
        this.shelfs =  new ArrayList<>();
        
        for (int i = 0; i < LIMIT; i++) {
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
    
    /*public void printFrigeDoorStatus(){
        
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
    }*/
    
    @Override
    public String toString() {
        
        int count = 1;
        String fridgeDoor = "Fridgedoor: \n";
        for (Shelf shelf : shelfs) {
            fridgeDoor += " " + count + "." + shelf + "\n";
            count++;
        }
        return fridgeDoor + "\n";
    }
}
