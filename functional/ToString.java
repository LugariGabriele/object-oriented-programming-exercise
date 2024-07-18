package functional;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Write a method turning a Stream into a comma-separated list of its first n elements (see Collectors.joining())
 * <p>
 * The method has the following prototype:
 * <p>
 * public static <T> String toString(Stream<T> stream, int n);
 */
public class ToString {
    public static <T> String toString(Stream<T> stream, int n) {
        return stream.limit(n).map(Objects::toString).collect(Collectors.joining(","));

    }
}
