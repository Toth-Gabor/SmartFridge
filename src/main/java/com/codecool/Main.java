package com.codecool;

public class Main {
    
    public static void main(String[] args) {
        Drink drink = new Drink("Soproni", "Sör", "2019/10/02");
        Meal meal = new Meal("Lecsó", "meleg kaja", "2019/10/04");
        Menu menu = new Menu();
        //menu.showMenu();
        
        Drawer drawer = new Drawer();
        drawer.addFood("Mizó", "drink", "tej", "2019,10,06");
        drawer.addFood("Pick", "meal", "Szalcsi", "2019/10/02");
    
        drawer.printDrawerContent();

//        System.out.println(drink.getExpDate());
//        System.out.println(meal.getBrand());
    
//        Refrigerator fridge = new Refrigerator("Samsung", "Silver", 7);
//        fridge.printFridgeStatus();
//        fridge.getCooler().getDrawers().indexOf(0);
        //System.out.println(fridge.toString());
    }
}
