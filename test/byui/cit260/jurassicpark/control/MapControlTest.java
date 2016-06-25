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
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of calcResistance method, of class PowerBreakerControl.
     */
    @Test
    public void testCalcResistance() {
        System.out.println("calcResistance");
        double volts = 110.0;
        double amps = 20.0;
        PowerBreakerControl instance = new PowerBreakerControl();
        double expResult = 5.5;
        double result = instance.calcResistance(volts, amps);
        assertEquals(expResult, result, 0.0);
       
    }
    
}
