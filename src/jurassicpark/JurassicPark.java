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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        inFile = new BufferedReader(new InputStreamReader(System.in));
        outFile = new PrintWriter(System.out, true);
        StartProgramView startProgram = new StartProgramView();
        startProgram.startProgram();
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

    public static PrintWriter getLogFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

}
