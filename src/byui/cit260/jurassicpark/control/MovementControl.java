/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.control;

/**
 *
 * @author Tim
 */
public class MovementControl {
    
    public boolean moveNorth(Game game) {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getRow() == 0) {
            return false;
        }
        
        int currentCol = currentLocation.getCol();
        int currentRow = currentLocation.getRow();
        int newRow = currentRow - 1;
        
        Location newLocation = map.getLocation(newRow, currentCol);
        player.setLocation(newLocation);
        
        return true;
    }
    
    public boolean moveEast(Game game) {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getCol() == Map.NUM_COLS - 1) {
            return false;
        }
        
        player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getCol() + 1));
        
        return true;
    }
    
    public boolean moveSouth(Game game) {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getRow() == Map.NUM_ROWS - 1) {
            return false;
        }
        
        player.setLocation(map.getLocation(currentLocation.getRow() + 1, currentLocation.getCol()));
        
        return true;
    }
    
    public boolean moveWest(Game game) {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getCol() == 0) {
            return false;
        }
        
        player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getCol() - 1));
        
        return true;
    }
}
