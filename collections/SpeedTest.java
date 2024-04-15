package collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrate that the position is which elements are added to a List impacts performance in a significant way.
 * Write two methods for inserting an element at the beginning (or end) of a List a certain number of times, returning the elapsed time. Then,
 * write a test for showing that ArrayList is faster than LinkedList
 * when adding elements at the end, while the opposite is true when inserting elements at the beginning (see System.nanoTime()).
 */
public class SpeedTest {
    public static long insertBeginning(List<String> list, String item, int times) {
        long start = System.nanoTime();
        for (int i = 0; i <times ; i++) {
            list.add(0, item);
        }
        return System.nanoTime()-start;
    }

    public static long insertEnd(List<String> list, String item, int times) {
        long start = System.nanoTime();
        for (int i = 0; i <times ; i++) {
            list.add(item);
        }
        return System.nanoTime()-start;
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("luca");
        list.add("gino");

        insertBeginning(list,"ciao",3);

    }
}
