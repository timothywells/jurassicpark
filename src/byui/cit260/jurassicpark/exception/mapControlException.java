/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.exception;

/**
 *
 * @author christian
 */
public class mapControlException extends Exception{

    public mapControlException() {
    }

    public mapControlException(String message) {
        super(message);
    }

    public mapControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public mapControlException(Throwable cause) {
        super(cause);
    }

    public mapControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
