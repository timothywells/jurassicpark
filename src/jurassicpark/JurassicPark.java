/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurassicpark;

import byui.cit260.jurassicpark.model.Game;
import byui.cit260.jurassicpark.model.Location;
import byui.cit260.jurassicpark.model.Player;
import byui.cit260.jurassicpark.view.StartProgramView;
import java.io.PrintWriter;

/**
 *
 * @author christian
 */
public class JurassicPark {
    
    private static Player player;
    private static Game game;
    private static Location location;

  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgram = new StartProgramView();
        
        startProgram.startProgram();
    }
    
     public static Player getPlayer() {
        return player;
    }
     
     public static void setPlayer(Player player) {
        JurassicPark.player = player;
    }
     
    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        JurassicPark.game = game;
    }
   public static Location getLocation() {
        return location;
    }

    public static void setLocation(Location location) {
        JurassicPark.location = location;
    }

    public static PrintWriter getLogFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static PrintWriter getOutFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
