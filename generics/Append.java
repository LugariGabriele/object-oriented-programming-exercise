package generics;

import java.util.List;

/**
 * Write a generic static method that appends the elements of one list to another list of the same type.
 *
 * Examples:
 *
 * append([], [1, 2]) → [1, 2]
 * append([1, 2], [3, 4]) → [1, 2, 3, 4]
 * append(["a", "c"], ["c", "d"]) → ["a", "c", "c", "d"]
 */
public class Append {
    public static <T> void append(List<T> dst, List<T> src){
            for (T t:src){
                dst.add(t);
            }
    }
}
