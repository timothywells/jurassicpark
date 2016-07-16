/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.control;

import byui.cit260.jurassicpark.model.Dinosaur;
import byui.cit260.jurassicpark.model.Game;
import byui.cit260.jurassicpark.model.Map;
import byui.cit260.jurassicpark.model.Player;
import byui.cit260.jurassicpark.view.ErrorView;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import jurassicpark.JurassicPark;

/**
 *
 * @author Matthew
 */
public class ProgramController {
    
    public static Player createPlayer(String playerName) {
        
        if(playerName == null) {
            return null;
        }
        Player p = new Player();
        p.setName(playerName);
        return p;
    }
    
    public static void createNewGame(Player player) {
        
        Game g = new Game();
        g.setPlayer(player);
        
        Map gameMap = new Map();
        g.setMap(gameMap);
        
        player.setLocation(gameMap.getLocation(9,0));
        
        JurassicPark.setGame(g);
    }
    
   private static void createDinosaur(Dinosaur dinosaur) {
        
        Game g = new Game();
        g.setDinosaur(dinosaur);
        
        Map gameMap = new Map();
        g.setMap(gameMap);
        
        dinosaur.setLocation(gameMap.getLocation(5,5));
        
        JurassicPark.setGame(g);
   }
    public static void saveGame(String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(JurassicPark.getGame());
        } catch(Exception e) {
            ErrorView.display("ProgramController", e.getMessage());
            
        }
    }
    
    public static void loadGame(String filePath) {
        Game game = null;
        
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            game = (Game)ois.readObject();
            
            JurassicPark.setGame(game);
            JurassicPark.setPlayer(game.getPlayer());
        } catch (Exception e) {
            ErrorView.display("ProgramController", e.getMessage());
        }
    }
}
