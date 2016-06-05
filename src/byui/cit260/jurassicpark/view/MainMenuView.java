/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import byui.cit260.jurassicpark.control.ProgramController;
import static java.sql.DriverManager.println;
import java.util.Scanner;
import jurassicpark.JurassicPark;

/**
 *
 * @author Matthew
 */
public class MainMenuView {
    
    private final String menu = "\n"
            + "\nN - Start new game"
            + "\nL - Load saved game"
            + "\nS - Save current game"
            + "\nH - Help menu"
            + "\nQ - Quit"
            ;

    public MainMenuView(){
        
    }
    
    public void displayMenu(){
        
        char selection = ' ';
        
        do {
            System.out.println(menu);
            
            String input = getInput();
            selection = input.charAt(0);
            
        } while (selection != 'Q');
    }
    
    public void doAction(char selection) {
        
        switch(selection) {
            case 'N':
                startNewGame();
                break;
            case 'L':
                loadSavedGame();
                break;
            case 'S':
                saveCurrentGame();
                break;
            case 'H':
                helpMenu();
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
                System.err.println("Invalid input - please enter a valid character");
            } else {
                isValid = true;
            }
        }
        
        return input.toUpperCase();
    }

    private void startNewGame() {
        ProgramController.createNewGame(JurassicPark.getPlayer());
        System.out.println("CALLED START NEW GAME - NIY"); //To change body of generated methods, choose Tools | Templates.
    }

    private void loadSavedGame() {
         System.out.println("CALLED START NEW GAME - NIY");
    }

    private void saveCurrentGame() {
         System.out.println("CALLED START NEW GAME - NIY");
    }
    private void helpMenu() {
         System.out.println("CALLED START NEW GAME - NIY");
    }
}

    
