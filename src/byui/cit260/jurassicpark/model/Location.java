/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

import java.io.Serializable;

/**
 *
 * @author Tim
 */
public class Location implements Serializable{
    
    private LocationType type;
    private Player player;
    private int row;
    private int col;
    
    public Location(){
        
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
    
    public LocationType getType() {
        return type;
    }

    public void setType(LocationType type) {
        this.type = type;
    }
    
}
