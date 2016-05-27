/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author christian
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcTorchNeeded method, of class InventoryControl.
     */
    @Test
    public void testCalcTorchNeeded() {
        System.out.println("calcTorchNeeded");
        double lighter = 2.0;
        double cloth = 2.0;
        double stick = 2.0;
        double fuel = 2.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 2;
        double result = instance.calcTorchNeeded(lighter, cloth, stick, fuel);
        assertEquals(expResult, result, 0.01);
       
    }
    
}
