/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

import byui.cit260.jurassicpark.control.BreakerBoxController;
import java.io.Serializable;

/**
 *
 * @author Tim
 */
public class Location implements Serializable{
    
    private LocationType type;
    private Player player;
    private Item item;
    private Dinosaur dinosaur; 
    private BreakerBoxController panel;
    private Helipad helipad;
    private int row;
    private int col;
    
    public Location(){
        
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
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    public Dinosaur getDinosaur() {
        return dinosaur;
    }

    public void setDinosaur(Dinosaur dinosaur) {
        this.dinosaur = dinosaur;
    }
    
    public BreakerBoxController getPanel() {
        return panel;
    }

    public void setPanel(BreakerBoxController panel) {
        this.panel = panel;
    }
    
}
