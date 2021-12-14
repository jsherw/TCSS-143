/*
    @author James Sherwood
    @version 11/19/2021
    TCSS 143
    Professor Sakpal
    Lab 8
 */
import java.util.*;

public class TeddyBear {
    public static void main(String[] args) {
        //  Declare scanner
        Scanner scnr = new Scanner(System.in);
        System.out.println("How many bears would you like to start with?");
        int n = scnr.nextInt();

        //test user input with method call to tedBearCount

        if (tedBearCount(n) == true){
            System.out.println("tedBearCount(" + n + ") is true");
        } else{
            System.out.println("tedBearCount(" + n + ") is false");
        }
    }

    /*
        Description: Uses recursive backtracking to determine if problem is solvable.
        Param: int
        return: boolean
     */
    public static boolean tedBearCount(int n) throws IllegalArgumentException{
        if (n == 42){       // if the user picks the target number, no evaluation is needed
            return true;
        }
        if ( n < 42){       // Since we can only remove bears, any number less than 42 will have no solution.
            return false;
        }

        //  Since conditions are not necessarily exclusive, check each branching path until a solution is found.
        if (n % 2 == 0 && tedBearCount(n /2)){
            return true;
        }
        if ( n % 5 == 0 && tedBearCount(n - 42)){
            return true;
        }
        if (n % 4 == 0 || n % 3 == 0){
            int x = (n % 10) * ((n%100) / 10);
            return (x != 0 && tedBearCount(n - x));
        }
        return false;
    }
}
