package collections;
import java.util.*;
import java.util.HashSet;

/**
 * Write a method returning the intersection of two given sets of Integers (without using the Set.retainAll() method).
 *
 * Examples:
 *
 * intersection([1,2,3], [4,5,6]) → []
 * intersection([1,2,3], [3,4,5]) → [3]
 */
public class Intersection {
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second){
    Set<Integer> tmp= new HashSet<>();
        for (int i : first) {
            if (second.contains(i)){
                tmp.add(i);
            }
        }
        return tmp;
    }


}
