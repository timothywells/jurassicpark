/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.exceptions;

/**
 *
 * @author christian
 */
public class MovementException extends Exception {

    public MovementException() {
    }

    public MovementException(String string) {
        super(string);
    }

    public MovementException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public MovementException(Throwable thrwbl) {
        super(thrwbl);
    }

    public MovementException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }


    }
    

