package functional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive (see Stream.filter(), Stream.collect()).
 * <p>
 * Examples:
 * <p>
 * noTeen([12, 13, 19, 20]) → [12, 20]
 * noTeen([1, 14, 1]) → [1, 1]
 * noTeen([15]) → []
 */
public class NoTeen {
    public static List<Integer> noTeen(List<Integer> nums) {
        List<Integer> withoutTeen = nums.stream().filter(n -> n <= 12 || n >= 20).collect(Collectors.toList());
        return withoutTeen;
    }
}
