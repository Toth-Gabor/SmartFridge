package com.codecool;


import javax.sound.sampled.AudioInputStream;
import java.io.FileNotFoundException;



public class Main {
    
    public static void main(String[] args) {
        Drink drink = new Drink("Soproni", "Sör", "2019/10/02");
        Meal meal = new Meal("Home made", "Lecsó", "2019/10/04");
        
        //Cooler cooler = new Cooler();
        //cooler.getDrawers().get(0).foods.add(drink);
        
        String load = "sounds/load fridge.mp3";

        
    
        
        
        
        
        Menu menu = new Menu();
        menu.showMenu();
    
        //Refrigerator fridge = new Refrigerator("Samsung", "Silver", 7);
        //fridge.getCooler().getDrawers().get(1).foods.add(drink);
        //fridge.addFood("COOLER", 2, meal);
        //fridge.printFridgeStatus();

//
//        Drawer drawer = new Drawer();
//        drawer.addFood("Mizó", "drink", "tej", "2019,10,06");
//        drawer.addFood("Pick", "meal", "Szalcsi", "2019/10/02");
//
//        drawer.printDrawerContent();

//        System.out.println(drink.getExpDate());
//        System.out.println(meal.getBrand());
        /*fridge.getFreezer().getDrawers();
        for (Drawer drawer:fridge.getFreezer().getDrawers()) {
            if (drawer.getFoods().isEmpty()) {
                drawer.printDrawerContent();
                drawer.addFood("Mizó", "drink", "tejcsi", "10");
                break;
            }
        }*/
        
       /*fridge.getCooler().getDrawers().indexOf(0);
       System.out.println(fridge.toString());*/

       
       
       
    
    
       
       /* while (true) {
            int choice = ...
            1: fridge.printFridgeStatus();
            2: list foods
            3: add food:
                int foodId = ...
                FridgePlaceType hova = COOLER | X | Y enum!!!!!!
                    if COOLER -> fridge.addFood(hova, new Food())*/
        
    }
}
