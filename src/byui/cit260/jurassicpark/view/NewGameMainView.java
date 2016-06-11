/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import byui.cit260.jurassicpark.control.ProgramController;
import java.util.Scanner;
import jurassicpark.JurassicPark;

/**
 *
 * @author Matthew
 */
public class NewGameMainView {
    
    private final String menu = "\n"
            + "\nD - Describe the Game"
            + "\nP - Describe the Player"
            + "\nR - Describe the Raptor"
            + "\nT - Describe the T-Rex"
            + "\nQ - Quit"
            ;

    public NewGameMainView(){
        
    }
    
    public void displayMenu(){
        
        char selection = ' ';
        
        do {
            System.out.println(menu);
            
            String input = getInput();
            selection = input.charAt(0);
            
            doAction(selection);
            
        } while (selection != 'Q');
    }
    
    public void doAction(char selection) {
        
        switch(selection) {
            case 'D':
                describeGame();
                break;
            case 'P':
                describePlayer();
                break;
            case 'R':
                describeRaptor();
                break;
            case 'T':
                describeTrex();
                break;
            case 'Q':
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
                System.out.println("Invalid input - please enter a valid character");
            } else {
                isValid = true;
            }
        }
        
        return input.toUpperCase();
    }

    private void describeGame() {
        System.out.println("\n--------------------------------------------" +
        "\n- You are a guest at a new park featuring  -" +
        "\n- dinosaurs. But something happened and    -" +
        "\n- now there are hungry carnivore out and   -" +
        "\n- very hungry!                             -" +
        "\n--------------------------------------------");
        
    }

    private void describePlayer() {
         System.out.println("CALLED START NEW GAME - NIY");
    }

    private void describeRaptop() {
         System.out.println("CALLED START NEW GAME - NIY");
    }
    private void describeTrex() {
         System.out.println();
    }

    private void describeRaptor() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

    

