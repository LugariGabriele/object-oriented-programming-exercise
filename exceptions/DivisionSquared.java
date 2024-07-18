package exceptions;

/**
 * Write a method receiving two integers (a, b) and returning their integer division squared ( i.e., (a / b) ^ 2).
 * If b == 0, the method returns 0, instead of an exception. The implementation of this method must avoid the use of the if statement.
 * The method has the following prototype:
 *
 * public static int divisionSquared(int a, int b);
 */
public class DivisionSquared {
    public static int divisionSquared(int a, int b){
        try{
            return (int) Math.pow((a/b),2);
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
