/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurasssicpark;
/**
 *
 * @author Matthew
 */
public class JurassicParkPlayer {
    
    public static void main(String[] args) {
        Player playerOne = new Player();
        playerOne.setName("FrankitPoo");
        playerOne.setLife(50);
        playerOne.setRoll(4);
        double Roll = 0;
        playerOne.setMove(Roll);
    }

    private static class Player {

        public Player() {
        }

        private void setLife(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setName(String frankitPoo) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setRoll(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setMove(double Roll) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}