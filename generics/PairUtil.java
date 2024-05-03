package generics;

/**
 * Write a generic static method whose argument is a Pair object.
 * The method returns a new pair, with the first and second element swapped. The method has the following prototype:
 */
public class PairUtil {
    public static <K, V> Pair<V, K> swap(Pair<K, V> src){
        return new Pair<>(src.getSecond(), src.getFirst());
    }
}
