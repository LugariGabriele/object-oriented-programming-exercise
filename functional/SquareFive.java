package functional;

import java.util.List;

/**
 * Given a list of integers, square those numbers, add 10, omit any of the resulting numbers that end in 5, and return their number.
 *
 * Examples:
 *
 * squareFive([3, 1, 4]) → 3 ([19, 11, 26])
 * squareFive([1]) → 1 ([11])
 * squareFive([5]) → 0 ([])
 * The method has the following prototype:
 *
 * public static long squareFive(List<Integer> nums);
 */
public class SquareFive {
    public static long squareFive(List<Integer> nums){
        return nums.stream().map(number->(number*number)+10).filter(res->!(res%10==5)).count();
    }
}
