package com.codecool;

import java.util.*;

/**
 * Menu
 * :list - displays the list of objects in your "simulation"
 * :find - finds a particular item by it's name (or similar) and displays it's stats
 * :new,
 * :create
 * :remove - have somekind of a command with which you "delete" instances from your simulation
 * :exit
 */
public class Menu {
    
    private String[] menuOptions = {"Show fridge status", "list all food", "add", "remove food by id",
                                    "update a fridge property", "load", "save (write into file)", "exit"};
    private Scanner scan = new Scanner(System.in);
    private Refrigerator fridge = new Refrigerator("Samsung", "Silver", 7);
    private FileManager fileManager = new FileManager();
    private String choice;
    private String[] questions = {" food type:", " name:", " expDate:"};
    private String[] answers = new String[3];
    
    public Menu() {
    }
    
    public void showMenu() {
        
        while (true) {
            try {
                int counter = 1;
                System.out.println("\nSmart fridge menu:");
                System.out.println("------------------");
    
                for (String option : menuOptions) {
                    System.out.println(" " + counter + ". " + option);
                    counter++;
                }
                System.out.println("-------------------");
                List<String> menuNumbers = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8"));
                while (true) {
                    System.out.print("Please enter an option: ");
                    choice = scan.nextLine();
                    if (!menuNumbers.contains(choice)) {
                        System.out.println("Your choice must be a number between 1 and 8");
                    } else {
                        break;
                    }
                }
                switch (choice) {
                    case "1":
                        option1();
                        break;
                    case "2":
                        option2();
                        break;
                    case "3":
                        option3();
                        break;
                    case "4":
                        option4();
                        break;
                    case "5":
                        System.out.println("option 5");
                        break;
                    case "6":
                        option6();
                        break;
                    case "7":
                        option7();
                        break;
                    case "8":
                        option8();
                        break;
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    private void option1() {
        System.out.println(fridge);
    }
    
    private void option2() {
        if (fridge.listFoods().size() == 0) {
            System.out.println("The fridge is empty.");
        } else {
            System.out.println("Foods:");
            for (Food food : fridge.listFoods()) {
                System.out.println(food);
            }
        }
    }
    
    private void option3() {
        String foodTypeName = askString("food type name");
        String foodName = askString("food name");
        String expDate = askString("expiration date (yyyy/mm/dd)");
    
        Food food = new Food(foodTypeName, foodName, expDate);
    
        Refrigerator.FridgePlaceType fridgePlaceType = askFridgePlaceType();
        Refrigerator.CoolerPlaceType coolerPlaceType = null;
        int index;
        if (fridgePlaceType == Refrigerator.FridgePlaceType.COOLER) {
            coolerPlaceType = askCoolerPlaceType();
        }
        if (fridgePlaceType == Refrigerator.FridgePlaceType.FRIDGEDOOR) {
            index = askIndex("food index", FridgeDoor.LIMIT);
        } else if (fridgePlaceType == Refrigerator.FridgePlaceType.FREEZER) {
            index = askIndex("food index", Freezer.LIMIT);
        } else {
            if (coolerPlaceType == Refrigerator.CoolerPlaceType.DRAWER) {
                index = askIndex("drawer index", Cooler.DRAWER_LIMIT);
            } else {
                index = askIndex("shelf index", Cooler.SHELF_LIMIT);
            }
        }
        
        fridge.addFood(fridgePlaceType, coolerPlaceType, index, food);
    }
    
    private void option4() { // user inputot kezelni ha betűt ad meg + ha nincs olyan id!
        System.out.println("Type the food id what you want to remove:");
        fridge.removeFood(scan.nextInt());
    }
    private void option6(){
        this.fridge = fileManager.fileReader();
    }
    
    private void option7(){
        fileManager.fileWriter(fridge);
    }
    
    private void option8() {
        System.out.println("See you next time.");
        System.exit(0);
    }
    
    private String askString(String type) {
        System.out.print("Please enter a(n) " + type + ": ");
        return scan.nextLine();
    }
    
    private int askIndex(String type, int limit) {
        System.out.print("Please enter a(n) " + type + ": ");
        int index = Integer.parseInt(scan.nextLine());
        if (index < 1 || index > limit) {
            throw new IllegalArgumentException("Invalid index, valid indexes are: 1 to " + limit);
        }
        return index - 1;
    }
    
    private Refrigerator.FridgePlaceType askFridgePlaceType() {
        System.out.print("Please enter the fridge place type " + Arrays.toString(Refrigerator.FridgePlaceType.values()) + ": ");
        String type = scan.nextLine();
        return Refrigerator.FridgePlaceType.valueOf(type.toUpperCase());
    }
    
    private Refrigerator.CoolerPlaceType askCoolerPlaceType() {
        System.out.print("Please enter the cooler place type " + Arrays.toString(Refrigerator.CoolerPlaceType.values()) + ": ");
        String type = scan.nextLine();
        try {
            return Refrigerator.CoolerPlaceType.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException("Wrong cooler place type. Enter a valid value.", ex);
        }
    }
}
