/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author christian
 */
public class Dinosaur implements Serializable{
    
    private String Dinosaur;
    Location location;
    
    public Dinosaur(){
    
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    
}

