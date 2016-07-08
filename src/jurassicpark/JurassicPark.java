/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurassicpark;

import byui.cit260.jurassicpark.model.Game;
import byui.cit260.jurassicpark.model.Location;
import byui.cit260.jurassicpark.model.Player;
import byui.cit260.jurassicpark.view.StartProgramView;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author christian
 */
public class JurassicPark {

    private static Player player;
    private static Game game;
    private static Location location;

    private static BufferedReader inFile;
    private static PrintWriter outFile;
    
    private static PrintWriter logFile;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgram = null;
        try {
        inFile = new BufferedReader(new InputStreamReader(System.in));
        outFile = new PrintWriter(System.out, true);
        String logPath = "log.txt";
        logFile = new PrintWriter(logPath);
        
        startProgram = new StartProgramView();
        
        startProgram.startProgram();
    } catch (Exception e) {
        e.printStackTrace();
        startProgram.startProgram();
    } finally {
            try {
                if (inFile != null) {
                    inFile.close();
                }
                if (outFile != null) {
                    outFile.close();
                }
                if (logFile != null) {
                    logFile.close();
                }
            } catch (Exception ex) {
                System.out.println("Error closing files");
            }
        }
    }
    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        JurassicPark.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        JurassicPark.game = game;
    }

    public static Location getLocation() {
        return location;
    }

    public static void setLocation(Location location) {
        JurassicPark.location = location;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        JurassicPark.inFile = inFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        JurassicPark.outFile = outFile;
    }

       public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        JurassicPark.logFile = logFile;
    }
}
