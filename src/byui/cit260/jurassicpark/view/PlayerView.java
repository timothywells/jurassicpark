/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

/**
 *
 * @author Matthew
 */
public class PlayerView {
    
    public void displayPlayerView(){
    
        boolean done = false;
        do {
        String playerOption = this.getPlayerOption();
        if(playerOption.toUpperCase().equals("Q"))
            return;

        done = this.doAction(playerOption);
        } while (!done);
    }

        private String getPlayerOption() {
            System.out.println("\n*** getPlayerOption() function called ***");
            return "Buffalo";
        }

        private boolean doAction(String playerOption) {
            System.out.println("\n*** doAction() function called ***");
            return true;
        }
}
