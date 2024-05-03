package generics;

/**
 * Write a generic static method counting all occurrences of a specific item of type T within a T[].
 * If the passed item is null, the method should return the number of null values within the array.
 *
 * Examples:
 *
 * countOccurrences([1, 2, 2, 2], 2) → 3
 * countOccurrences([null, null, 3, 4], null) → 2
 * countOccurrences(["hello", "world", null, null], "hello") → 1
 */
public class CountOccurrences {
    public static <T> int countOccurrences(T[] src, T item) {
        int count = 0;

        for (T t : src) {
            if (item == null && t == null) {
                count++;
            } else if (t != null && t.equals(item)) {
                count++;
            }
        }
        return count;
    }

}