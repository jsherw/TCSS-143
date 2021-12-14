/*
    @author James Sherwood (power function only)
    @version 11/19/2021
    Professor Raghavi Sakpal
   TCSS 143
   Reads in two integers and uses a recursive power method 
   to compute the first raised to the second power. 
*/

import java.util.Scanner;

public class Power   {
   public static void main(String[] args) {
      int base, exp;
      int answer;
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Welcome to the power program! ");
      System.out.println("Please use integers only.");

      //get base
      System.out.print("Enter the base you would like raised to a power: ");
      base = scan.nextInt();
      
      //get exponent
      System.out.print("Enter the power you would like it raised to: ");
      exp = scan.nextInt();
      answer = power(base,exp);
      System.out.println(base + " raised to the " + exp + " is " + answer);
 }
   /*
     Method: Computes and returns base^exp
     Param: int base, int exp
     Return: int
   */
   public static int power(int base, int exp)  {
      int pow;

      //if the exponent is 0, set pow to 1
      if (exp == 0){
         return 1;
      } else if (exp % 2 == 0){
         return power(base*base, exp / 2);
      } else{
         //other wise set pow to base*base^(exp-1)
         return base * power(base, exp -1);
      }
      //return pow
   }

} 