package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a generic static method to reverse a list (see List.get() and List.set() methods).
 *
 * Examples:
 *
 * reverse([1, 2]) → [2, 1]
 * reverse([1, 2, 3, 4]) → [4, 3, 2, 1]
 * reverse(["hello", "world"]) → ["world", "hello"]
 */
public class Reverse {
    public static <T> void reverse(List<T> list){

        for (int i = 0; i <Math.floor(list.size()/2) ; i++) {
            T tmp=list.get(i);
            list.set(i,list.get(list.size()-i-1));
            list.set(list.size()-i-1,tmp);

        }
    }


}
