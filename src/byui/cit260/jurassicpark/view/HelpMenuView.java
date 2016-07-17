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
public class HelpMenuView extends View{
    
    public HelpMenuView(){
        super("\n"
            +"\n-------------------------"
            +"\n|   Help Menu           |" 
            +"\n-------------------------"        
            + "\nS - Story"
            + "\nI - Instructions"
            + "\nP - Purpose of Game"
            + "\nD - Dinosaurs"
            + "\nM - Main Menu"
            + "\n         ");
    }
        
    
    public boolean doAction(String input) {
        
        char selection = input.toUpperCase().charAt(0);
           
        switch(selection) {
            case 'S':
                Story();
                break;
            case 'I':
                Instructions();
                break;
            case 'P':
                purposeOfGame();
                break;
            case 'D':
                Dinosaurs();
                break;
            case 'M':
                break;
            default:
                console.println("Invalid Option");
                break;
                
        }
        return false;
    }

    private void Story() {
        console.println("About stuff");
    }

    private void Instructions() {
        console.println("About stuff");
    }

    private void purposeOfGame() {
        console.println("About stuff");
    }

    private void Dinosaurs() {
        console.println("About stuff");
    }

}
