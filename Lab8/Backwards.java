/*
   @author James Sherwood (printBackwards method)
   @version 11/19/2021
   Raghavi Sakpal
   TCSS 143
   Uses a recursive method to print a string backwards.
*/

import java.util.Scanner;

public class Backwards   {
   public static void main(String[] args) {
      String msg;
      Scanner scan = new Scanner(System.in);
      
      // Accept a string from user 
      System.out.print("Enter a string: ");
      msg = scan.nextLine();
      System.out.print("\nThe string backwards: ");
      printBackwards(msg);    // method call
      System.out.println();
   } 
   
   /*
      Method: Takes a string and recursively prints it backwards
      Param: String
      Return: void
   */
   public static void printBackwards (String s) {
      if (s.length() < 1){
         System.out.println();
      } else {
         System.out.print(s.charAt(s.length() - 1));        // Print character at end of string
         printBackwards(s.substring(0, s.length() - 1));    // Recursively call printBackwardsMethod
      }
   }  
}