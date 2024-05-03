package generics;

import java.util.Comparator;
import java.util.List;

/**
 * Write two generic static methods returning the maximum and minimum values of a generic list.
 * An instance of Comparator (see java.util.Comparator) is used as a sorting criterion.
 * The methods have the following prototype:
 */
public class MinMax {
    public static <T> T max(List<T> list, Comparator<? super T> cmp){
        T tocompare= list.get(0);
        for (T t : list) {
            if (cmp.compare(tocompare,t)<0){ // negative value means the first is less than the second
                tocompare=t;
            }
        }
        return tocompare;
    }
    public static <T> T min(List<T> list, Comparator<? super T> cmp){
        T tocompare= list.get(0);
        for (T t : list) {
            if (cmp.compare(tocompare,t)>0){
                tocompare=t;
            }
        }
        return tocompare;
    }
}
