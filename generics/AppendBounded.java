package generics;

import java.util.List;

public class AppendBounded {
    public static <T> void append(List<T> dst, List<? extends T> src){
        for (T t:src){
            dst.add(t);
        }
    }
}
