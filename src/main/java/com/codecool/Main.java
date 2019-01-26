package com.codecool;
/**
 * Main
 */
public class Main {
    
    public static void main(String[] args) {
        Drink drink = new Drink("Soproni", "Sör", "2019/10/02");
        Meal meal = new Meal("Lecsó", "meleg kaja", "2019/10/04");
        Menu menu = new Menu();
        menu.showMenu();

        System.out.println(drink.getExpDate());
        System.out.println(meal.getName());
        
    }
}