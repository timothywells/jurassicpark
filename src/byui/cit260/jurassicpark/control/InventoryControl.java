/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.control;

/**
 *
 * @author Matthew
 */
public class InventoryControl {
    
    public double calcTorchNeeded(double lighter, double cloth, double stick, double fuel){
        
        if (lighter <= 0 || cloth <= 0 || stick <= 0 || fuel <= 0){
            return -1;
        }
        
        double torch = (lighter + cloth + stick + fuel)/4;
        return torch;
        
    }
}
