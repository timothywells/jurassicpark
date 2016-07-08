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
 * 
 * @author Tim W
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
            console.println("You have moved North");
        } catch (MovementException me) {
            console.println("You cannot move there");
        } finally {
        //always execute
            console.println("Finally executes");
    }
    }
    
    private void moveEast(){
        MovementController mc = new MovementController();
        try {
            mc.moveNorth(JurassicPark.getGame());
            console.println("You have moved East");
        } catch (MovementException me) {
            console.println("You cannot move there");
        } finally {
        //always execute
            console.println("Finally executes");
    }
    }
    private void moveSouth(){
        MovementController mc = new MovementController();
        try {
            mc.moveNorth(JurassicPark.getGame());
            console.println("You have moved South");
        } catch (MovementException me) {
            console.println("You cannot move there");
        } finally {
        //always execute
            console.println("Finally executes");
    }
    }
    private void moveWest(){
        MovementController mc = new MovementController();
        try {
            mc.moveNorth(JurassicPark.getGame());
            console.println("You have moved West");
        } catch (MovementException me) {
            console.println("You cannot move there");
        } finally {
        //always execute
            console.println("Finally executes");
    }
    }
    private void showLocation(){            
        Location playerLocation = JurassicPark.getGame().getPlayer().getLocation();
        System.out.println(
                "\n Your locations is " + playerLocation.getRow() + ", " + playerLocation.getCol()
        );
    }
       
}

    
