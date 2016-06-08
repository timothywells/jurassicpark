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
public class LoadMenuView {
    
    private final String menu = "\n"
            + "\n1 - Saved Game 1"
            + "\n2 - Saved Game 2"
            + "\n3 - Saved Game 3"
            + "\nQ - Quit"
            ;

    public LoadMenuView(){
        
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
            case '1':
                savedGame1();
                break;
            case '2':
                savedGame2();
                break;
            case '3':
                savedGame3();
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
        
        String GameDescription = "";
        GameDescription = "\n--------------------------------------------" +
        "\n-      Continue on in your adventure.      -" +
        "\n--------------------------------------------";
        
        System.out.println("Saved Game Menu");
        
    }

    private void savedGame1() {
         System.out.println("Load Game");
    }
    private void savedGame2() {
         System.out.println("Load Game");
    }
    private void savedGame3() {
         System.out.println("Load Game");
    }
}

    

