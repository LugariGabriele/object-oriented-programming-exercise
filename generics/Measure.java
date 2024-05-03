package generics;

/**
 * Transform the Measurer interface (reported below) into a generic interface.
 * Additionally, implement two static generic methods returning the maximum and minimum values of an array (see prototype below),
 * using a Measurer object as the sorting criterion.
 * Note well: The measure() method of the Measurer interface associates every object to an easy to sort double value!
 */
public class Measure {
    public static <T> T max(T[] array, Measurer<T> measurer){
        T max =array[0];
        for (T t : array) {
            if (measurer.measure((t))> measurer.measure(max)){
                max=t;
            }
        }
        return max;
    }
    public static <T> T min(T[] array, Measurer<T> measurer){
        T min=array[0];
        for (T t : array) {
            if (measurer.measure(t)< measurer.measure(min)){
                min=t;
            }
        }
        return min;
    }
    public interface Measurer<T> {
        double measure(T obj);
    }
}
