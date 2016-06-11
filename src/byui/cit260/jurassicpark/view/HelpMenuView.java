/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import byui.cit260.jurassicpark.control.ProgramController;
import java.util.Scanner;

/**
 *
 * @author Matthew
 */
public class HelpMenuView {
    
    private final String menu = "\n"
            + "\nA - About Game"
            + "\nI - Instructions"
            + "\nP - Purpose of Game"
            + "\nD - Dinosaurs"
            + "\nM - Main Menu"
            ;
    
    public HelpMenuView(){
        
    }
    
    public void displayMenu(){
        
        char selection = ' ';
        
        do {
            System.out.println(menu);
            
            String input = getInput();
            selection = input.charAt(0);
            
        } while (selection != 'M');
    }
    
    public void doAction(char selection) {
        
        switch(selection) {
            case 'A':
                aboutGame();
                break;
            case 'I':
                instructions();
                break;
            case 'P':
                purposeOfGame();
                break;
            case 'D':
                dinosaurs();
                break;
            case 'M':
                break;
            default:
                System.out.println("Invalid Option");
                break;
                
        }
   
    }
        
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        boolean isValid = false;
        
        while(!isValid) {
            System.out.println("Please select an option: ");
            input = keyboard.nextLine();
            input = input.trim();
            
            if(input == null || input.length() == 0) {
                System.err.println("Invalid input - please enter a valid character");
            } else {
                isValid = true;
            }
        }
        
        return input.toUpperCase();
    }

    private void aboutGame() {
        System.out.println("About stuff");
    }

    private void instructions() {
        System.out.println("About stuff");
    }

    private void purposeOfGame() {
        System.out.println("About stuff");
    }

    private void dinosaurs() {
        System.out.println("About stuff");
    }
}
