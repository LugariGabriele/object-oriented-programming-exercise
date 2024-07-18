package functional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of non-negative integers, return a list of those numbers multiplied by 2,
 * omitting any of the resulting numbers that end in 2 (see Stream.map(), Stream.filter(), Stream.collect()).
 *
 * Examples:
 *
 * twoTwo([1, 2, 3]) → [4, 6]
 * twoTwo([2, 6, 11]) → [4]
 * twoTwo([0]) → [0]
 * The method has the following prototype:
 *
 * public static List<Integer> twoTwo(List<Integer> nums);
 */
public class TwoTwo {
     public static List<Integer> twoTwo(List<Integer> nums){
         return nums.stream().map(number->number*2).filter(res->!(res%10==2)).collect(Collectors.toList());
     }

}
