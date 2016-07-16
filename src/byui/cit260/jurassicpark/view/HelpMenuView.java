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
            +"\n|   Main Menu           |" 
            +"\n-------------------------"        
            + "\nA - About Game"
            + "\nI - Instructions"
            + "\nP - Purpose of Game"
            + "\nD - Dinosaurs"
            + "\nM - Main Menu");
   
        
    }
        
    @Override
    public boolean doAction(String selection) {
        
        char charSel = selection.toUpperCase().charAt(0);
           
        switch(charSel) {
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
                console.println("Invalid Option");
                break;
                
        }
        return false;
    }

    private void aboutGame() {
        console.println("About stuff");
    }

    private void instructions() {
        console.println("About stuff");
    }

    private void purposeOfGame() {
        console.println("About stuff");
    }

    private void dinosaurs() {
        console.println("About stuff");
    }

}
