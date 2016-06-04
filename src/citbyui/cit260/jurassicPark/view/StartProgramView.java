/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.jurassicPark.view;

import byui.cit260.jurassicPark.control.GameControl;
import byui.cit260.jurassicPark.model.Player;
import java.util.Scanner;

/**
 *
 * @author Matthew
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView(){
        
        this.promptMessage = "\nPlease Enter Your Name: ";
        
        this.displayBanner();
      
    }
    
/*  private void displayBanner(){
        throw new UnsupportedOperationException("Not Supported Yet!");
    }
*/
    public void displayBanner() {
        
        System.out.println(
         "\n--------------------------------------------"
        +"\n-                                          -"
        +"\n- The Banner for This Class Jurassic Park. -"
        +"\n-                                          -"
        +"\n--------------------------------------------"
        );
    }

    public void displayStartProgramView() {
       
        boolean done = false;
        do{
            String playersName = this.getPlayersName();
            if(playersName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(playersName);
                       
        }while (!done);
    }

    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while(!valid){
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if(value.length() < 1){
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break;
        }
        return value;
    }
    
    private boolean doAction(String playersName) {
        
        if (playersName.length() < 2){
            System.out.println("nInvlaid Players Name: " 
                    + "The man name must be greater than one character in length");
            return false;
        }
        
      /*  Player player = GameControl.createPlayer(playersName);
        
        if ( player == null){
            System.out.println("\nError creating the player.");            
            return false;
        
        this.displayNextView(player);*/
        
        }
        
}   
        }
private void displayNextView(Player player) {
        System.out.println("\n*** displayNextView() called ***");
}   

     //To change body of generated methods, choose Tools | Templates.
