/*
    @author James Sherwood
    @version 11/4/21
    TCSS 143
    Professor Sakpal
 */
import java.util.*;
import java.io.*;

public class ZipcodeSet {
    public static void main(String[] args) throws FileNotFoundException{

        //  Declare Scanner to read from us-500.csv file
        Scanner scnr = new Scanner(new File("us-500.csv"));

        //Declare HashSet
        Set<Integer> zipcodes = new HashSet<Integer>();

        //Loop through file, adding zipcodes to hashSet
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            String[] zip = line.split(",");
            int num = Integer.parseInt(zip[7]);
            zipcodes.add(num);
        }
        // Driver
        char choose = userMenu();
        if(choose == 'a' || choose == 'A'){
            minMax(evenSet(zipcodes));
        } else if (choose == 'b' || choose == 'B'){
            minMax(oddSet(zipcodes));
        }
    }
    //  Methods

    /*
        Method: Finds odd number zipcodes
        Param:  Set<Integer>
        Return: Set<Integer>
     */
    public static Set<Integer> oddSet(Set<Integer> zipcodes){
        Set<Integer> oddZip = new HashSet<Integer>();
        Iterator<Integer> itr = zipcodes.iterator();
        while(itr.hasNext()){
            int num = itr.next();
            if(num % 2 != 0){
                oddZip.add(num);
            }
        }
        return oddZip;
    }

    /*
        Method: Finds even number zipcodes
        Param:  Set<Integer>
        Return: Set<Integer>
     */
    public static Set<Integer> evenSet(Set<Integer> zipcodes){
        Set<Integer> evenZip = new HashSet<Integer>();
        Iterator<Integer> itr = zipcodes.iterator();
        while(itr.hasNext()){
            int num = itr.next();
            if(num % 2 == 0){
                evenZip.add(num);
            }
        }
        return evenZip;
    }
    /*
        Method: Prompts user to select odd or even sets
        Param:  none
        Return: char
     */
    public static char userMenu(){
        //  Declare scanner
        Scanner scnr1 = new Scanner(System.in);
        System.out.println("Please make a selection: ");
        System.out.println("(a) Display minimum and maximum value assigned as an even zipcode.");
        System.out.println("(b) Display minimum and maximum value assigned as an odd zipcode.");
        char choose = scnr1.next().charAt(0);
        return choose;
    }
    /*
        Method: Finds minimum and maximum values of a set
        Param:  Set<Integer>
        Return: none
     */
    public static void minMax(Set<Integer> zipcodes){
        int min = 9999999;
        int max = -9999999;

        // Declare iterator
        Iterator<Integer> itr1 = zipcodes.iterator();

        // Loop through set, determining min and maximum values of the set
        while(itr1.hasNext()){
            int num = itr1.next();
            if (num < min ){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
