/*
 * @author James Sherwood
 * @version: 10/21/2021
 * TCSS 143
 * Professor Sakpal
 */
import java.util.*;
public class Programmer extends Employee{

    //Create random object to be used by multipliers
    Random rand = new Random();

    //Constructor
    public Programmer(String name, int code){
        super(name, code);
    }

    /*
    * Implements employee work method
    * Creates random number between 0.5 and 1.5
    * returns getCode() * multiplier
     */
    public int work(){
        double multiplier = rand.nextDouble() + 0.5;

        return (int) (super.getCode() * multiplier);
    }
    //@Override toString
    public String toString(){
        return "Programmer:" + super.toString();
    }
}
