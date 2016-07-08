/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import byui.cit260.jurassicpark.control.MovementController;
import byui.cit260.jurassicpark.control.ProgramController;
import byui.cit260.jurassicpark.exception.MovementException;
import byui.cit260.jurassicpark.model.Location;
import java.util.Scanner;
import jurassicpark.JurassicPark;

/**
 * This File needs to be redone. This is the in game menu not the main menu.
 * @author Matthew
 */

public class GameMainView extends View {

    public GameMainView(){
        super("\n"
            +"\n-------------------------"
            +"\n|   Game Menu           |" 
            +"\n-------------------------"
            + "\nN - Move North"
            + "\nE - Move East"
            + "\nS - Move South"
            + "\nW - Move West"
            + "\nL - Location"
            + "\nQ - Quit");
    }
    
    public boolean doAction(String input) {
        char selection = input.toUpperCase().charAt(0);
        
        switch(selection) {
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
            case 'L':
                showLocation();
                break;
            case 'Q':
                return true;
            default:
                System.out.println("Invalid Option");
                break;
        }
        return false;
    }
    
    private void moveNorth(){
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
    
    private void moveEast(){
        MovementController mc = new MovementController();
        mc.moveEast(JurassicPark.getGame());
    }
    
    private void moveSouth(){
        MovementController mc = new MovementController();
        mc.moveSouth(JurassicPark.getGame());
    }
    
    private void moveWest(){
        MovementController mc = new MovementController();
        mc.moveWest(JurassicPark.getGame());
    }
    
    private void showLocation(){            
        Location playerLocation = JurassicPark.getGame().getPlayer().getLocation();
        System.out.println(
                "\n Your locations is " + playerLocation.getRow() + ", " + playerLocation.getCol()
        );
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
}

    

