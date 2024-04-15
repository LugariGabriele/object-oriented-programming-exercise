package collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a static method accepting two Strings and returning true if they are anagrams, false otherwise.
 *
 * Two strings are considered anagrams if they contain the same characters but in a different order.
 * The order of characters doesn't matter, what matters is the frequency of each character in both strings.
 *
 * Examples:
 *
 * areAnagrams("dusty", "study") -> true
 * areAnagrams("world", "sky") -> false
 * areAnagrams("cheap", "") -> false
 */
public class CheckAnagrams {
    public static boolean areAnagrams(String first, String second){
        Map<Character,Integer>  first_map= numberOfChar(first);
        Map<Character,Integer>  second_map= numberOfChar(second);
        if (first_map.equals(second_map)){
            return true;
        }
        else {
            return false;
        }
    }
    public static Map<Character,Integer> numberOfChar(String string){
        Map<Character,Integer> frequency =new HashMap<>();
        for (Character c:string.toLowerCase().toCharArray()){
            int apparences =frequency.getOrDefault(c,0);
            frequency.put(c,apparences+1);

        }
        return frequency;
    }
}
