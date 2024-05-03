package generics;

/**
 * Define a generic class Pair<K,V> representing a generic pair of objects with different types.
 * The class must have two internal attributes named first and second of type K and V, respectively.
 * Constructor, getters, and setters are also required.
 */

public class Pair<K, V> {
    K first;
    V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
}

