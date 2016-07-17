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
import java.util.ArrayList;
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
        
        emplaceRandomDinosaur(gameMap);
        
        player.setLocation(gameMap.getLocation(9,0));
        
        JurassicPark.setGame(g);
    }
    public static void emplaceRandomDinosaur(Map map) {
        
        List<Dinosaur> dinosaurs = createDinosaurLocation();
        boolean success = false;
        
        for(Dinosaur d : dinosaurs) {
            
            do {
                int row = (int)(Math.random() * Map.NUM_ROWS);
                int col = (int)(Math.random() * Map.NUM_COLS);
            
                 success = false;
                
                if(map.getLocation(row, col).getDinosaur() == null) {
                    map.getLocation(row, col).setDinosaur(d);
                    success = true;
                }
                
            } while(success == false);
            
        }
        
    }
   public static List<Dinosaur> createDinosaurLocation() {
        
        List<Dinosaur> dinosaurList = new ArrayList<>();
        
        Dinosaur raptor1 = new Dinosaur();
        raptor1.setName("Raptor");
        dinosaurList.add(raptor1);
        
        Dinosaur raptor2 = new Dinosaur();
        raptor2.setName("Raptor");
        dinosaurList.add(raptor2);
        
        Dinosaur raptor3 = new Dinosaur();
        raptor3.setName("Raptor");
        dinosaurList.add(raptor3);
        
        Dinosaur raptor4 = new Dinosaur();
        raptor4.setName("Raptor");
        dinosaurList.add(raptor4);
        
        Dinosaur trex = new Dinosaur();
        trex.setName("T-Rex");
        dinosaurList.add(trex);
        
        return dinosaurList;
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
