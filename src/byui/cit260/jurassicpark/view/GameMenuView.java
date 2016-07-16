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
import jurassicpark.JurassicPark;

/**
 * 
 * @author Tim W
 */

public class GameMenuView extends View {

    public GameMenuView(){
        super("\n"
            +"\n-------------------------"
            +"\n|   Game Menu           |" 
            +"\n-------------------------"
            + "\nN - Move North"
            + "\nE - Move East"
            + "\nS - Move South"
            + "\nW - Move West"
            + "\nM - View Map"
            + "\nQ - Quit"
            + "\n         "
            + "\n         ");
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
            case 'M':
                viewMap();
                break;
            case 'Q':
                return true;
            default:
                console.println("Invalid Option");
                break;
        }
        return false;
    }
    
    private void moveNorth(){
        MovementController mc = new MovementController();
            if(mc.moveNorth(JurassicPark.getGame()) == false){
            console.println("You can't move North!");
        }
        Location playerLocation = JurassicPark.getGame().getPlayer().getLocation();
        console.println(
                "\n Your locations is " + playerLocation.getRow() + ", " + playerLocation.getCol()
        );
    }
    
    private void moveEast(){
        MovementController mc = new MovementController();
            if(mc.moveEast(JurassicPark.getGame()) == false){
            console.println("You can't move East!");
        }
        Location playerLocation = JurassicPark.getGame().getPlayer().getLocation();
        console.println(
                "\n Your locations is " + playerLocation.getRow() + ", " + playerLocation.getCol()
        );
    }
    
    private void moveSouth(){
        MovementController mc = new MovementController();
            if(mc.moveSouth(JurassicPark.getGame()) == false){
            console.println("You can't move South!");
        }
        Location playerLocation = JurassicPark.getGame().getPlayer().getLocation();
        console.println(
                "\n Your locations is " + playerLocation.getRow() + ", " + playerLocation.getCol()
        );
    }
    
    private void moveWest(){
        MovementController mc = new MovementController();
            if(mc.moveWest(JurassicPark.getGame()) == false){
            console.println("You can't move West!");
        }
        Location playerLocation = JurassicPark.getGame().getPlayer().getLocation();
        console.println(
                "\n Your locations is " + playerLocation.getRow() + ", " + playerLocation.getCol()
        );
    }
    
    private void viewMap(){            
        console.println(JurassicPark.getGame().getMap().getMapString());
    }
       
}

    
