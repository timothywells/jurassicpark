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
            return 0;
        }
        
        double torch = (lighter/lighter) * (cloth/cloth) * (stick/stick) * (fuel/fuel);
        return torch;
        
    }
    
    public int calcTorchesBuildable(int lighter, int cloth, int stick, int fuel) {
        
        if (lighter <= 0 || cloth <= 0 || stick <= 0 || fuel <= 0){
            return 0;
        }
        
        //takes 1 lighter
        //takes 1 cloth
        //takes 1 stick
        //takes 1 fuel
        if(lighter <= cloth && lighter <= stick && lighter <= fuel) {
            return lighter;
        }
        //TODO more of the if above for each item type
        return 0;
    }
}
