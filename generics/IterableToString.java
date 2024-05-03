package generics;

/**
 * Write a generic static method returning a string representing all the elements of an object implementing the Iterable interface.
 * The elements should be separated by commas.
 *
 * Examples:
 *
 * iterableToString([1, 2, 3]) → "1, 2, 3, "
 * iterableToString(["a", "b", "c"]) → "a, b, c, "
 */
public class IterableToString {

    public static <E> String iterableToString(Iterable<E> src){
        StringBuilder sb = new StringBuilder();
        for (E e:src) {

            sb.append(e).append(", ");
        }
        return sb.toString();
    }
}
