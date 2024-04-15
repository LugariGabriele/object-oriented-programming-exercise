package collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a static method accepting a Map<Integer, String> and returning a Map<String, Integer>
 * in which the original keys and values have been inverted. In case of repeated values (thus associated to multiple keys)
 * you can select one of the keys.
 * <p>
 * Examples:
 * <p>
 * invertMap({1: "Hello", 3: "World"}) → {"Hello": 1, "World": 3}
 * invertMap({1: "Hello", 3: "Hello"}) → {"Hello": 3}
 */
public class InvertMap {
    public static Map<String, Integer> invertMap(Map<Integer, String> src) {
        Map<String, Integer> dst = new HashMap<>();
        for (Map.Entry<Integer, String> i : src.entrySet()) {  //turn the map in a set for be possible add and remove things
            dst.put(i.getValue(), i.getKey());
        }
        return dst;
    }
}
