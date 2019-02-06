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
    
    private String[] menuOptions = {"Show fridge status", "list all food", "add", "remove food by id", "update a fridge property", "load", "save (write into file)", "exit"};
    private Scanner scan = new Scanner(System.in);
    private Refrigerator fridge = new Refrigerator("Samsung", "Silver", 7);
    private String choice;
    private String[] questions = {" food type:", " name:", " expDate:"};
    private String[] answers = new String[3];
    
    public Menu() {
    }
    
    public void showMenu() {
        
        while (true) {
            int counter = 1;
            System.out.println("\nSmart fridge menu:");
            System.out.println("------------------");
            
            for (String option : menuOptions) {
                System.out.println(" " + counter + ". " + option);
                counter++;
            }
            System.out.println("-------------------");
            List<String> menuNumbers = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8"));
            while(true){
                System.out.println("Please enter an option.");
                choice = scan.next();
                if (!menuNumbers.contains(choice)){
                    System.out.println("Your choice must be a number between 1 and 8.");
                } else {
                    break;
                }
            }
            choice = scan.next();
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
                    System.out.println("option 6");
                    break;
                case "7":
                    System.out.println("option 7");
                    break;
                case "8":
                    option8();
                    break;
            }
        }
    }
    private void option1(){
        System.out.println(fridge);
    }
    
    private void option2(){
        if (fridge.listFoods().size() == 0){
            System.out.println("The fridge is empty.");
        } else {
            System.out.println("Foods:");
            for (Food food : fridge.listFoods()) {
                System.out.println(food);
            }
        }
    }
    
    private void option3(){
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Please give a(n)" + questions[i]);
            answers[i] = scan.next();
        }
        String coolerPlaceType = "";
        String index = "";
        String fridgePlacetype= "";
        List<String> fridgePlacetypes = new ArrayList<>(Arrays.asList("fridgedoor", "cooler", "freezer"));
        while (true){
            System.out.println("Fridge place type:[fridgedoor,cooler,freezer]");
            fridgePlacetype = scan.next();
            if (fridgePlacetypes.contains(fridgePlacetype)){break;}
        }
    
        if(Refrigerator.FridgePlaceType.valueOf(fridgePlacetype.toUpperCase()) == Refrigerator.FridgePlaceType.COOLER){
    
            List<String> containers = new ArrayList<>(Arrays.asList("shelf", "drawer"));
            while (true){
                System.out.println("Cooler place Type:[shelf or drawer]");
                coolerPlaceType = scan.next();
                if (containers.contains(coolerPlaceType)){break;}
            }
        
            if (Refrigerator.CoolerPlaceType.valueOf(coolerPlaceType.toUpperCase()) ==
                Refrigerator.CoolerPlaceType.DRAWER){
                List<String> drawerIndex = new ArrayList<>(Arrays.asList("1", "2"));
                while(true){
                    System.out.println("index: [1 or 2]");
                    index = scan.next();
                    if (drawerIndex.contains(index)){break;}
                    System.out.println("This index does not exist! Try again.");
                }
            } else if(Refrigerator.CoolerPlaceType.valueOf(coolerPlaceType.toUpperCase()) ==
                Refrigerator.CoolerPlaceType.SHELF){
                List<String> shelfIndex = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
                while(true){
                    System.out.println("index: [1 - 4]");
                    index = scan.next();
                    if (shelfIndex.contains(index)){break;}
                    System.out.println("This index does not exist! Try again.");
                }
            }
        } else {
            coolerPlaceType = "SHELF";
            List<String> indexes = new ArrayList<>(Arrays.asList("1", "2", "3"));
            while(true) {
                System.out.println("index:");
                index = scan.next();
                if(indexes.contains(index)){break;}
                System.out.println("This index does not exist! Try again.");
            }
        }
    
        Food food = new Food(answers[0], answers[1], answers[2]);
        fridge.addFood(Refrigerator.FridgePlaceType.valueOf(fridgePlacetype.toUpperCase()),
            Refrigerator.CoolerPlaceType.valueOf(coolerPlaceType.toUpperCase()),
            (Integer.parseInt(index) - 1), food);
    }
    
    private void option4(){
        System.out.println("Type the food id what you want to remove:");
        fridge.removeFood(scan.nextInt());
    }
    
    private void option8(){
        System.out.println("See you nextLine() time.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
