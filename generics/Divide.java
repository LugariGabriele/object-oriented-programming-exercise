package generics;

/**
 * Write a generic static method returning the floating point division of any two numbers regardless of
 * their specific type e.g. int, double, etc. (see java.lang.Number class).
 */
public class Divide {
    public static <T extends Number> double divide(T a, T b) {

        double num = a.doubleValue();
        double den = b.doubleValue();
        return num / den;


    }
}
