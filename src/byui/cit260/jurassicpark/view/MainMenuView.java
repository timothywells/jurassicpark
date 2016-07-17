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
        ProgramController.createNewGame(JurassicPark.getPlayer());
        GameMainView startNewGame = new GameMainView();
        startNewGame.display();
        
    }

    private void loadSavedGame() {
        console.println("Enter file name: ");
        try {
            String fileName = keyboard.readLine();
            ProgramController.loadGame(fileName);
            GameMainView gmv = new GameMainView();
            gmv.display();
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error on inpiut");
        }
    }

    private void saveCurrentGame() {
        console.println("Enter file name: ");
        try {
            String fileName = keyboard.readLine();
            ProgramController.saveGame(fileName);
        } catch (Exception e){
            ErrorView.display(this.getClass().getName(), "Error on input");
        }
    }
    private void helpMenu() {
         HelpMenuView helpMenu = new HelpMenuView();
         helpMenu.display();
    }

   
}

    
