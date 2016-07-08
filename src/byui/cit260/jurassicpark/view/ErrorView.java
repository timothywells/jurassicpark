/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import java.io.PrintWriter;
import jurassicpark.JurassicPark;

/**
 *
 * @author Tim
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = JurassicPark.getOutFile();
    private static final PrintWriter logFile = JurassicPark.getLogFile();
    
    public static void display(String className, String errorMsg) {
        errorFile.println("---------------------------" +
                "\nERROR: " + errorMsg +
                "\n---------------------------");
        
        logFile.println(className + " - " + errorMsg);
       
    }
}