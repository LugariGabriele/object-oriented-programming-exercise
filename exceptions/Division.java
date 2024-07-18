package exceptions;

/**
 * Write a method receiving two doubles (a, b) and returning their division.
 * If b == 0, the method throws IllegalArgumentException.
 * Note well: IllegalArgumentException is an unchecked exception so its declaration in the method signature is not required!
 * The method has the following prototype:
 *
 * public static double division(double a, double b);
 */
public class Division {
    public static double division(double a, double b){
        if (b==0){
            throw new IllegalArgumentException();
        }
        return a/b;
    }
}
