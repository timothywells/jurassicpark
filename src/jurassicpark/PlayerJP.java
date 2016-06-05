package jurassicpark;

import java.io.Serializable;
import java.util.Objects;

public class PlayerJP implements Serializable { 
    private String name;
    private double roll;
    private double life;
    private double move;

    public PlayerJP() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRoll() {
        return roll;
    }

    public void setRoll(double roll) {
        this.roll = roll;
    }

    public double getLife() {
        return life;
    }

    public void setLife(double life) {
        this.life = life;
    }

    public double getMove() {
        return move;
    }

    public void setMove(double move) {
        this.move = move;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.roll) ^ (Double.doubleToLongBits(this.roll) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.life) ^ (Double.doubleToLongBits(this.life) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.move) ^ (Double.doubleToLongBits(this.move) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PlayerJP other = (PlayerJP) obj;
        if (Double.doubleToLongBits(this.life) != Double.doubleToLongBits(other.life)) {
            return false;
        }
        if (Double.doubleToLongBits(this.move) != Double.doubleToLongBits(other.move)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.roll) != Double.doubleToLongBits(other.roll)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", roll=" + roll + ", life=" + life + ", move=" + move + '}';
    }

}

   