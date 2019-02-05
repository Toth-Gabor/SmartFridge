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
    
    /*public void printCoolerStatus(){
        
        System.out.println("Cooler: \n");
        try {
    
            int count = 1;
            
            for (Shelf shelf : shelfs) {
                
                if(shelf.foods.size() > 0){
    
                    System.out.println(" " + count + ". shelf is contains:");
                    shelf.printShelfContent();
                    count++;
                    
                    *//*for (Food food: shelf.foods) {
                        
                        System.out.println(" " + count + ". " + food.getName() + " " + food.getExpDate());
                        count++;

                    }*//*
                } else {
                    System.out.println(" " + count + ". shelf is empty.");
                    count++;
                }
            }
            System.out.println();
    
            int index = 1;
            for (Drawer drawer : drawers) {
                
                if (drawer.foods.size() > 0){
                    
                    System.out.println(" " + index + ". drawer contains:");
                    drawer.printDrawerContent();
                    index++;
                    
                    *//*for (Food food : drawer.foods) {
    
                        System.out.println(" " + index + ". " + food.getBrand() + " " + food.getExpDate());
                        index++;
                    }*//*
                }  else {
    
                    System.out.println(" " + index + ". drawer is empty.");
                    index++;
                }
            }
            System.out.println();
        } catch (NullPointerException e){
            System.out.println("anyád");
            e.getStackTrace();
        }
    }*/
    
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
