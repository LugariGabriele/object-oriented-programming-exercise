package collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Write a method returning the union of two given sets of Integers. Write two versions of the same method with and without using Set.addAll().
 * <p>
 * Examples:
 * <p>
 * union([1,2,3], [4,5,6]) → [1,2,3,4,5,6]
 * union([1,2,3], [3,4,5]) → [1,2,3,4,5]
 * union([], []) → []
 */
public class Union {
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> fusion = new HashSet<>(first);
        for (int numbers : second) {
            fusion.add(numbers);
        }
        return fusion;
    }

    public static Set<Integer> unionAddAll(Set<Integer> first, Set<Integer> second) {

        first.addAll(second);
        System.out.println(first);
        return first;
    }
    /**
    public static void main(String[] args) {
        List<Integer> l = List.of();

        Set<Integer> first= new HashSet<>(l);
        List<Integer> l2 = List.of();

        Set<Integer> second= new HashSet<>(l2);
        unionAddAll(first,second);
    }**/
}


