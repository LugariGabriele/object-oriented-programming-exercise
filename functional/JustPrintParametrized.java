package functional;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Write a more general version of the JustPrint exercise allowing the two methods (i.e., justPrintList, justPrintMap)
 * not only to receive the collection of values to be printed but also the template for printing them (see Consumer and BiConsumer interfaces).
 * The prototypes are not reported because they are the answer.
 */
public class JustPrintParametrized {
    public static <T> void justPrintList(List<T>list ,Consumer<? super T> consumer){
        list.forEach(consumer);
    }

    public static <K,V> void justPrintMap(Map<K,V> map,BiConsumer<? super K, ? super V> biConsumer){
        map.forEach(biConsumer);
    }

}
