/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurassicpark;

import byui.cit260.jurassicpark.model.Game;
import byui.cit260.jurassicpark.model.Player;
import byui.cit260.jurassicpark.view.StartProgramView;

/**
 *
 * @author zerto
 */
public class JurassicPark {
    
    private static Player player;

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
    private static Game game;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgram = new StartProgramView();
        
        startProgram.startProgram();
    }
    
}
