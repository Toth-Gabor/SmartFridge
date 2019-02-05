package com.codecool;

import java.util.InputMismatchException;
import java.util.Scanner;

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
    
    
    private String[] menuOptions = {"Show fridge status", "list all food", "add", "remove food by id", "report", "load", "save (write into file)", "exit"};
    private Scanner scan = new Scanner(System.in);
    private Refrigerator fridge = new Refrigerator("Samsung", "Silver", 7);
    private int choice;
    private String[] questions = {"Food type: ", "Name:", "ExpDate:", "Fridge place type:[FRIDGEDOOR,COOLER,FREEZER]"};
    private String[] answers = new String[4];
    
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
            try {
                choice = scan.nextInt();  // még kiakasztja a betű!!!
            } catch (InputMismatchException e){
                System.out.println("Type a number!");
                continue;
            }
            
            switch (choice) {
                case 1:
                    System.out.println(fridge);
                    break;
                case 2:
                    if (fridge.listFoods().size() == 0){
                        System.out.println("The fridge is empty.");
                    } else {
                        System.out.println("Foods:");
                        for (Food food : fridge.listFoods()) {
                            System.out.println(food);
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < questions.length; i++) { //valamiért az első két elemet egyszerre írja ki!
                        System.out.println(questions[i]);
                        answers[i] = scan.next();
                    }

                    String coolerPlaceType = "";
                    String index = "";
                    if(Refrigerator.FridgePlaceType.valueOf(answers[3].toUpperCase()) == Refrigerator.FridgePlaceType.COOLER){
                        
                        System.out.println("Cooler place Type:[SHELF,DRAWER]");
                        coolerPlaceType = scan.next();
                        System.out.println("index:");
                        index = scan.next();
                    } else {
                        coolerPlaceType = "SHELF";
                        System.out.println("index:");
                        index = scan.next();
                    }
                    
                    Food food = new Food(answers[0], answers[1], answers[2]);
                    fridge.addFood(Refrigerator.FridgePlaceType.valueOf(answers[3].toUpperCase()),
                                    Refrigerator.CoolerPlaceType.valueOf(coolerPlaceType.toUpperCase()),
                                    (Integer.parseInt(index) - 1), food);
                    break;
                case 4:
                    System.out.println("Type the food id what you want to remove:");
                    fridge.removeFood(scan.nextInt());  //TESZTELNI!
                    break;
                case 5:
                    System.out.println("option 5");
                    break;
                case 6:
                    System.out.println("option 6");
                    break;
                case 7:
                    System.out.println("option 7");
                    break;
                case 8:
                    System.out.println("See you next time.");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.exit(0);
                    break;
                default:
                    System.out.println("Your choice must be a number between 1 and 8.");
                    break;
            }
        }
    }
}
