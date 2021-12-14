/*
 * @author James Sherwood
 * @version: 10/21/2021
 * TCSS 143
 * Professor Sakpal
 */
import java.util.*;

public class Tester extends Employee{
    Random rand = new Random();

    // Constructor
    public Tester(String name, int code){
        super(name, code);
    }

    /*
    * Implements employee work method
    * creates random number between .75 and 1.25
    * Returns: getCode() * multiplier
     */
    public int work(){
        double multiplier = ((double)(rand.nextInt(51) + 75) / 100);
        return (int)(super.getCode() * multiplier);
    }

    //@override toString
    public String toString(){
        return "Tester:" + super.toString();
    }
}
