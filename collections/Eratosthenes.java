package collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Implement the sieve of Eratosthenes: a method for computing prime numbers, known to the ancient Greeks.
 * This method will compute all prime numbers up to n. Choose an n. First insert all numbers from 1 to n into a set.
 * Then erase all multiples of 2 (except 2); that is, 4, 6, 8, 10, 12 . . . .
 * Erase all multiples of 3; that is, 6, 9, 12, 15 . . . . Go up to sqrt(n). Then return the set.
 */
public class Eratosthenes {
    public static Set<Integer> eratosthenes(int n) {
        Set<Integer> numbers = new HashSet<>();
        /**
         * First insert all numbers from 1 to n into a set.
         */
        for (int i = 2; i <= n; i++) {
            numbers.add(i);
        }


        System.out.println(numbers);
        for (int i = 2; i <= Math.sqrt(n); i++) {
            numbers.removeAll(multiple(i, n));
        }
        return numbers;
    }

    /**
     * multiple of n until limit
     *
     * @param n
     * @param limit
     */
    public static Set<Integer> multiple(int n, int limit) {
        Set<Integer> multiples = new HashSet<>();
        for (int i = 2; i <= limit; i++) {
            multiples.add(n * i);
        }
        return multiples;
    }


}
