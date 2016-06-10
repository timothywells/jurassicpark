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
public class MapControl {
    public double calcResistance (double voltage, double amps){
        
         if ((voltage < 110 || voltage > 110) && (amps < 20 || amps > 20)){
            return 0;
         }
         
         double resistance = voltage / amps;
         return resistance;
        
    }
}
