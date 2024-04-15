package collections;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Write a static method accepting a Map<String, String> and returning true if some values have been used as keys as well.
 */
public class ValuesKeys {
    public static boolean valuesKeys(Map<String, String> map){
        Set<String> key = new HashSet<>(map.keySet()); // create a Set of only the key value of map
        Set<String> value = new HashSet<>(map.values());
        Set<String> intersection = new HashSet<>();

        for (String s1:key){
            for (String s2:value){
                if(s1==s2)
                    intersection.add(s1);
            }
        }
        if (intersection.isEmpty()){
            return false;
        }
        else {
            return true;
        }
    }
    /** optimized way
     * public static boolean valuesKeys(Map<String, String> map) {
     *         Set<String> intersection = new HashSet<>(map.keySet());
     *         intersection.retainAll(new HashSet<>(map.values()));
     *         return !intersection.isEmpty();
     *     }
     */
}
