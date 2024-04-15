package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *Write a method to remove all duplicate elements from a List<Integer>.
 *
 * Examples:
 *
 * removeDuplicates([1,2,3,4,5]) → [1,2,3,4,5]
 * removeDuplicates([1,1,1,2,2]) → [1,2]
 */
public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list){
        /**
         * list<> contains array list that can be initialized with an hashset which is contained in the Set and remove autmatically
         * the duplicate
         */
        ArrayList<Integer> remove = new ArrayList<>(new HashSet<>(list));
        return remove;
    }
}
