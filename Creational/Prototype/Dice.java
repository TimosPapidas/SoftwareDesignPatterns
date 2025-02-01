package SoftwareDesignPatterns.Creational.Prototype;
import java.util.ArrayList;
import java.util.Random;

public class Dice implements Prototype{
    private ArrayList<Integer> pastRolls;
    private Random random;

    public Dice(Random random){
        this.random = random;
        this.pastRolls = new ArrayList<>();
    }
    public Dice(Random random, ArrayList<Integer> pastRolls){
        this.random = random;
        this.pastRolls = pastRolls;
    }

    public int roll(){
        int roll = random.nextInt(6) + 1;
        pastRolls.add(roll);
        return roll;
    }

    public Dice clone(){
        return new Dice(random, new ArrayList<>(pastRolls));
    } 
}
