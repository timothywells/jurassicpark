/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import byui.cit260.jurassicpark.control.MovementController;
import byui.cit260.jurassicpark.control.ProgramController;
import byui.cit260.jurassicpark.exception.MovementException;
import static java.awt.SystemColor.menu;
import java.util.Scanner;
import jurassicpark.JurassicPark;

/**
 * This File needs to be redone. This is the in game menu not the main menu.
 * @author Matthew
 */
public class GameMenuView extends View{

    public GameMenuView(){
        super("\n"
                + "\nD - Describe the Game"
                + "\nP - Describe the Player"
                + "\nR - Describe the Raptor"
                + "\nT - Describe the T-Rex"
                + "\nN - Move North"
                + "\nE - Move East"
                + "\nS - Move South"
                + "\nW - Move West"
                + "\nM - View Map"
                + "\nL - View Current Location"
                + "\nQ - Quit");
                }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    public boolean doAction(char selection) {
        
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
            case 'N':
                moveNorth();
                break;
            case 'E':
                moveEast();
                break;
            case 'S':
                moveSouth();
                break;
            case 'W':
                moveWest();
                break; 
            case 'M':
                viewMap();
                break;
            case 'L':
                viewCurrentLocation();
                break;
            case 'Q':
                return true;
            default:
                console.println("Invalid Option");
                break;
        }
        return false;
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
    private void playGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void describeRaptor() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private void moveNorth() {
        MovementController mc = new MovementController();
        try {
            mc.moveNorth(JurassicPark.getGame());
            console.println("You move North");
        } catch (MovementException me) {
            console.println("You cannot move there");
        } finally {
        //always execute
            console.println("Finally executes");
    }
    }

    private void moveWest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveSouth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveEast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewCurrentLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

    

