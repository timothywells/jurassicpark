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
public class MainMenuView extends View {
    
    public MainMenuView() {
        super("\n"
            +"\n-------------------------"
            +"\n|   Main Menu           |" 
            +"\n-------------------------"
            + "\nN - Start new game"
            + "\nL - Load saved game"
            + "\nS - Save current game"
            + "\nH - Help menu"
            + "\nQ - Quit");
    }
    
    @Override
    public boolean doAction(String value) {
        
        char charSel =value.toUpperCase().charAt(0);
        
        switch(charSel) {
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
        return false;

    }

    private void startNewGame() {
        GameMainView startNewGame = new GameMainView();
        startNewGame.displayMenu();
        
    }

    private void loadSavedGame() {
         LoadMenuView loadSavedGame = new LoadMenuView();
         loadSavedGame.displayMenu();
    }

    private void saveCurrentGame() {
         System.out.println("CALLED START NEW GAME - NIY");
    }
    private void helpMenu() {
         HelpMenuView helpMenu = new HelpMenuView();
         helpMenu.displayMenu();
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

    
