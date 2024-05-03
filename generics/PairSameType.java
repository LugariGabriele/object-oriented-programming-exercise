package generics;

/**
 * Modify the Pair class (see Pair.java) so that both values have the same type.
 * Furthermore, add a method void swap() that swaps the first and second elements of the pair.
 */
public class PairSameType<T> {
    T first;
    T second;

    public PairSameType(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public void swap(){
        T tmp=first;
        first=second;
        second=tmp;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
