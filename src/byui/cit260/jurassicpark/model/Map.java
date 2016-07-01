/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

import java.io.Serializable;


/**
 *
 * @author christian
 */
public class Map implements Serializable {
    
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 10;
    
    private Location[][] matrix;
    
    public Map() {
        matrix = new Location [NUM_ROWS] [NUM_COLS];
        init();
    }
    
    public void init() {
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                Location loc = new Location();
                
                //random location
                loc.setType(LocationType.values()[(int) (Math.random() * LocationType.values().length)]);
                loc.setRow(row);
                loc.setCol(col);
                
                matrix[row][col] = loc;
            }
        }
    }
    
    public String getMapString() {
        
        String rtn = "";
        
        for (int row = 0; row < NUM_ROWS; row++){
            for (int col = 0; col < NUM_COLS; col++) {
                    rtn += matrix[row][col].getType().name.charAt(0) + "\t";
                }
                rtn += "\t";
            }
        
        return rtn;
    }
    
    public Location getLocation(int row, int col) {
        return matrix[row][col];
    }
}
