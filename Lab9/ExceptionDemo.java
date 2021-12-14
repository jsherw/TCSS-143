/*
   Author: James Sherwood
   TO Do: Answer the following questions
   
      Test Input 							Exceptions
   java ExceptionDemo 100 4			_____No Exception_____
   java ExceptionDemo 100 0			____ArithmeticException " / by zero "___
   java ExceptionDemo 100 four		__NumberFormatException "For input string: "four""__
   java ExceptionDemo 100 			   ____ArrayIndexOutOfBoundsException "Index 1 out of bounds for length 1"___
*/
public class ExceptionDemo {

    public static void main (String[] args) {
        try {
            System.out.println(divideArray(args));
            // Separate catch statements vs. one with multiple exceptions to provide clarity to user.
            //  Alternatively: catch(ArithmeticException | NumberFormatException| ArrayIndexOutOfBoundsException ex){}
        } catch(ArithmeticException ex){
            System.out.println("ArithmeticException, unable to divide by zero.");
        } catch(NumberFormatException ex){
            System.out.println("NumberFormatException, please enter two valid integers.");
        } catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayIndexOutOfBoundsException, please enter two valid integers.");
        }
    }

    private static int divideArray(String[] array) {
            String s1 = array[0];
            String s2 = array[1];
            return divideStrings(s1, s2);
    }

    private static int divideStrings(String s1, String s2) {
            int i1 = Integer.parseInt(s1);
            int i2 = Integer.parseInt(s2);
            return divideInts(i1, i2);
    }

    private static int divideInts(int i1, int i2) {
            return i1 / i2;
    }
}