package com.codecool;

import java.util.Scanner;

/**
 * Menu
 *  :list - displays the list of objects in your "simulation"
    :find - finds a particular item by it's name (or similar) and displays it's stats
    :new, 
    :create
    :remove - have somekind of a command with which you "delete" instances from your simulation
    :exit
 */
public class Menu {
    
    
    private String[] menuOptions = {"list", "find", "add", "remove", "report" , "load", "save (write into file)", "exit"};
    private Scanner scan = new Scanner(System.in);
    private Refrigerator fridge = new Refrigerator("Samsung", "Silver", 7);

    public Menu() {

    }
    public void showMenu(){

        int counter = 1;
        System.out.println("\nSmart fridge menu:");
        System.out.println("------------------");

        for (String option : menuOptions) {
            System.out.println(" " + counter + ". " + option);
            counter++;
        }
        System.out.println("-------------------");

        int choice = scan.nextInt();

        switch (choice)
        {
            case 1:
                fridge.printFridgeStatus();
                break;
            case 2: 
                System.out.println("option 2");
                break;
            case 3: 
                System.out.println("option 3");
                break;
            case 4:
                System.out.println("option 4");
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
                System.exit(0);
                break;
            default:
                System.out.println("Choice must be a value between 1 and 8.");
        }   


    }

    
}
