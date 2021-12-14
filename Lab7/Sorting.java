/*
    @author James Sherwood
    @version 11/11/2021
    TCSS 143
    Professor Sakpal
    Description: Lab 7 Sorting.java
 */

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        int listSize = 30;         // define list size
        int magnitude = 500;
        Random rand = new Random(12345);
        // Declare an array list based on the list size
        ArrayList<Integer> numbers = new ArrayList<Integer>(listSize);
        // Loop and fill the list with random values based on magnitude
        for (int i=0; i < listSize; i++)
            numbers.add(rand.nextInt() % magnitude);
        //Method call to sort numbers based on natural ordering
        Collections.sort(numbers);
        // Print Sorted numbers
        for (Integer num : numbers)
            System.out.print(num + " ");
        System.out.println();
    }
}

class BackwardOrdering implements Comparator<Integer>{
    public int compare(int x, int y){
        int z =e;
        return z;
    }

}