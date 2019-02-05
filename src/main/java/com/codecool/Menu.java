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
    
    
    private String[] menuOptions = {"Show fridge status", "list all food", "add", "remove", "report", "load", "save (write into file)", "exit"};
    private Scanner scan = new Scanner(System.in);
    private Refrigerator fridge = new Refrigerator("Samsung", "Silver", 7);
    private int choice;
    
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
                        System.out.println(fridge.listFoods()); //TESZTELNI!
                    }
                    break;
                case 3:
                    /*String[] questions = {"Food type: ", "Name:", "ExpDate:",
                        "Fridge place type:[FRIDGEDOOR,COOLER,FREEZER]", "Index:"};
                    String[] answers = new String[6];
                    for (int i = 0; i < questions.length; i++) {
                        System.out.println(questions[i]);
                        answers[i] = scan.nextLine();
                    }
                    Food food = fridge.createFood(answers[0], answers[1], answers[2], answers[3]);
                    fridge.addFood((Refrigerator.FridgePlaceType)answers[4], (Integer.parseInt(answers[5]) - 1), food);*/
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
