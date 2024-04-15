package collections;

import java.util.ArrayList;
import java.util.List;

/**
 * If the number is even, divide it by two.
 * If the number is odd, triple it and add one.
 * The Collatz conjecture is one of the most famous unsolved problems in mathematics.
 * The conjecture asks whether repeating the two simple arithmetic operations above will eventually transform every positive integer into 1.
 * Write a static method returning the Collatz sequence for a given integer number greater than 0.
 * <p>
 * Examples:
 * <p>
 * collatzSequence(1) -> [1]
 * collatzSequence(2) -> [2, 1]
 * collatzSequence(3) -> [3, 10, 5, 16, 8, 4, 2, 1]
 * collatzSequence(4) -> [4, 2, 1]
 * The method has the following prototype:
 */
public class CollatzSequence {

    public static List<Long> collatzSequence(long n) {
        if (n<1){
            return new ArrayList<>();
        }
        List<Long> sequence = new ArrayList<>(List.of(n));
        while (n != 1) {
            if (n % 2 == 0) { //even number
                n = n / 2;
            } else { //odd numbers
                n = n * 3 + 1;
            }
            sequence.add(n);
        }
        return sequence;
    }
}
