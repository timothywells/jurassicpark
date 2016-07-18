/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import byui.cit260.jurassicpark.control.BreakerBoxController;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import jurassicpark.JurassicPark;

/**
 *
 * @author christian
 */
public class BreakerBoxView {
    
    private final String menu = "You need to calculate the correct resistane for the "
            + "breaker box to re-energize. The resistance is 220.";
    protected final PrintWriter console = JurassicPark.getOutFile();
    protected final BufferedReader keyboard = JurassicPark.getInFile();
    
    public BreakerBoxView(){
}
 
    public void displayMenu() {
        
        console.println(menu);
        boolean result = getInput();
        
        if(result) {
            console.println("You solved the problem!");
            
        } else {
            console.println("Sorry, wrong answer");
        }
    }

    private boolean getInput() {
       
        BreakerBoxController cc = new BreakerBoxController();
        
        console.println("Please enter volts: ");
        double volts = getDoubleFromKeyboard();
        console.println("Please enter amps: ");
        double amps = getDoubleFromKeyboard();
     
        double resistance = cc.calcResistance(volts, amps);
        
         if ((volts < 110 || volts > 110) && (amps < 20 || amps > 20)){
            return true;
    }
         return false;
    }

    private double getDoubleFromKeyboard() {
      
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        
        while (!valid) {
            String input = keyboard.nextLine();
            try {
                double num = Double.parseDouble(input);
                return num;
            } catch (Exception e) {
                console.println("Please enter a number.");
            }
        }

        return 0;
                
            }
        
    }

