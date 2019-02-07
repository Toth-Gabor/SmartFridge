package com.codecool;

import java.io.*;

public class FileManager {
    
    private Refrigerator fridge;
    
    public void fileWriter(Refrigerator fridge){
        try {
            FileOutputStream fileOut = new FileOutputStream("fridge.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(fridge);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in fridge.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
    public Refrigerator fileReader(){
        try {
            FileInputStream fileIn = new FileInputStream("fridge.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            fridge = (Refrigerator) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Refrigerator class not found");
            c.printStackTrace();
        }
        return fridge;
    }
}
