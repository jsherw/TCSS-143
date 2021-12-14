/*
    @author James Sherwood
    @version 11/19/2021
    TCSS 143
    Professor Sakpal
    Lab 8 (DigitPlay)
 */

public class DigitPlay {
    public static void main(String[] args) {
        //  Method Calls

        prodDigits(1234567);

    }

    /*
        Method: Recursively determines the product of digits
        Param:  int n
        Return: int
     */
    public static int prodDigits(int n){
        if(n < 10){
            return n;
        } else {
            return (n%10) * prodDigits(n/10);
        }
    }
}
