package functional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
 *
 * Examples:
 *
 * oneTen([1, 2, 3]) → [20, 30, 40]
 * oneTen([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
 * oneTen([10]) → [110]
 */
public class OneTen {
    public static List<Integer> oneTen(List<Integer> nums){
        return nums.stream().map(number->number+1).map(res->res*10).collect(Collectors.toList());
    }
}
